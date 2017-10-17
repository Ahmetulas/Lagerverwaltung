package com.Lagerverwaltung;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Lager {

    ArrayList<Artikel> artikelListe;
    private int zeile;
    private int spalte;

    public Lager (){
        this.artikelListe = new ArrayList<Artikel>();
    }

    public ArrayList getArtikelListe(){
        return this.artikelListe;
    }


    public void zeichnen(int spalte, int zeile){

        for(int i =0; i<(this.spalte*this.zeile); i++){
            this.getArtikelListe().add(new Artikel());
        }
        this.zeile=zeile;
        this.spalte=spalte;
        for(int x=0; x<this.zeile; x++){
            System.out.print("----------------");
        }
        for(int i= 0; i < spalte; i++){
            System.out.println();

            for(int y = 0; y<zeile; y++){
                System.out.print("|    "+this.getArtikelListe().get(y)+ "\t");

            }
            System.out.print("|");
            System.out.println();
            for(int x=0; x<this.zeile; x++){
                System.out.print("----------------");
            }
        }
        System.out.println();
    }


}
