package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class JuegoCompleto extends JFrame {
    JLabel lbltitulo,lblTiempoRes,lblMovimientos,lblTiempoRescont,lblMovimientoscont,lblNombre;
    JTextField txtNombre;
    JButton btnAgregar;

    public JuegoCompleto (int timempores, int movutil){
        lbltitulo = new JLabel("Juego Completado!!");
        lbltitulo.setHorizontalAlignment(0);
        lbltitulo.setBounds(0,10,300,30);
        lbltitulo.setFont(new Font(null, Font.PLAIN, 25));
        this.add(lbltitulo);

        lblTiempoRes = new JLabel("Tiempo Restante: ");
        lblTiempoRes.setHorizontalAlignment(0);
        lblTiempoRes.setBounds(0,45,150,25);
        lblTiempoRes.setFont(new Font(null, Font.PLAIN, 15));
        this.add(lblTiempoRes);

        lblTiempoRescont = new JLabel(String.valueOf(timempores));
        lblTiempoRescont.setHorizontalAlignment(0);
        lblTiempoRescont.setFont(new Font(null, Font.PLAIN, 15));
        lblTiempoRescont.setBounds(100, 45, 200, 25);
        this.add(lblTiempoRescont);



        lblMovimientos = new JLabel("Movimientos: ");
        lblMovimientos.setHorizontalAlignment(0);
        lblMovimientos.setBounds(0,85,150,25);
        lblMovimientos.setFont(new Font(null, Font.PLAIN, 15));
        this.add(lblMovimientos);


        lblMovimientoscont = new JLabel(String.valueOf(movutil));
        lblMovimientoscont.setHorizontalAlignment(0);
        lblMovimientoscont.setFont(new Font(null, Font.PLAIN, 15));
        lblMovimientoscont.setBounds(100, 85, 200, 25);
        this.add(lblMovimientoscont);


        lblNombre = new JLabel("Ingrese Nombre: ");
        lblNombre.setHorizontalAlignment(0);
        lblNombre.setBounds(60,125,150,25);
        lblNombre.setFont(new Font(null, Font.PLAIN, 15));
        this.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(50, 155, 200, 25);
        this.add(txtNombre);


        btnAgregar = new JButton("Aceptar");
        btnAgregar.setHorizontalAlignment(0);
        btnAgregar.setBounds(65, 250, 200, 30);
        btnAgregar.setFont(new Font(null, Font.PLAIN, 15));
        btnAgregar.setBackground(Color.green);
        this.add(btnAgregar);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnAgregarAE(e);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });


        this.setTitle("Fin Juego");
        this.setBounds(400, 100, 355, 350);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    public void btnAgregarAE(ActionEvent e) throws IOException {
        String nombre;
        if (txtNombre.getText().equals("")) {
            nombre = "Anónimo";
        } else {
            nombre = txtNombre.getText();
        }
        int tiempores = Integer.parseInt(lblTiempoRescont.getText());
        int moviminetos = Integer.parseInt(lblMovimientoscont.getText());

        Jugador jugador = new Jugador(nombre,tiempores,moviminetos);
        Main.agregarJugadorAlTop(jugador);
        Main.inicio.setVisible(true);
        Main.guardarDatos(Main.jugadores, "TOP.bin");

        this.dispose();
    }

}