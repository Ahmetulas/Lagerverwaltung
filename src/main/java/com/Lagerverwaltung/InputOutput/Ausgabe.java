package com.Lagerverwaltung.InputOutput;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Ausgabe {

    public void ausgabeStart(){
        this.clearScreen();
        System.out.println("Herzlich Willkommen bei Lagerverwaltung!\nUm die verfügbaren Befehle zu sehen geben Sie den Befehl 'hilfe' ein. ");
        System.out.println("Als erstes müssen Sie das Lager konfigurieren! ");
    }


    public void ausgabeHelp(){
        this.clearScreen();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("hilfe       -       zeigt verfügbare Befehle an");
        System.out.println("konfig      -       Konfiguriert das Lager ");
        System.out.println("einlagern   -       Artikel in den Lager importieren");
        System.out.println("auslagern   -       Artikel aus dem Lager entfernen");
        System.out.println("position    -       zeigt die jeweiligen Positionen der Artikeln an");
        System.out.println("inventar    -       zeigt alle Artikeln mit deren Informationen an");
        System.out.println("lager       -       Lager darstellen");
        System.out.println("exit        -       beendet das Programm");
        System.out.println("------------------------------------------------------------------------");

    }

    public void clearScreen(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void eingabeZeilenEingeben(){
        System.out.println("Aus wievielen Zeilen soll das Lager bestehen (z.Bsp.: 3)?");
    }

    public void eingabeSpaltenEingeben(){
        System.out.println("Nun geben Sie die Spalten an (z.Bsp: 3):");
    }

    public void eingabePosition(){
        System.out.println("Geben Sie die Position ein (z.Bsp.: 7): ");
    }
    public void eingabeArtikelNummer(){
        System.out.println("Artikelnummer (z.Bsp.: 2382):");
    }

    public void eingabeVerpackungsEinheit(){
        System.out.println("Verpackungseinheit (z.Bsp.: 5):");
    }
    public void eingabeArtikelBezeichnung(){
        System.out.println("Artikelbezeichnung (z.Bsp.: MacBook) : ");
    }
    public void eingabeLieferantName(){
        System.out.println("Lieferant (z.Bsp.: DHL):" );
    }
    public void eingabeLieferantOrt(){
        System.out.println("Ort (z.Bsp.: Innsbruck): ");
    }
    public void eingabeLieferantTel(){
        System.out.println("TelNr. (z.Bsp.: 0546/793748): ");
    }

    public void ausgabeLagerWirdGezeichnet(){
        this.clearScreen();
        System.out.println("Das Lager wird unten abgebildet:");
        System.out.println("Information:\n Wenn das aktuelle Position leer ist, sieht man die Position. Befindet sich jedoch ein Artikel, \n so wird die Artikelnummer angezeigt.");
        System.out.println();
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

