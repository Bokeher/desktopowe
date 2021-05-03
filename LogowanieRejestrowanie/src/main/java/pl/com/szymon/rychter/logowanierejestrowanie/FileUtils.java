/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.logowanierejestrowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Szymon
 */
public class FileUtils {
    public void savePasswordToFile(String username, String email, String pass, String file){
        
        try{
            FileWriter fw = new FileWriter(new File(file), true);
            fw.write(username+":"+email+":"+pass+"\n");
            fw.close();
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
    
    public String loadData(String f){
        try{
            Scanner sc = new Scanner(new File(f));
            String data = "";
            while(sc.hasNext()){
                data += sc.nextLine()+";";
            }
            return data;
        }catch(FileNotFoundException ex){
            return ex.toString();
        }
    }
}
