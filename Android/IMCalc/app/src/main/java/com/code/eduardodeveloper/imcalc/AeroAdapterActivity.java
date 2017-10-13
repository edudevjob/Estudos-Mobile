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

public class AeroAdapterActivity extends BaseAdapter {
    private final Context context;
    private final List<Aerobico> aerobicos;

    public AeroAdapterActivity(Context context, List<Aerobico> aerobicos) {
        this.context = context;
        this.aerobicos = aerobicos;
    }


    @Override
    public int getCount() {
        return aerobicos != null ? aerobicos.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return aerobicos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_aero_adapter,parent,false);
        TextView t = (TextView) view.findViewById(R.id.txtAero);
        ImageView img = (ImageView) view.findViewById(R.id.imgAero1);

        Aerobico aerobico = aerobicos.get(position);
        t.setText(aerobico.nome);
        img.setImageResource(aerobico.img);
        return view;
    }
}
