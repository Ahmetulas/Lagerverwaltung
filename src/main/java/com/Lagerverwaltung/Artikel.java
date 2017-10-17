package com.Lagerverwaltung;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Artikel {

    private String artikelBezeichnung;
    private int artikelNummer;
    private int verpackungsEinheit;

    public Artikel(){
    }

    public Artikel(int artikelNummer, int verpackungsEinheit, String artikelBezeichnung){
        this.verpackungsEinheit=verpackungsEinheit;
        this.artikelNummer = artikelNummer;
        this.artikelBezeichnung = artikelBezeichnung;
    }

    public String getBezeichnung(){
        return this.artikelBezeichnung;
    }

    public void setArtikelBezeichnung(String bezeichnung){
        this.artikelBezeichnung = bezeichnung;
    }

    public int getArtikelNummer(){
        return this.artikelNummer;
    }

    public void setArtikelNummer(int artikelNummer) {
        this.artikelNummer=artikelNummer;
    }

    public int getVerpackungsEinheit(){
        return this.verpackungsEinheit;
    }
    public void setVerpackungsEinheit(int verpackungsEinheit){
        this.verpackungsEinheit=verpackungsEinheit;
    }
}
