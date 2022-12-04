/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chodzacz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Webscraps data from database
 * @author Szymon
 */
public class GetData {
    String url = "https://my-json-server.typicode.com/nsaurr/dbforproject/db";
    InputStream is;

    /**
     * Method that webscraps data
     * @return webscraped json data
     */
    public String get() {
        try {
            is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();

            int cp;
            while((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            is.close();
            
            return sb.toString();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }

}