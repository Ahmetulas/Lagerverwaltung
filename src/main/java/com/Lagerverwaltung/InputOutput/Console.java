package com.Lagerverwaltung.InputOutput;

import com.Lagerverwaltung.Verwaltung.Artikel;
import com.Lagerverwaltung.Verwaltung.Lager;
import com.Lagerverwaltung.Verwaltung.Lieferant;
import presentation.*;
import presentation.CommandLine;
import presentation.IUserInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ahmetulas on 17.10.17.
 *
 *Diese Klasse ist die Schnittstelle für den Benutzer. Hier werden
 */
public class Console {

    IUserInterface iu = new CommandLine();
  Scanner scan;
  Scanner scanint;
  Lager lager;
  Ausgabe ausgabe;

  public Console() {
    ausgabe = new Ausgabe();
    lager = new Lager();
    scan = new Scanner(System.in);
    scanint = new Scanner(System.in);
  }

  public void befehle() {
    iu.displayMessage(ausgabe.ausgabeStart());
    this.konfigurieren();
    String befehl = "";

    while (!befehl.equals("exit")) {
      iu.displayMessage("Befehl: ");
      befehl = scan.nextLine().toLowerCase();

      switch (befehl) {
      case "konfig":
        this.konfigurieren();
        break;

      case "einlagern":
        iu.displayMessage(ausgabe.clearScreen());
        this.einlagern();
        break;

      case "auslagern":
        iu.displayMessage(ausgabe.clearScreen());
        this.auslagern();
        break;

      case "position":
        iu.displayMessage(ausgabe.clearScreen());
        this.position();
        break;

      case "inventar":
        lager.artikelInformation();
        break;

      case "hilfe":
        iu.displayMessage(ausgabe.ausgabeHelp());
        break;

      case "lager":
        iu.displayMessage(ausgabe.clearScreen());
        lager.lagerZeigen();
        break;

      case "inhalt":
        iu.displayMessage(ausgabe.clearScreen());
        this.inhalt();
        break;
      }
    }
  }

  public void inhalt() {
    iu.displayMessage(ausgabe.eingabePosition());
    int position = (int) iu.askForNumber();
    if (lager.inhalt(position).getArtikelNummer() == 0) {
      iu.displayMessage(ausgabe.ausgabeFehler("leer"));
    } else
      lager.inhalt(position).informationAusgeben();
  }

  public void auslagern() {
    iu.displayMessage(ausgabe.eingabePosition());
    int position = (int) iu.askForNumber();
    lager.auslagern(position);
    if (lager.auslagern(position)) {
      iu.displayMessage(ausgabe.ausgabeAusgelagert());
    } else
      iu.displayMessage(ausgabe.ausgabeFehler("Die eingegebene Position wurde nicht gefunden!"));
  }

  public void einlagern(){
        iu.displayMessage(ausgabe.eingabePosition());
        int position= (int) iu.askForNumber();
        iu.displayMessage(ausgabe.eingabeArtikelNummer());
        int artikelnummer= (int) iu.askForNumber();
        iu.displayMessage(ausgabe.eingabeVerpackungsEinheit());
        int verpackungseinheit = (int) iu.askForNumber();
        iu.displayMessage(ausgabe.eingabeArtikelBezeichnung());
        String artikelBezeichnung= iu.askForString(true);
        iu.displayMessage(ausgabe.eingabeLieferantName());
        String lieferName = iu.askForString(true);
        iu.displayMessage(ausgabe.eingabeLieferantOrt());
        String lieferantOrt= iu.askForString(true);
        iu.displayMessage(ausgabe.eingabeLieferantTel());
        String lieferantTel = iu.askForString(true);
        Lieferant lieferant = new Lieferant(lieferName,lieferantOrt,lieferantTel);
        if(lager.einlagern(position,new Artikel(artikelnummer,verpackungseinheit,artikelBezeichnung,lieferant))){
            lager.einlagern(position,new Artikel(artikelnummer,verpackungseinheit,artikelBezeichnung,lieferant));
            iu.displayMessage(ausgabe.ausgabeEingelagert());
        }else iu.displayMessage(ausgabe.ausgabeFehler("Artikel könnte nicht eingelagert werden! Überprüfen Sie die Position!"));
    }

  public void konfigurieren() {
    iu.displayMessage(ausgabe.eingabeZeilenEingeben());
    int zahl1 = (int) iu.askForNumber();
    iu.displayMessage(ausgabe.eingabeSpaltenEingeben());
    int zahl2 = (int) iu.askForNumber();
    iu.displayMessage(ausgabe.ausgabeLagerWirdGezeichnet());
    lager.zeichnen(zahl2, zahl1);
    lager.lagerZeigen();
  }

  public void position() {
    iu.displayMessage(ausgabe.eingabeArtikelNummer());
    int artikelnummer = (int) iu.askForNumber();
    if (lager.position(artikelnummer) != 0) {
      iu.displayMessage(ausgabe.ausgabePosition(lager.position(artikelnummer)));
    } else
      iu.displayMessage(ausgabe.ausgabeFehler("Artikel wurde nicht gefunden!"));
  }

  //----------------------------

}
