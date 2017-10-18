package com.Lagerverwaltung;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by ahmetulas on 18.10.17.
 */
public class LagerTest {

    Lager lager = new Lager();
    Artikel artikel = new Artikel(4,4,"iphone", new Lieferant());


    @org.junit.Test
    public void getArtikelListe() throws Exception {
    }

    @org.junit.Test
    public void zeichnen() throws Exception {
       lager.zeichnen(3,3);
       assertEquals(9,lager.getArtikelListe().size());
    }


    @org.junit.Test
    public void inhalt() throws Exception {
        lager.zeichnen(4,4);
        lager.einlagern(3,this.artikel);

        lager.inhalt(3);
        assertEquals(lager.getArtikelListe().get(3).getArtikelNummer(),4);
    }

    @org.junit.Test
    public void auslagern() throws Exception {
        lager.zeichnen(2,4);
        lager.einlagern(2,new Artikel(3,3,"hallo",new Lieferant()));
        assertEquals(3,lager.getArtikelListe().get(2).getArtikelNummer());
        lager.auslagern(2);
        assertEquals(0,lager.getArtikelListe().get(2).getArtikelNummer());

    }

    @org.junit.Test
    public void einlagern() throws Exception {
        lager.zeichnen(2,4);
        assertEquals(true,lager.einlagern(1,artikel));
    }

    @org.junit.Test
    public void position() throws Exception {
        lager.zeichnen(2,4);
        lager.einlagern(1,this.artikel);

       assertEquals(1,this.artikel.getPosition());
       assertEquals(8,lager.getArtikelListe().size());
       assertEquals(false, lager.einlagern(30,this.artikel));
    }


}