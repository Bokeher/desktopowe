/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

/**
 * nazwa funkcji: waluta
 * informacje: przechowuje informacje o walucie
 * autor: Szymon Rychter
 */
public class Waluta {
    private String code;
    private String currency;
    private double bid;
    private double ask;
    private double bidPrize;
    private double askPrize;
    
    public Waluta(String code, String currency, String bid, String ask) {
        this.code = code;
        this.currency = currency;
        this.bid = Double.parseDouble(bid);
        this.ask = Double.parseDouble(ask);
    }    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getBidPrize() {
        return bidPrize;
    }

    public double getAskPrize() {
        return askPrize;
    }
    
    /**
     * nazwa funkcji: calcBidPrize
     * argumenty: double amount - wartosc do przeliczenia
     * typ  zwracany: brak
     * informacje: oblicza cene sprzedazy
     * autor: Szymon Rychter
     */
    public void calcBidPrize(double amount) {
        bidPrize = amount * bid;
        bidPrize = (double) Math.round((bidPrize*100))/100;
    }
    /**
     * nazwa funkcji: calcAskPrize
     * argumenty: double amount - wartosc do przeliczenia
     * typ  zwracany: brak
     * informacje: oblicza cene kupna
     * autor: Szymon Rychter
     */
    public void calcAskPrize(double amount) {
        askPrize = amount / ask;
        askPrize = (double) Math.round((askPrize*100))/100;
    }
}
