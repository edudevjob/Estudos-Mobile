package com.code.eduardodeveloper.imcalc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardodeveloper on 10/12/17.
 */

public class Aerobico {
    public String nome;
    public int img;

    public Aerobico(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }
    public static List<Aerobico> getAerobico(){
        List<Aerobico> aerobicos = new ArrayList<Aerobico>();
        aerobicos.add(new Aerobico("Fazer Abdominal",R.drawable.aero1));
        aerobicos.add(new Aerobico("Levantar pernas e pesos",R.drawable.aero2));
        aerobicos.add(new Aerobico("Levantar braço esquerdo",R.drawable.aero3));
        aerobicos.add(new Aerobico("Deite e levante as pernas, apoiano as costas",R.drawable.aero4));
        aerobicos.add(new Aerobico("Braço direito para frente, perna esquerda para traz",R.drawable.aero5));
        aerobicos.add(new Aerobico("Abra os braços e e perna direita",R.drawable.aero7));
        aerobicos.add(new Aerobico("Estique o braço esquerdo, mão direita na canela",R.drawable.aero8));

        return aerobicos;

    }
}
