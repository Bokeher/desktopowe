/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
     * nazwa funkcji: FileData
     * informacje: przechowuje dane odczytane z pliku
     * autor: Szymon Rychter
     */
public class FileData {
    private Date date; // date
    private String code; // PLN etc
    private String type; // s/k
    private double prize; // starting prize
    private double finalPrize; // prize after convertion
    private double multiplayer; // bid or ask

    public FileData(Date date, String code, String type, double prize, double finalPrize, double multiplayer) {
        this.date = date;
        this.code = code;
        this.type = type;
        this.prize = prize;
        this.finalPrize = finalPrize;
        this.multiplayer = multiplayer;
    }

    public Date getDate() {
        return date;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public double getPrize() {
        return prize;
    }

    public double getFinalPrize() {
        return finalPrize;
    }

    public double getMultiplayer() {
        return multiplayer;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        String dateStr = dtf.format(now);
        
        String partOfRes = dateStr+" | ";
        if(type.equals("s")) partOfRes += prize+" "+code+" -> "+finalPrize+" PLN ("+multiplayer+")";
        else partOfRes += prize+" PLN -> "+finalPrize+" "+code+" ("+multiplayer+")";
        return partOfRes+"\n";
    }
}
