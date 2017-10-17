package com.Lagerverwaltung;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Ausgabe {

    public void ausgabeStart(){
        System.out.println("Herzlich Willkommen bei Lagerverwaltung!\nUm die verfügbaren Befehle zu sehen geben Sie den Befehl 'help' ein. ");
    }


    public void ausgabeHelp(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("help        -       zeigt verfügbare Befehle an");
        System.out.println("einlagern   -       einen Artikel in den Lager deponieren");
        System.out.println("auslagern   -       einen Artikel aus dem Lager entfernen");
        System.out.println("position    -       zeigt die jeweiligen Positionen der Artikeln an");
        System.out.println("inventar    -       zeigt alle Artikeln mit deren Informationen an");
        System.out.println("konfig      -       Konfiguriert das Lager ");
        System.out.println("------------------------------------------------------------------------");

    }

    public void eingabeZeilenEingeben(){
        System.out.println("Aus wievielen Zeilen soll das Lager bestehen? (z.Bsp.: 3)");
    }

    public void eingabeSpaltenEingeben(){
        System.out.println("Nun geben Sie die Spalten an: (z.Bsp: 3)");
    }

    public void eingabePosition(){
        System.out.println("Geben Sie die Position ein: (z.Bsp.: 7) ");
    }
    public void eingabeArtikelNummer(){
        System.out.println("Artikelnummer: (z.Bsp.: 2382)");
    }

    public void eingabeVerpackungsEinheit(){
        System.out.println("Verpackungseinheit: (z.Bsp.: 5)");
    }
    public void eingabeArtikelBezeichnung(){
        System.out.println("Artikelbezeichnung");
    }
    public void eingabeLieferantName(){
        System.out.println("Lieferant: (z.Bsp.: DHL)" );
    }
    public void eingabeLieferantOrt(){
        System.out.println("Ort: (z.Bsp.: Innsbruck)");
    }
    public void eingabeLieferantTel(){
        System.out.println("TelNr.: (z.Bsp.: 0546/793748)");
    }

    public void ausgabeLagerWirdGezeichnet(){
        System.out.println("Das Lager wird unten abgebildet:");
    }
    public void ausgabeFehler(String fehler){
        System.out.println(fehler);
    }

    public void ausgabePosition(int position){
        System.out.println("Position: "+position);
    }

    public void ausgabeAusgelagert(){
        System.out.println("Artikel wurde erfolgreich ausgelagert!");
    }

    public void ausgabeEingelagert(){
        System.out.println("Artikel wurde erfolgreich eingelagert");
    }


}

