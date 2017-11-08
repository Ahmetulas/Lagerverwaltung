package com.Lagerverwaltung.InputOutput;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Ausgabe {

  public String ausgabeStart() {
    this.clearScreen();
    return "Herzlich Willkommen bei Lagerverwaltung!\nUm die verfügbaren Befehle zu sehen geben Sie den Befehl 'hilfe' ein.\n "
        + "Als erstes müssen Sie das Lager konfigurieren! ";
  }

  public String ausgabeHelp() {
    this.clearScreen();
    String hilfe = "------------------------------------------------------------------------\n"
        + "hilfe       -       zeigt verfügbare Befehle an\n" + "konfig      -       Konfiguriert das Lager\n"
        + "einlagern   -       Artikel in den Lager importieren\n"
        + "auslagern   -       Artikel aus dem Lager entfernen\n"
        + "position    -       zeigt die jeweiligen Positionen der Artikeln an\n"
        + "inventar    -       zeigt alle Artikeln mit deren Informationen an\n"
        + "lager       -       Lager darstellen\n" + "exit        -       beendet das Programm\n"
        + "------------------------------------------------------------------------";
    return hilfe;

  }

  public String clearScreen() {
    return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
  }

  public String eingabeZeilenEingeben() {
    return "Aus wievielen Zeilen soll das Lager bestehen (z.Bsp.: 3)?";
  }

  public String eingabeSpaltenEingeben() {
    return "Nun geben Sie die Spalten an (z.Bsp: 3):";
  }

  public String eingabePosition() {
    return "Geben Sie die Position ein (z.Bsp.: 7): ";
  }

  public String eingabeArtikelNummer() {
    return "Artikelnummer (z.Bsp.: 2382):";
  }

  public String eingabeVerpackungsEinheit() {
    return "Verpackungseinheit (z.Bsp.: 5):";
  }

  public String eingabeArtikelBezeichnung() {
    return "Artikelbezeichnung (z.Bsp.: MacBook) : ";
  }

  public String eingabeLieferantName() {
    return "Lieferant (z.Bsp.: DHL):";
  }

  public String eingabeLieferantOrt() {
    return "Ort (z.Bsp.: Innsbruck): ";
  }

  public String eingabeLieferantTel() {
    return "TelNr. (z.Bsp.: 0546/793748): ";
  }

  public String ausgabeLagerWirdGezeichnet() {
    this.clearScreen();
    String ausgabe = "Das Lager wird unten abgebildet:\n"
        + "Information:\n Wenn das aktuelle Position leer ist, sieht man die Position. Befindet sich jedoch ein Artikel, \n so wird die Artikelnummer angezeigt.";
    return ausgabe;
  }

  public String ausgabeFehler(String fehler) {
    return fehler;
  }

  public String ausgabePosition(int position) {
    return "Position: " + position;
  }

  public String ausgabeAusgelagert() {
    return "Artikel wurde erfolgreich ausgelagert!";
  }

  public String ausgabeEingelagert() {
    return "Artikel wurde erfolgreich eingelagert";
  }

}
