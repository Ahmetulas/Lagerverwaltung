package com.Lagerverwaltung;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Lieferant {

    private String name;
    private String ort;

    public Lieferant(String name, String ort){
        this.name=name;
        this.ort=ort;
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
