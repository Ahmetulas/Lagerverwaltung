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

    public ArrayList<Artikel> getArtikelListe(){
        return this.artikelListe;
    }


    public void zeichnen(int spalte, int zeile){

        int erg = spalte * zeile;
        this.zeile=zeile;
        this.spalte=spalte;
        int z =0;
        int ahmet=0;

        for(int i = 0; i < erg; i++){
            this.artikelListe.add(new Artikel(i,3,"ahmet"));
        }
        for(int x=0; x < this.zeile; x++){
            System.out.print("--------");
        }
        for(int i= 0; i < spalte; i++){
            System.out.println();

            for(int y = 0; y<zeile; y++){

                for(; z < this.artikelListe.size(); z++)
                {
                    z = ahmet;
                    System.out.print("|    " + this.getArtikelListe().get(i).getArtikelNummer() + "\t");
                }
            }
            System.out.print("|");
            System.out.println();
            for(int x=0; x<this.zeile; x++){
                System.out.print("--------");
            }
        }
        System.out.println();
    }


}
