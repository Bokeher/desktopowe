/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chodzacz;

import java.util.Date;

/**
 * Interface for Route class
 * @author Szymon
 */
public interface RouteImp {
    public String getName();
    public String getType();
    public double[] getCoordinates();
    public int getLength() ;
    public String getDescription();
    public String getImgageUrl();
    public Date getBestLapDate();
    public int getBestLapTime();
}