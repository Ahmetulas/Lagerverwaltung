package com.Lagerverwaltung.InputOutput;

import com.Lagerverwaltung.InputOutput.Console;

/**
 * Lagerverwaltung
 * @author ahmetulas
 *
 * Beimhaltet ein Objekt vom Typ Console und führt dessen Methode befehle() aus.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Console console= new Console();
       console.befehle();
    }
}
