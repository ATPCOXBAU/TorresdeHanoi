package com.company;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class top5FRAME extends JFrame {


    JLabel lbltitulo,lbltop1,lbltime1,lbltmov1,lblnombre,lbltiempores,lblmovimientos,lbl_1,lbl_0;
    JLabel lbltop2,lbltime2,lblmov2,lbl_2;
    JLabel lbltop3,lbltime3,lblmov3,lbl_3;
    JLabel lbltop4,lbltime4,lblmov4,lbl_4;
    JLabel lbltop5,lbltime5,lblmov5,lbl_5;

    public top5FRAME() {
        lbltitulo = new JLabel("TOP 5 JUGADORES!!");
        lbltitulo.setHorizontalAlignment(0);
        lbltitulo.setBounds(125,10,500,30);
        lbltitulo.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
        this.add(lbltitulo);

        lblnombre = new JLabel("NOMBRE");
        lblnombre.setHorizontalAlignment(0);
        lblnombre.setBounds(50,80,100,25);
        lblnombre.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lblnombre);

        lbl_0 = new JLabel("----------------------------------");
        lbl_0.setHorizontalAlignment(0);
        lbl_0.setBounds(150,80,200,25);
        lbl_0.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbl_0);

        lbltiempores = new JLabel("TIEMPO ----");
        lbltiempores.setHorizontalAlignment(0);
        lbltiempores.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        lbltiempores.setBounds(300, 80, 250, 25);
        this.add(lbltiempores);

        lblmovimientos = new JLabel("MOVIMIENTOS");
        lblmovimientos.setHorizontalAlignment(0);
        lblmovimientos.setBounds(470,80,150,25);
        lblmovimientos.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lblmovimientos);




        lbltop1 = new JLabel(RegresarNombre(0));
        lbltop1.setHorizontalAlignment(0);
        lbltop1.setBounds(50,150,100,25);
        lbltop1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbltop1);



        lbl_1 = new JLabel("----------------------------------");
        lbl_1.setHorizontalAlignment(0);
        lbl_1.setBounds(150,150,200,25);
        lbl_1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbl_1);

        lbltime1 = new JLabel(Regresartiempo(0));
        lbltime1.setHorizontalAlignment(0);
        lbltime1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        lbltime1.setBounds(300, 150, 250, 25);
        this.add(lbltime1);



        lbltmov1 = new JLabel(Regresarmovimientos(0));
        lbltmov1.setHorizontalAlignment(0);
        lbltmov1.setBounds(450,150,150,25);
        lbltmov1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbltmov1);


        lbltop2 = new JLabel(RegresarNombre(1));
        lbltop2.setHorizontalAlignment(0);
        lbltop2.setBounds(50,225,100,25);
        lbltop2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbltop2);


        lbl_2 = new JLabel("----------------------------------");
        lbl_2.setHorizontalAlignment(0);
        lbl_2.setBounds(150,225,200,25);
        lbl_2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbl_2);
        lbltime2 = new JLabel(Regresartiempo(1));
        lbltime2.setHorizontalAlignment(0);
        lbltime2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        lbltime2.setBounds(300, 225, 250, 25);
        this.add(lbltime2);
        lblmov2 = new JLabel(Regresarmovimientos(1));
        lblmov2.setHorizontalAlignment(0);
        lblmov2.setBounds(450,225,150,25);
        lblmov2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lblmov2);


        lbltop3 = new JLabel(RegresarNombre(2));
        lbltop3.setHorizontalAlignment(0);
        lbltop3.setBounds(50,300,100,25);
        lbltop3.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbltop3);

        lbl_3 = new JLabel("----------------------------------");
        lbl_3.setHorizontalAlignment(0);
        lbl_3.setBounds(150,300,200,25);
        lbl_3.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbl_3);

        lbltime3 = new JLabel(Regresartiempo(2));
        lbltime3.setHorizontalAlignment(0);
        lbltime3.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        lbltime3.setBounds(300, 300, 250, 25);
        this.add(lbltime3);

        lblmov3 = new JLabel(Regresarmovimientos(2));
        lblmov3.setHorizontalAlignment(0);
        lblmov3.setBounds(450,300,150,25);
        lblmov3.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lblmov3);

        lbltop4 = new JLabel(RegresarNombre(3));
        lbltop4.setHorizontalAlignment(0);
        lbltop4.setBounds(50,375,100,25);
        lbltop4.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbltop4);

        lbl_4 = new JLabel("----------------------------------");
        lbl_4.setHorizontalAlignment(0);
        lbl_4.setBounds(150,375,200,25);
        lbl_4.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbl_4);

        lbltime4 = new JLabel(Regresartiempo(3));
        lbltime4.setHorizontalAlignment(0);
        lbltime4.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        lbltime4.setBounds(300, 375, 250, 25);
        this.add(lbltime4);

        lblmov4 = new JLabel(Regresarmovimientos(3));
        lblmov4.setHorizontalAlignment(0);
        lblmov4.setBounds(450,375,150,25);
        lblmov4.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lblmov4);


        lbltop5 = new JLabel(RegresarNombre(4));
        lbltop5.setHorizontalAlignment(0);
        lbltop5.setBounds(50,425,100,25);
        lbltop5.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbltop5);

        lbl_5 = new JLabel("----------------------------------");
        lbl_5.setHorizontalAlignment(0);
        lbl_5.setBounds(150,425,200,25);
        lbl_5.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lbl_5);

        lbltime5 = new JLabel(Regresartiempo(4));
        lbltime5.setHorizontalAlignment(0);
        lbltime5.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        lbltime5.setBounds(300, 425, 250, 25);
        this.add(lbltime5);

        lblmov5 = new JLabel(Regresarmovimientos(4));
        lblmov5.setHorizontalAlignment(0);
        lblmov5.setBounds(450,425,150,25);
        lblmov5.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        this.add(lblmov5);


        this.setTitle("Fin Juego");
        this.setBounds(10, 10, 800, 700);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.orange);


    }

    public String RegresarNombre(int pos){
        String retorno = "----";
        if (Main.jugadores[pos] == null){
            retorno = "------";
        } else {
            retorno = Main.jugadores[pos].getNombre();
        }
        return retorno;

    }
    public String Regresartiempo(int pos){
        String retorno = "----";
        if (Main.jugadores[pos] == null){
            retorno = "------";
        } else {
            retorno = String.valueOf(Main.jugadores[pos].getTiempoRestante());
        }
        return retorno;

    }
    public String Regresarmovimientos(int pos){
        String retorno = "----";
        if (Main.jugadores[pos] == null){
            retorno = "------";
        } else {
            retorno = String.valueOf(Main.jugadores[pos].getMovimientos());
        }
        return retorno;

    }
}
