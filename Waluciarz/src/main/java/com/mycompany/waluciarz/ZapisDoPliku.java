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
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrianziebowski
 */
public class ZapisDoPliku {
    private File file;

    public ZapisDoPliku(File f) {
        this.file = f;
    }

    public void zapisz(String text) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(text+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ZapisDoPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Waluta> odczyt() {
        String row = "";
        ArrayList<Waluta> listaSprzedazy = new ArrayList<>();
        ArrayList<Waluta> listaKupna = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                row = sc.nextLine();
                String[] data = row.split(";");
                Waluta waluta = null;
                if(data[0].equals("k")) {
                  //kupno
//                  waluta = new Waluta(row, row, row, row, row)
                } else {
                  //sprzedaz
                  
                }
//                Waluta waluta = new Waluta(data[0], data[], row, row)
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZapisDoPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] arr = res.split(";");
        if(arr.length == 0) return null;
        
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        
        return list;
    }
    
}
