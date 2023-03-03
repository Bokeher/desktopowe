/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * nazwa klasy: ZapisDoPliku
 * informacje: zapisuje oraz odczytuje z pliku
 * autor: Szymon Rychter
 */
public class ZapisDoPliku {
    private File file;

    public ZapisDoPliku(File f) {
        this.file = f;
    }
    /**
     * nazwa funkcji: zapisz
     * argumenty: String text - tekst ktory ma zostac zapisany
     * typ  zwracany: brak
     * informacje: zapisuje do pliku tekst
     * autor: Szymon Rychter
     */
    public void zapisz(String text) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(text+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ZapisDoPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * nazwa funkcji: odczyt
     * argumenty: brak
     * typ  zwracany: Map<String, ArrayList<FileData>> - mapa ktora ma 2 listy. 1 lista ma listeSprzedazy druga ma listeKupna
     * informacje: odczytuje z pliku
     * autor: Szymon Rychter
     */
    public Map<String, ArrayList<FileData>> odczyt() {
        String row = "";
        ArrayList<FileData> listaSprzedazy = new ArrayList<>();
        ArrayList<FileData> listaKupna = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                row = sc.nextLine();
                String[] data = row.split(";");
                
                Date date = new Date(data[0]);
                String code = data[1];
                String type = data[2];
                double prize = Double.parseDouble(data[3]);
                double finalPrize = Double.parseDouble(data[4]); 
                double multiplayer = Double.parseDouble(data[5]);
                FileData fileData = new FileData(date, code, type, prize, finalPrize, multiplayer);
                
                System.out.println(fileData.getType());
                System.out.println(data[2]);
                
                if(fileData.getType().equals("k")) {
                  //kupno
                  //public FileData(Date date, String code, String type, double prize, double finalPrize, double multiplayer) {
                  listaKupna.add(fileData);
                } else {
                  //sprzedaz
                  listaSprzedazy.add(fileData);
                  
                }
//                Waluta waluta = new Waluta(data[0], data[], row, row)
            }
            System.out.println(listaSprzedazy.get(0).getPrize());
            System.out.println(listaKupna.get(0).getPrize());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZapisDoPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Map<String, ArrayList<FileData>> map = new HashMap<>();
        map.put("listaKupna", listaKupna);
        map.put("listaSprzedazy", listaSprzedazy);
        
        return map;
    }
    
}
