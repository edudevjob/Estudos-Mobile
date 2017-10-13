package com.code.eduardodeveloper.imcalc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardodeveloper on 10/12/17.
 */

public class Musculacao {
    public String nome;
    public int img;

    public Musculacao(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }
    public static List<Musculacao> getMusculacao(){
        List<Musculacao> musculacaos = new ArrayList<Musculacao>();
        musculacaos.add(new Musculacao("Agachamento com peso no ombro",R.drawable.musc1));
        musculacaos.add(new Musculacao("APeso no ombro em pé, peso no ombro agachado",R.drawable.musc2));
        musculacaos.add(new Musculacao("Mão para frente, abaixe e levante",R.drawable.musc3));
        musculacaos.add(new Musculacao("Agachamento com elástico",R.drawable.musc4));
        musculacaos.add(new Musculacao("Exercícios para o braço",R.drawable.musc5));
        musculacaos.add(new Musculacao("Peso no chão,no ombro e no alto",R.drawable.musc6));

        return  musculacaos;
    }
}
