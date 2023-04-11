package com.company;

import java.io.Serializable;

public class Jugador implements Serializable {
    int tiempoRestante;
    int movimientos;
    String nombre;

    public Jugador(String nombre,int tiempoRestante,int movimientos) {
        this.tiempoRestante = tiempoRestante;
        this.movimientos = movimientos;
        this.nombre = nombre;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
