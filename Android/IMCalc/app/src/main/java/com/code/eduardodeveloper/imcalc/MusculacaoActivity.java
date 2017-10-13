package com.code.eduardodeveloper.imcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MusculacaoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listMusculacao;
    private List<Musculacao> musculacaos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculacao);

        listMusculacao = (ListView) findViewById(R.id.ListMusculacao);
        musculacaos = Musculacao.getMusculacao();
        listMusculacao.setAdapter(new MusculacaoAdapterActivity(this,musculacaos));
        listMusculacao.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Musculacao m = this.musculacaos.get(position);
        Toast.makeText(this, "Exercícios: "+ m.nome, Toast.LENGTH_LONG).show();
    }
}
