/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.listazakupw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Szymon
 */
public class FileUtils {
    public void saveToFile(String text, String file){
        try{
            FileWriter fw = new FileWriter(file, true); 
            fw.write(text);
            fw.close();
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
    
    public String loadFileData(String file){
        try {
            String message = "";
            Scanner sc = new Scanner(new File(file));
            
            while(sc.hasNext()){
                message += sc.nextLine().replaceAll(";", "\t")+"\n";
            }
            return message;
        } catch (FileNotFoundException ex) {
            return ex.toString();
        }
       
    }
}
