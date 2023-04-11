package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Hanoi{
    public int contador=0;
    public void Hanoi(int num, int inicio, int inter, int fin ){
        if(num == 1){
              System.out.println("Moviendo del poste " + inicio + " Al poste" + fin);
            contador++;
        } else  {
            Hanoi(num-1,inicio,fin,inter);
            System.out.println("Moviendo del poste " + inicio + " Al poste" + fin);
            Hanoi(num-1,inter,inicio,fin);
            contador++;

        }

    }

}
