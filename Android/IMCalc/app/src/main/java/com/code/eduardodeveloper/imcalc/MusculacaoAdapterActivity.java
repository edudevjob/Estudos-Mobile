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

public class MusculacaoAdapterActivity extends BaseAdapter {
    private final Context context;
    private final List<Musculacao> musculacaos;

    public MusculacaoAdapterActivity(Context context, List<Musculacao> musculacaos) {
        this.context = context;
        this.musculacaos = musculacaos;
    }


    @Override
    public int getCount() {
        return musculacaos != null ? musculacaos.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return musculacaos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_musculacao_adapter,parent,false);
        TextView t = (TextView) view.findViewById(R.id.txtMusculacao);
        ImageView img = (ImageView) view.findViewById(R.id.imgMusc1);
        Musculacao m = musculacaos.get(position);
        t.setText(m.nome);
        img.setImageResource(m.img);
        return view;
    }
}
