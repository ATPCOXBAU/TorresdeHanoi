package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juego_AutoFrame extends JFrame {
    private JTextArea AreaTextto;
    private JPanel panel1;
    private JButton salirButton;
    private JButton iniciarButton;
    private JLabel numeroDeDiscosLabel;
    private JLabel contadorDiscos;
    private int contador=0;

    private JLabel contadormovimientoslbl;
public Juego_AutoFrame(){

    contadormovimientoslbl.setText(String.valueOf(contador));
    contadorDiscos.setText(String.valueOf(Main.numerodiscos));
    this.setLocation(200,50);
    this.setContentPane(panel1);
    this.setTitle("Jeugo Automatico");
    this.setSize(800, 500);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    salirButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            salirButtonAE(evt);
        }
    });

    iniciarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            iniciarButtonAE(e);
        }
    });
}


    private void salirButtonAE(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(Main.inicio, "Se ha cerrado la configuracion.");
        this.dispose();
        Main.inicio.setVisible(true);
    }

    private void iniciarButtonAE(java.awt.event.ActionEvent evt){
    AreaTextto.setText("");
    contador=0;
       Hanoi(Main.numerodiscos,1,2,3);


    }
    public void Hanoi(int num, int inicio, int inter, int fin ){
        if(num == 1){
            AreaTextto.append("Moviendo el disco superior del poste " + inicio + " Al poste " + fin + "\n" );
            contador++;
            contadormovimientoslbl.setText(String.valueOf(contador));

        } else  {
            Hanoi(num-1,inicio,fin,inter);
            AreaTextto.append("Moviendo el disco superior del poste  " + inicio + " Al poste" + fin + "\n");
            contador++;
            contadormovimientoslbl.setText(String.valueOf(contador));

            Hanoi(num-1,inter,inicio,fin);


        }

    }



}
