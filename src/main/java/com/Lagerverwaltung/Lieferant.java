package com.Lagerverwaltung;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Lieferant {

    private String name;
    private String ort;
    private String telNr;

    public Lieferant(String name, String ort, String telNr){
        this.name=name;
        this.ort=ort;
        this.telNr=telNr;
    }

    public Lieferant(){

    }

    public String getTelNr(){
        return this.telNr;
    }

    public void setTelNr(String telNr){
        this.telNr=telNr;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getOrt(){
        return this.ort;
    }

    public void setOrt(String ort){
        this.ort = ort;
    }
}
