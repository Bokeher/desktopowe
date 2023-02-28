/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
            FileWriter fw = new FileWriter(file);
            fw.write(text);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ZapisDoPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
