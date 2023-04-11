package com.company;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigFrame extends JFrame {
    private JComboBox comboBox2;
    private JButton guardarButton;
    private JButton salirButton;
    private JTextField textField1;
    private JPanel PanelConfig;
    private int nseleccionado = 3;
    private int segundossleccionado = 120;
    private boolean segcorrecto= false;

    public ConfigFrame(){

        textField1.setText(String.valueOf(Main.segundos));
        this.setLocation(200,50);
        this.setContentPane(PanelConfig);
        this.setTitle("Configuracion");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonAE(evt);
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonAE(evt);
            }
        });
    }



    private void guardarButtonAE(java.awt.event.ActionEvent evt){

        try {
            segundossleccionado = Integer.parseInt(textField1.getText());
            segcorrecto = true;

        }
        catch (Exception exception){
            JOptionPane.showMessageDialog(this,"El tiempo ingresado es Incorrecto" + exception);

            textField1.setText(String.valueOf(Main.segundos));
            textField1.setFocusable(true);
            textField1.requestFocus();
            segcorrecto = false;
        }

        if (segcorrecto == true){
        nseleccionado = Integer.parseInt((String) comboBox2.getSelectedItem());
        Main.numerodiscos = nseleccionado;
        segundossleccionado = Integer.parseInt(textField1.getText());
        Main.segundos = segundossleccionado;
        System.out.println(Main.numerodiscos);
        System.out.println(Main.segundos);
            JOptionPane.showMessageDialog(this,"El tiempo ingresado es " + Main.segundos + " Con Discos " + Main.numerodiscos);

        }

    }

    private void salirButtonAE(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(Main.inicio, "Se ha cerrado la configuracion.");
        this.dispose();
        Main.inicio.setVisible(true);
    }
}
