package com.Lagerverwaltung;

/**
 * Created by ahmetulas on 17.10.17.
 */
public class Artikel {

    private String artikelBezeichnung;
    private int artikelNummer;
    private int verpackungsEinheit;
    private int position;
    private Lieferant lieferant;

    public Artikel(int position,int artikelNummer, int verpackungsEinheit, String artikelBezeichnung){
        this.verpackungsEinheit=verpackungsEinheit;
        this.artikelNummer = artikelNummer;
        this.artikelBezeichnung = artikelBezeichnung;
        this.position=position;
        this.lieferant= new Lieferant();
    }

    public Artikel(int artikelNummer, int verpackungsEinheit, String artikelBezeichnung, Lieferant lieferant){
        this.verpackungsEinheit=verpackungsEinheit;
        this.artikelNummer = artikelNummer;
        this.artikelBezeichnung = artikelBezeichnung;
        this.lieferant = lieferant;
    }

    public Lieferant getLieferant(){
        return this.lieferant;
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

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int postition){
        this.position=postition;
    }

    public void informationAusgeben(){
        System.out.println("-----------------------------------------");
        System.out.println("Artikelnummer: "+ this.artikelNummer);
        System.out.println("Artikelbezeichnung: "+ this.artikelBezeichnung);
        System.out.println("Verpackungseinheit: "+ this.verpackungsEinheit);
        System.out.println("Lieferantinformationen: ");
        System.out.println("       Name:"+this.lieferant.getName());
        System.out.println("       Ort: " + this.lieferant.getOrt());
        System.out.println("       TelNr: "+this.lieferant.getTelNr());
        System.out.println("Position: "+ this.position);
        System.out.println("-----------------------------------------");

    }
}
