package com.Lagerverwaltung;

import java.util.Scanner;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Console {

    Scanner scan;
    Scanner scanint;
    Lager lager;
    Ausgabe ausgabe;

    public Console (){
        ausgabe = new Ausgabe();
        lager = new Lager();
        scan = new Scanner (System.in);
        scanint= new Scanner(System.in);
    }

    public void befehle(){
        ausgabe.ausgabeStart();
        this.konfigurieren();
        String befehl="";

        while(!befehl.equals("exit")) {
            System.out.println("Befehl: ");
            befehl = scan.nextLine();

            switch (befehl) {
                case "konfig":
                    this.konfigurieren();
                    break;

                case "einlagern":
                    this.einlagern();
                    break;

                case "auslagern":
                    this.auslagern();
                    break;

                case "position":
                    this.position();
                    break;

                case "inventar":
                    lager.artikelInformation();
                    break;

                case "help":
                    ausgabe.ausgabeHelp();
                    break;

                case "lager":
                    lager.lagerZeigen();

                    break;

                case "inhalt":
                    this.inhalt();
                    break;
            }
        }
    }


    public void inhalt(){
        ausgabe.eingabePosition();
        int position=scanint.nextInt();
        lager.inhalt(position).informationAusgeben();
    }

    public void auslagern(){
        ausgabe.eingabePosition();
        int position= scanint.nextInt();
        lager.auslagern(position);
        if(lager.auslagern(position)){
            ausgabe.ausgabeAusgelagert();
        }else ausgabe.ausgabeFehler("Die eingegebene Position wurde nicht gefunden!");
    }

    public void einlagern(){
        ausgabe.eingabePosition();
        int position= scanint.nextInt();
        ausgabe.eingabeArtikelNummer();
        int artikelnummer= scanint.nextInt();
        ausgabe.eingabeVerpackungsEinheit();
        int verpackungseinheit = scanint.nextInt();
        ausgabe.eingabeArtikelBezeichnung();
        String artikelBezeichnung= scan.nextLine();
        ausgabe.eingabeLieferantName();
        String lieferName = scan.nextLine();
        ausgabe.eingabeLieferantOrt();
        String lieferantOrt= scan.nextLine();
        ausgabe.eingabeLieferantTel();
        String lieferantTel = scan.nextLine();
        Lieferant lieferant = new Lieferant(lieferName,lieferantOrt,lieferantTel);
        if(lager.einlagern(position,new Artikel(artikelnummer,verpackungseinheit,artikelBezeichnung,lieferant))){
            lager.einlagern(position,new Artikel(artikelnummer,verpackungseinheit,artikelBezeichnung,lieferant));
            ausgabe.ausgabeEingelagert();
        }else ausgabe.ausgabeFehler("Artikel könnte nicht eingelagert werden! Überprüfen Sie die Position!");

    }

    public void konfigurieren(){
        ausgabe.eingabeZeilenEingeben();
        int zahl1= scanint.nextInt();
        ausgabe.eingabeSpaltenEingeben();
        int zahl2= scanint.nextInt();
        ausgabe.ausgabeLagerWirdGezeichnet();
        lager.zeichnen(zahl2,zahl1);
        lager.lagerZeigen();
    }

    public void position(){
        ausgabe.eingabeArtikelNummer();
        int artikelnummer= scanint.nextInt();
        if(lager.position(artikelnummer)!=0){
           ausgabe.ausgabePosition(lager.position(artikelnummer));
        }else ausgabe.ausgabeFehler("Artikel wurde nicht gefunden!");
    }



}
