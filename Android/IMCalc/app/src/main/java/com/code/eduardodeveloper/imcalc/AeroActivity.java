package com.code.eduardodeveloper.imcalc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class AeroActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listAerobico;
    private List<Aerobico> aerobicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aero);

        listAerobico = (ListView) findViewById(R.id.ListAerobico);
        aerobicos = Aerobico.getAerobico();
        listAerobico.setAdapter(new AeroAdapterActivity(this,aerobicos));
        listAerobico.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Aerobico a = this.aerobicos.get(position);
        Toast.makeText(this,"Exercícios: "+a.nome, Toast.LENGTH_LONG).show();
    }


}
