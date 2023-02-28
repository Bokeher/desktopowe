/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author adrianziebowski
 */
public class GetData {
    private final String url = "https://api.nbp.pl/api/exchangerates/tables/c?format=json";
        
    public ArrayList<Waluta> get() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();

        String res = "";
        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            res = response.body().toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        JSONObject json = new JSONObject(res.substring(1, res.length()-1));
        JSONArray jsonArr = json.getJSONArray("rates");
        
        ArrayList<Waluta> listaWalut = new ArrayList();
        
        for (int i = 0; i < jsonArr.length(); i++) {
            JSONObject elem = (JSONObject) jsonArr.get(i);
            
            String code = elem.get("code").toString();
            String currency = elem.get("currency").toString();
            String bid = elem.get("bid").toString();
            String ask = elem.get("ask").toString();
            Waluta waluta = new Waluta(code, currency, bid, ask);
            
            listaWalut.add(waluta);
        }

        return listaWalut;
    }
}
