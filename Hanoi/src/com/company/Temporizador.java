package com.company;


import javax.swing.*;
import java.awt.*;

public class Temporizador extends Thread {

    private int segundos;
    NuevoJuego ventanaNuevoJuego;
    public Temporizador( int segundos, NuevoJuego ventanaNuevoJuego) {
        this.segundos = segundos;
        this.ventanaNuevoJuego = ventanaNuevoJuego;

    }

    public void run() {

        try {
            while (true) {
                ventanaNuevoJuego.lblTiempo2.setText(String.valueOf(segundos));
                ventanaNuevoJuego.lblTiempo2.setSize(50,50);
                ventanaNuevoJuego.lblTiempo2.setLocation(825,45);
                ventanaNuevoJuego.lblTiempo2.setBorder(BorderFactory.createLineBorder(Color.black));

                sleep(1000);
                segundos--;
                if (segundos < 0) {

                    JOptionPane.showMessageDialog(null  ,"Se ha acabado el Tiempo");
                    ventanaNuevoJuego.dispose();
                    Main.inicio.setVisible(true);
                    this.stop();

                }
            }
        } catch (Exception ex) {

        }
    }

    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }




}
