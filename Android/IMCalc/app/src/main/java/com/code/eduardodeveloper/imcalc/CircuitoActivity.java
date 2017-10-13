package com.code.eduardodeveloper.imcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class CircuitoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listCircuito;
    private List<Circuito> circuitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuito);

        listCircuito = (ListView) findViewById(R.id.ListCircuito);
        circuitos = Circuito.getCircuito();
        listCircuito.setAdapter(new CircuitoAdapterActivity(this,circuitos));

        listCircuito.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Circuito c = this.circuitos.get(position);
        Toast.makeText(this, "Exercício: "+c.nome, Toast.LENGTH_LONG).show();
    }
}
