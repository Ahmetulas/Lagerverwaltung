package com.Lagerverwaltung.InputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ahmetulas on 25.10.17.
 */
public class CommandLine implements IUserInterface {

    Scanner scan = new Scanner(System.in);
    @Override
    public void displayMessage(String message) {
        System.out.println(message);

    }

    @Override
    public int displayDialog(String message) {
        System.out.println(message);
        String input = askForString(false);
        if (input.equals("yes") || input.equals("y")) {
            return IUserInterface.MENU_YES;
        } else if (input.equals("no") || input.equals("n")) {
            return IUserInterface.MENU_NO;
        } else if (input.equals("cancel") || input.equals("c")) {
            return IUserInterface.MENU_CANCEL;
        } else {
            return IUserInterface.INVALID_NUMBER;
        }

        //		Number input = -2;
        //		while(input.intValue() < -1 || input.intValue() > 2) {input = askForNumber();}
        //
        //		return input.intValue();
    }

    @Override
    public Number askForNumber() {
        Number value = null;
        boolean bool = true;

        System.out.println("Bitte geben Sie eine Zahl ein:\n");
        while (bool) {

            try {
                scan = new Scanner(System.in);
                value = scan.nextInt();
                bool = false;
            } catch (InputMismatchException e) {
                System.out.println("Bitte nur Zahlen eingeben!");
            }
        }
        return value;
    }

    @Override
    public String askForString(boolean scanWholeLine) {
        String value = "";
        boolean run = true;
        Scanner scanner;

        System.out.println("Eingabe::");
        while (run) {
            if (scanWholeLine) {
                try {
                    scanner = new Scanner(System.in);
                    value = scanner.nextLine();
                    run = false;
                } catch (InputMismatchException e) {
                    System.out.println("Ihre Eingabe ist falsch!");
                }
            } else {
                try {
                    scanner = new Scanner(System.in);
                    value = scanner.next();
                    run = false;
                } catch (InputMismatchException e) {
                    System.out.println("Ihre Eingabe ist falsch!");
                }
            }

        }
        return value;
    }
}
