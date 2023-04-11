package com.company;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Random;

public class Bloque extends JPanel {

    JLabel nombres;
    public Bloque( String nombre) {
        Random rand = new Random();

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color colorAnillo = new Color(r, g, b);
        Border bordejpanel = new TitledBorder(new BevelBorder(2));

        nombres = new JLabel(nombre);
        this.add(nombres);
        this.setBorder(bordejpanel);
        this.setBackground(colorAnillo);
    }

}