/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chodzacz;

import java.util.Date;

/**
 * Class for storing data about route
 * @author Szymon
 */
public class Route implements RouteImp {
    private String name;
    private String type;
    private double[] coordinates;
    private int length;
    private String description;
    private String imgageUrl;
    private Date bestLapDate;
    private int bestLapTime;

    /**
     * Constructor for regular route
     * @param name - name of route
     * @param type - type of route
     * @param coordinates - coordinates of route (two geographical points)
     * @param length - length of route
     * @param description - description of route
     * @param imgageUrl - url to image of route
     * @param bestLapDate - date of best lap of route
     * @param bestLapTime - time of best lap of route
     */
    public Route(String name, String type, double[] coordinates, int length, String description, String imgageUrl, Date bestLapDate, int bestLapTime) {
        this.name = name;
        this.type = type;
        this.coordinates = coordinates;
        this.length = length;
        this.description = description;
        this.imgageUrl = imgageUrl;
        this.bestLapDate = bestLapDate;
        this.bestLapTime = bestLapTime;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getImgageUrl() {
        return imgageUrl;
    }

    @Override
    public Date getBestLapDate() {
        return bestLapDate;
    }

    @Override
    public int getBestLapTime() {
        return bestLapTime;
    }    

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name+";"+type+";"+coordinates[0]+":"+coordinates[1]+";"+length+";"+description+";"+bestLapTime;
    }
}