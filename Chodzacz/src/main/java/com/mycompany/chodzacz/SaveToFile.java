/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chodzacz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Saves text to file
 * @author Szymon
 */
public class SaveToFile {
    /**
     * Method that saves text to file
     * @param f - file in which data will be saved
     * @param text - text that will be saved
     */
    public void save(File f, String text) {
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(text);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}