package com.company;

import javax.swing.*;
import java.awt.*;

public class Torre extends JPanel {


    public Torre() {
        this.setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(null);

        g.setColor(Color.BLACK);
        g.fillRect(10, 270, 200,5);

        g.fillRect(110, 30, 5, 240);

    }
}
