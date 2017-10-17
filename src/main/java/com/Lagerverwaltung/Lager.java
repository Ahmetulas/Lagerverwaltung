package com.Lagerverwaltung;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Lager {

    ArrayList<Artikel> artikelListe;
    Ausgabe ausgabe;
    private int zeile;
    private int spalte;

    public Lager (){
        this.artikelListe = new ArrayList<Artikel>();
        ausgabe = new Ausgabe();
    }

    public ArrayList<Artikel> getArtikelListe(){
        return this.artikelListe;
    }


    public void zeichnen(int spalte, int zeile){

        int erg = spalte * zeile;
        this.zeile=zeile;
        this.spalte=spalte;
        int z=0;

        for(int i = 0; i < erg; i++){
            this.artikelListe.add(new Artikel(i,0,0,""));
        }
    }

    public void lagerZeigen(){
        int z=0;

        for(int x=0; x < this.zeile; x++){
            System.out.print("----------------");
        }
        for(int i= 0; i < spalte; i++){
            System.out.println();

            for(int y = 0; y<zeile; y++){
                if(this.artikelListe.get(z).getArtikelNummer()==0){
                    System.out.print("|\t" + this.getArtikelListe().get(z).getPosition() + "\t");
                    z++;
                }
                else {
                    System.out.print("| A.nr:" + this.getArtikelListe().get(z).getArtikelNummer() + "\t");
                    z++;
                }
            }
            System.out.print("|");
            System.out.println();

            for(int x=0; x<this.zeile; x++){
                System.out.print("----------------");
            }
        }
        System.out.println();

    }


    public boolean auslagern(int position){
        if(position<=this.artikelListe.size()){
            this.artikelListe.set(position,new Artikel(position,0,0,""));
            return true;
        }
        else return false;
    }

    public void einlagern(int position,Artikel artikel){
        this.artikelListe.set(position,artikel);
    }

    public int position(int artikelnummer){
        for (int i = 0; i < this.artikelListe.size();i++){
            if(this.artikelListe.get(i).getArtikelNummer()==artikelnummer){
                return this.artikelListe.get(i).getPosition();
            }else return 0;
        }return 0;
    }

    public void artikelInformation(){
        for(int i=0; i<this.artikelListe.size(); i++){
            if(this.artikelListe.get(i).getArtikelNummer()!=0){
                this.artikelListe.get(i).informationAusgeben();
            }
        }
    }



}
