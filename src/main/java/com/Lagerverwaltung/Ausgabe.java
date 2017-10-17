package com.Lagerverwaltung;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Ausgabe {

    public void ausgabeStart(){
        System.out.println("Herzlich Willkommen bei Lagerverwaltung!\nUm die verfügbaren Befehle zu sehen geben Sie den Befehl 'help' ein. ");
    }


    public void ausgabeHelp(){
        System.out.println("____________________________________");
        System.out.println("help        verfügbare Befehle\neinlagern       einen Artikel im Lager deponieren");

    }
}
