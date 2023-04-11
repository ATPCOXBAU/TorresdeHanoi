package com.company;

import javafx.scene.control.Labeled;
import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class NuevoJuego extends JFrame {
    Temporizador temporizador;
    JLabel lblTiempo2, lblTemporizador;
    JButton btnTimeup, btnTimeDown;
    Torre torre1, torre2, torre3;
    JLabel nombreTorre1, nombreTorre2, nombreTorre3, nombreTorre$;
    JButton btn1to3, btn1to2, btn2to1, btn2to3, btn3to2, btn3to1,btnsalir;
    int nombrediscos = 0;
    int contadordemovimientos = 0;
    boolean seleccionado;
    Bloque aroMover;
    JLabel lblContador, lblcontadornumero;
    Reloj up,down;
    public NuevoJuego() {

        up = new Reloj(10,50,"tup.png");
        this.add(up);
        (new Thread(up)).start();
        down = new Reloj(10,115 ,"tdown.png");
        this.add(down);
        (new Thread(down)).start();


        lblTemporizador = new JLabel("Tiempo Restante");
        lblTemporizador.setHorizontalAlignment(0);
        lblTemporizador.setBounds(750, 20, 190, 20);
        lblTemporizador.setBorder(BorderFactory.createLineBorder(Color.black));
        lblTemporizador.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15));
        this.add(lblTemporizador);

        lblContador = new JLabel("Moviminetos Realizados");
        lblContador.setHorizontalAlignment(0);
        lblContador.setBounds(10,20,250,20);
        lblContador.setBorder(BorderFactory.createLineBorder(Color.black));
        lblContador.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15));
        this.add(lblContador);

        lblcontadornumero = new JLabel(String.valueOf(contadordemovimientos));
        lblcontadornumero.setHorizontalAlignment(0);
        lblcontadornumero.setBounds(90,45,80,20);
        lblcontadornumero.setBorder(BorderFactory.createLineBorder(Color.black));
        lblcontadornumero.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15));
        this.add(lblcontadornumero);


        btn1to3 = new JButton();
        btn1to3.setIcon(new ImageIcon("izquierda.png"));
        btn1to3.setSize(58, 50);
        btn1to3.setLocation(90, 500);
        btn1to3.setContentAreaFilled(false);
        this.add(btn1to3);

        btn1to2 = new JButton();
        btn1to2.setIcon(new ImageIcon("derecha.png"));
        btn1to2.setSize(58, 50);
        btn1to2.setLocation(200, 500);
        btn1to2.setContentAreaFilled(false);
        this.add(btn1to2);

        btn2to1 = new JButton();
        btn2to1.setIcon(new ImageIcon("izquierda.png"));
        btn2to1.setSize(58, 50);
        btn2to1.setLocation(400, 500);
        btn2to1.setContentAreaFilled(false);
        this.add(btn2to1);

        btn2to3 = new JButton();
        btn2to3.setIcon(new ImageIcon("derecha.png"));
        btn2to3.setSize(58, 50);
        btn2to3.setLocation(500, 500);
        btn2to3.setContentAreaFilled(false);
        this.add(btn2to3);

        btn3to2 = new JButton();
        btn3to2.setIcon(new ImageIcon("izquierda.png"));
        btn3to2.setSize(58, 50);
        btn3to2.setLocation(725, 500);
        btn3to2.setContentAreaFilled(false);
        this.add(btn3to2);

        btn3to1 = new JButton();
        btn3to1.setIcon(new ImageIcon("derecha.png"));
        btn3to1.setSize(58, 50);
        btn3to1.setLocation(825, 500);
        btn3to1.setContentAreaFilled(false);
        this.add(btn3to1);

        btnsalir = new JButton("salir");
        btnsalir.setSize(100, 35);
        btnsalir.setLocation(850, 600);
        btnsalir.setBackground(new Color(208,77,49));
        this.add(btnsalir);

        nombreTorre$ = new JLabel("TORRE TRES");
        nombreTorre$.setBounds(760, 150, 150, 10);
        this.add(nombreTorre$);


        temporizador = new Temporizador(Main.segundos, this);
        lblTiempo2 = new JLabel();
        lblTiempo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        lblTiempo2.setForeground(Color.black);
        lblTiempo2.setText("0000");

        temporizador.start();

        this.add(lblTiempo2);


        torre1 = new Torre();
        torre1.setBounds(70, 200, 220, 300);
        this.add(torre1);

        nombreTorre1 = new JLabel("TORRE UNO");
        nombreTorre1.setBounds(150, 150, 150, 10);
        this.add(nombreTorre1);

        //torre2
        torre2 = new Torre();
        torre2.setBounds(370, 200, 220, 300);
        this.add(torre2);

        nombreTorre2 = new JLabel("TORRE DOS");
        nombreTorre2.setBounds(450, 150, 150, 10);
        this.add(nombreTorre2);

        //torre3
        torre3 = new Torre();
        torre3.setBounds(700, 200, 220, 300);
        this.add(torre3);

        nombreTorre3 = new JLabel("TORRE TRES");
        nombreTorre3.setBounds(800, 100, 150, 10);
        this.add(nombreTorre3);


        agregarAros();


        this.setSize(1000, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(163, 228, 215));


        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeupAE(evt);

            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btnTimeDownAE(evt);

            }
        });
        btn1to2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoverAE(e,torre1,torre2);
                lblcontadornumero.setText(String.valueOf(contadordemovimientos));

            }
        });
        btn2to3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoverAE(e,torre2,torre3);
                lblcontadornumero.setText(String.valueOf(contadordemovimientos));
                if ((verificarFinalJuego(Main.numerodiscos,torre3.getComponentCount()))==true){
                    temporizador.stop();
                    JOptionPane.showMessageDialog(null,"FELICIDADES HA COMPLETADO EL JUEGO!!!!!!! \n" + "Su tiempo es de " + temporizador.getSegundos() + "\n Con movimientos: " + contadordemovimientos );
                    JuegoCompleto juegoCompleto = new JuegoCompleto(temporizador.getSegundos(),contadordemovimientos);
                    juegoCompleto.setVisible(true);
                    NuevoJuego.this.dispose();
                    for (int i = 0; i <Main.jugadores.length ; i++) {
                        System.out.println(Main.jugadores[i]);
                    }
                }
            }

        });
        btn3to1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoverAE(e,torre3,torre1);
                lblcontadornumero.setText(String.valueOf(contadordemovimientos));

            }
        });


        btn1to3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoverAE(e,torre1,torre3);
                lblcontadornumero.setText(String.valueOf(contadordemovimientos));
                if ((verificarFinalJuego(Main.numerodiscos,torre3.getComponentCount()))==true){
                    temporizador.stop();
                    JOptionPane.showMessageDialog(null,"FELICIDADES HA COMPLETADO EL JUEGO!!!!!!! \n" + "Su tiempo es de " + temporizador.getSegundos() + "\n Con movimientos: " + contadordemovimientos );
                    JuegoCompleto juegoCompleto = new JuegoCompleto(temporizador.getSegundos(),contadordemovimientos);
                    juegoCompleto.setVisible(true);

                    NuevoJuego.this.dispose();

                }


            }
        });
        btn2to1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoverAE(e,torre2,torre1);
                lblcontadornumero.setText(String.valueOf(contadordemovimientos));

            }
        });
        btn3to2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoverAE(e,torre3,torre2);
                lblcontadornumero.setText(String.valueOf(contadordemovimientos));

            }

        });
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SalirAE();
            }
        });
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);


    }

    public void btnTimeupAE(java.awt.event.ActionEvent evt) {
        temporizador.setSegundos(temporizador.getSegundos() + 10);
        temporizador.suspend();
        JOptionPane.showMessageDialog(this, "Se han agregado 10 Segudo, Tiempo nuevo : " + temporizador.getSegundos());
        temporizador.resume();
    }

    public void btnTimeDownAE(java.awt.event.ActionEvent evt) {
        temporizador.setSegundos(temporizador.getSegundos() - 10);
        temporizador.suspend();
        JOptionPane.showMessageDialog(this, "Se han quitado 10 Segudos, Tiempo nuevo : " + temporizador.getSegundos());
        temporizador.resume();
    }


    public void agregarAros() {
        int n = Main.numerodiscos;
        Bloque aro = new Bloque(String.valueOf(nombrediscos));
        aro.setBounds(90, 250, 45, 20);
        torre1.add(aro);
        torre1.updateUI();

        for (int i = 1; i <= n - 1; i++) {
            torre1.add(new Bloque(String.valueOf(i)));
            nombrediscos++;
        }


        organizar(n);

        torre1.updateUI();

    }

    public void organizar(int n) {
        if (n >= 0) {
            for (int j = 1; j <= n - 1; j++) {

                JPanel anterior = (JPanel) torre1.getComponent(j - 1);
                int x = anterior.getX();
                int y = anterior.getY();
                int w = anterior.getWidth();
                int h = anterior.getHeight();

                JPanel aroA = (JPanel) torre1.getComponent(j);
                aroA.setBounds(x, y - h, w, h);
                anterior.setBounds(x - 10, y, w + 20, h);
                torre1.setComponentZOrder(aroA, j);
                torre1.setComponentZOrder(anterior, j - 1);

            }
            organizar(n - 1);
        }

    }


    public void MoverAE(ActionEvent e, Torre torreesta, Torre torreva){
        if (torreesta.getComponentCount() > 0) {
            if (seleccionado == false) {
                //aro que voy a mover
                aroMover = (Bloque) torreesta.getComponent(torreesta.getComponentCount() - 1);
                seleccionado = true;
                //elimino el aro de la torre
                torreesta.remove(torreesta.getComponentCount() - 1);
                torreesta.updateUI();
            }
        }
        if (aroMover != null) {
            //guardar el ancho y alto
            int x = aroMover.getX();//posicion en x
            int w = aroMover.getWidth();//anchura
            if (torreva.getComponentCount() == 0) {
                aroMover.setBounds(x, 250, w, 20);
                torreva.add(aroMover);
                torreva.updateUI();
                contadordemovimientos++;
                aroMover = null;
                seleccionado = false;


            } else {
                //ultimo aro
                Bloque aroPresente = (Bloque) torreva.getComponent(torreva.getComponentCount() - 1);

                if (verificar(aroPresente, aroMover)) {

                    aroMover.setBounds(x, 250 - (20 * torreva.getComponentCount() - 1), w, 20);
                    torreva.add(aroMover);
                    torreva.updateUI();
                    contadordemovimientos++;
                    aroMover = null;
                    seleccionado = false;



                } else {
                    JOptionPane.showMessageDialog(this, "Movimiento invalido");
                    torreesta.add(aroMover);
                    torreesta.updateUI();
                    aroMover = null;
                    seleccionado = false;

                }
            }
        }
    }


    public void SalirAE(){
        JOptionPane.showMessageDialog(Main.inicio, "Se ha Salido del Juego (No se ha guardado).");
        temporizador.stop();
        this.dispose();
        Main.inicio.setVisible(true);
    }


    public boolean verificar(Bloque aroPresente, Bloque aroAMover) {
        //ancho del aro que hay en la torre
        int w = aroPresente.getWidth();
        //ancho del aro que se quiere poner
        int w2 = aroAMover.getWidth();

        if (w > w2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarFinalJuego(int n, int numeroArosTorre3){

        return n==numeroArosTorre3;
    }

}

