/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chodzacz;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class for creating list of routes
 * @author Szymon
 */
public class Routes {
    private ArrayList<Route> routeList = new ArrayList<>();
    
    public Routes() {
        GetData gd = new GetData();
        String json = gd.get();
        
        String routes = json.substring(1, json.indexOf("\"users\": ["));

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> pos2 = new ArrayList<>();

        for(int i = 0; i < routes.length(); i++) {
            if(routes.charAt(i) == '{') pos.add(i);
            if(routes.charAt(i) == '}') pos2.add(i);
        }

        ArrayList<String> routesStr = new ArrayList<>();
        for(int i = 0; i < pos.size(); i++) {
            routesStr.add(json.substring(pos.get(i)+1, pos2.get(i)-1));
        }

        for(int i = 0; i < routesStr.size(); i++) {
            String route = routesStr.get(i);

            int length = Integer.parseInt(scrap(route, "length", "description"));
            String name = scrap(route, "name", "length");
            String description = scrap(route, "description", "type");
            String type = scrap(route, "type", "image_url");
            String imageUrl = scrap(route, "image_url", "best_lap");
            
            String cordsStr = route.substring(route.indexOf("[")+1, route.indexOf("]")-1);
            String[] temp = cordsStr.split(",") ;
            double[] cords = {Double.parseDouble(temp[0]), Double.parseDouble(temp[1])};
            
            String bestLapStr = route.substring(route.indexOf("\"best_lap\": [")+15, route.length()-5);
            bestLapStr = bestLapStr.replaceAll("\\s+","");
            String[] temp1 = bestLapStr.split(",") ;
            int bestLapTime = Integer.parseInt(temp1[1]); 

            long milis = Long.parseLong(temp1[1]);
            Date bestLapDate = new Date(milis);

            Route r = new Route(name, type, cords, length, description, imageUrl, bestLapDate, bestLapTime);
            routeList.add(r);
        }
    }

    /**
     * Support function for webscraping
     * @param text - json raw data
     * @param startingString - beginning String
     * @param endingString - ending String
     * @return needed data from scraping
     */
    private String scrap(String text, String startingString, String endingString) {
        startingString = "\""+startingString+"\":";
        endingString = "\""+endingString+"\"";
        int startingIndex = startingString.length()+2;
        int endingIndex = 9;
        
        if(startingString.equals("\"length\":")) {
            endingIndex -= 1;
            startingIndex -= 1;
        }

        return text.substring(text.indexOf(startingString)+startingIndex, text.indexOf(endingString)-endingIndex);
    }
    
    public ArrayList<Route> getRouteList() {
        return routeList;
    }
}
