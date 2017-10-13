package com.code.eduardodeveloper.imcalc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CircuitoAdapterActivity extends BaseAdapter {
    private final Context context;
    private final List<Circuito> circuitos;

    public CircuitoAdapterActivity(Context context, List<Circuito> circuitos) {
        this.context = context;
        this.circuitos = circuitos;
    }

    @Override
    public int getCount() {
        return circuitos != null ? circuitos.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return circuitos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_circuito_adapter,parent,false);
        TextView t = (TextView) view.findViewById(R.id.txtNomeBola);
        ImageView img = (ImageView) view.findViewById(R.id.imgBola1);

        Circuito c = circuitos.get(position);
        t.setText(c.nome);
        img.setImageResource(c.img);
        return view;
    }
}
