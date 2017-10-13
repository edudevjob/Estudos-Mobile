package com.code.eduardodeveloper.imcalc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardodeveloper on 10/12/17.
 */

public class Circuito {
    public String nome;
    public  int img;

    public Circuito(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }
    public static List<Circuito> getCircuito(){
        List<Circuito> circuitos = new ArrayList<Circuito>();
        circuitos.add(new Circuito("Abdominal com a bola",R.drawable.bola1));
        circuitos.add(new Circuito("Deitado de lado, levante a bola com os pés",R.drawable.bola2));
        circuitos.add(new Circuito("Com o abdome na bola, levante o corpo",R.drawable.bola3));
        circuitos.add(new Circuito("Com a barriga sobre a bola, levante os pés",R.drawable.bola4));
        circuitos.add(new Circuito("De lado sobre a bola, erga o corpo com as mão na cabeça",R.drawable.bola5));
        circuitos.add(new Circuito("Um pé sobre a bola e as duas mão no chão, faça flexões",R.drawable.bola6));

        return circuitos;

    }
}
