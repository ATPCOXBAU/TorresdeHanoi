package com.company;

import com.sun.beans.editors.FontEditor;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_principal extends JFrame{
    private JButton configuraciónButton;
    private JPanel panelinicio;
    private JLabel TORRESDEHANOILabel;
    private JButton nuevoJuegoButton;
    private JButton TOP5Button;
    private JButton juegoAutomaticoButton;
    private JButton salirButton;


    public Menu_principal() {
        this.setLocation(200,50);

        this.setContentPane(panelinicio);
        this.setTitle("Torres de hanoi");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        configuraciónButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuraciónButtonAE(evt);
            }
        });

        juegoAutomaticoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juegoAutomaticoButtonAE(evt);
            }
        });


        nuevoJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevoJuegoButtonAE(e);
            }
        });

        TOP5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TOP5AE(e);
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SalirAE(e);
            }
        });
    }
    private void configuraciónButtonAE(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoJuegoActionPerformed
        ConfigFrame configFrame = new ConfigFrame();
        configFrame.setVisible(true);
        this.setVisible(false);
    }

    private void juegoAutomaticoButtonAE (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoJuegoActionPerformed
        Juego_AutoFrame juego_autoFrame = new Juego_AutoFrame();
        juego_autoFrame.setVisible(true);
        this.setVisible(false);
    }

    private void nuevoJuegoButtonAE (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoJuegoActionPerformed
        NuevoJuego nuevoJuego = new NuevoJuego();
        nuevoJuego.setVisible(true);
        this.setVisible(false);
    }

    private void  SalirAE(ActionEvent event){
        this.dispose();
        System.exit(0);
    }
    private void TOP5AE(ActionEvent event){

        top5FRAME top5FRAME = new top5FRAME();
        top5FRAME.show();
        for (int i = 0; i <5 ; i++) {
            System.out.println(Main.jugadores[i]);
        }

    }


}
