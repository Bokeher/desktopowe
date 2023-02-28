/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

/**
 *
 * @author adrianziebowski
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

    @Override
    public String toString() {
        return currency+";"+code+";"+bid +";"+ask+";"+askPrize+";"+bidPrize;
    }
    

    public double getBidPrize() {
        return bidPrize;
    }

    public double getAskPrize() {
        return askPrize;
    }
    
    public void calcBidPrize(double amount) {
        bidPrize = amount * bid;
    }
    
    public void calcAskPrize(double amount) {
        bidPrize = amount / ask;
    }
}
