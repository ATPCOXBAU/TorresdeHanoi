package com.company;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static int numerodiscos = 3;
    public static int segundos = 120;
    public static Menu_principal inicio;
    public static  Hanoi hanoi;
    public static Jugador [] jugadores = new Jugador[5];
    public static int contadorJugadores;
    public static ObjectOutputStream oos;
    public static ObjectInputStream ois;
    public static void main(String[] args) {
    verificarDatosBin();
    inicio = new Menu_principal();
        hanoi = new Hanoi();
    }
    public static void ordenarTop() {
        boolean mayor = true;
        int contador = 0;
        Jugador burbuja;
        while (mayor) {
            contador = 0;
            mayor = false;
            while (!mayor && contador < (contadorJugadores - 1)) {
                if (jugadores[contador].getMovimientos() > jugadores[contador + 1].getMovimientos()) {
                    burbuja = jugadores[contador];
                    jugadores[contador] = jugadores[contador + 1];
                    jugadores[contador + 1] = burbuja;
                    mayor = true;
                }
                contador++;
            }
        }
    }

    public static void guardarDatos(Object object, String rutaBin) throws FileNotFoundException, IOException {
        oos = new ObjectOutputStream(new FileOutputStream(rutaBin));
        try {
            oos.writeObject(object);
            oos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Object leerDatosBin(String ruta) {
        Object object;
        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));
            object = ois.readObject();
            ois.close();
            return object;

        } catch (Exception ex) {

            System.out.println("algo");
            return null;
        }

    }

    public static void agregarJugadorAlTop(Jugador jugador) {
        if (contadorJugadores < 5) {
            jugadores[contadorJugadores] = jugador;
            contadorJugadores++;
            ordenarTop();
        } else {
            boolean igual = false;
            int contador = 0;
            while (!igual && contador < 5) {
                if ( jugadores[contador].getMovimientos() == jugador.getMovimientos()) {
                    igual = true;
                }
                contador++;
            }
            if (igual) {
                jugadores[4] = jugador;
                ordenarTop();
            } else {
                if (jugadores[4].getMovimientos() > jugador.getMovimientos() ) {
                    jugadores[4] = jugador;
                    ordenarTop();
                }
            }
        }

    }
    public static void verificarDatosBin() {
        if (leerDatosBin("TOP.bin") != null) {
            jugadores = (Jugador[]) leerDatosBin("TOP.bin");
            for (int i = 0; i < jugadores.length; i++) {
                if (jugadores[i] != null) {
                    contadorJugadores++;
                }
            }
        }

        }

}