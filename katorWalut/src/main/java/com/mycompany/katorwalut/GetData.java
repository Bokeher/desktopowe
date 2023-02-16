/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.katorwalut;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author adrianziebowski
 */
public class GetData {
    private String url = "https://api.agify.io?name=";
        
    public String get() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.nbp.pl/api/exchangerates/tables/a?format=xml"))
            .build();

        String res = "";
        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            res = response.body().toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        
        System.out.println("-> "+res);
        
        if(res == null) return null;
        
        

        return res;
    }
}
