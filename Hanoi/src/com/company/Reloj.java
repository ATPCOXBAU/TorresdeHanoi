package com.company;

import javax.swing.*;

public class Reloj extends JButton implements Runnable {
        private int x;
        private  int y;
        private int width = 60;
        private int heigth = 60;
        private String direccion = "abajo";
        public Reloj(int x, int y, String icono){
            this.setIcon(new ImageIcon(icono));
            this.setSize(width,heigth);
            this.x = x;
            this.y=y;
            this.setLocation(x,y);


        }



    @Override
    public void run() {
            while (true){
                switch (direccion){
                    case "abajo" : {
                        if ((this.y+heigth)<=700){
                            this.y++;
                        } else {
                            this.direccion="arriba";
                        }
                    }
                    break;
                    case "arriba":{
                        if ((this.y+heigth)>10){
                            this.y--;
                        } else {
                            this.direccion="abajo";
                        }
                        break;
                    }
                    }
                    this.setLocation(this.x,this.y);

                    try {
                        Thread.sleep(5);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }

    }

