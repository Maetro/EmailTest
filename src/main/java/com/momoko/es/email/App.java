/**
 * App.java 30-mar-2018
 *
 * Copyright 2018 RAMON CASARES.
 * @author Ramon.Casares.Porto@gmail.com
 */
package com.momoko.es.email;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) {

        Mail.sendEmail("TEST", "TEST", "RMaetro@gmail.com");
        Mail.sendEmail("TEST", "TEST", "kizuna.owo@gmail.com");
        System.out.println("Hello World!");
    }
}
