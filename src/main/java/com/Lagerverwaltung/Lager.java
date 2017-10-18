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


    /**
     *
     * @param spalte 
     * @param zeile
     */

    public void zeichnen(int spalte, int zeile){

        int erg = spalte * zeile;
        this.zeile=zeile;
        this.spalte=spalte;
        this.artikelListe = new ArrayList<Artikel>();

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
                    System.out.print("|    "+this.getArtikelListe().get(z).getPosition()+"(leer)"+ "\t");
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

    public Artikel inhalt(int position){
        for(int i=0; i<this.artikelListe.size(); i++){
            if(this.artikelListe.get(i).getPosition()==position){
                return this.artikelListe.get(i);
            }
        }return null;
    }

    public boolean auslagern(int position){
        if(position <= this.artikelListe.size()){
            this.artikelListe.set(position,new Artikel(position,0,0,""));
            return true;
        }
        else return false;
    }

    public boolean einlagern(int position,Artikel artikel){

        if((position >= 0 && position < this.artikelListe.size()) && artikel != null){
            this.artikelListe.set(position,artikel);
            artikel.setPosition(position);
            return true;
        }else return false;

    }

    public int position(int artikelnummer){
        int i=0;
        for (; i < this.artikelListe.size();i++){
            if(this.artikelListe.get(i).getArtikelNummer()==artikelnummer){
                return this.artikelListe.get(i).getPosition();
            }

        }return 0;
    }

    public void artikelInformation(){
            ausgabe.clearScreen();
            for(int i=0; i<this.artikelListe.size(); i++){
                if(this.artikelListe.get(i).getArtikelNummer()!=0){
                    this.artikelListe.get(i).informationAusgeben();
                }
            }

    }



}
