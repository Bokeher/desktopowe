/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

import java.util.Date;

/**
 *
 * @author adrianziebowski
 */
public class ReadData {
    private Date date;
    private String code;
    private String type;
    private String currency;
    private double multiplayer;
    private double finalPrize;
    private double prize;

    public ReadData(Date date, String code, String type, String currency, double multiplayer, double finalPrize, double prize) {
        this.date = date;
        this.code = code;
        this.type = type;
        this.currency = currency;
        this.multiplayer = multiplayer;
        this.finalPrize = finalPrize;
        this.prize = prize;
    }
    
    
}
