/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.kolkokrzyzyk;

/**
 *
 * @author Szymon
 */
public class Player {
    private String sign = "";
    private String name = "";
    private boolean computer = false;

    public Player(String sign, String name){
        this.name = name;
        this.sign = sign;
    }
    
    public String getSign() {
        return sign;
    }

    public String getName() {
        return name;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setName(String name) {
        this.name = name;
    }  

    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }
    
    
}
