package com.code.eduardodeveloper.imcalc;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private EditText edtPeso;
    private EditText edtAltura;
    private ImageButton imbCalcular;
    private double peso;
    private double altura;
    private double imc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso = (EditText) findViewById(R.id.edtPeso);
        edtAltura = (EditText) findViewById(R.id.edtAltura);
        imbCalcular = (ImageButton) findViewById(R.id.imbCalcular);

        imbCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peso = Double.parseDouble(edtPeso.getText().toString());
                altura = Double.parseDouble(edtAltura.getText().toString());

                imc = peso/(altura*altura);
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Seu IMC é: " +imc);
                msg.setMessage("IMC ABAIXO DE 18,5 - ABAIXO DO PESO\n" +
                        "IMC ENTRE 18,6 E 24,9 - PESO IDEAL\n" +
                        "IMC ENTRE 25,0 E 29,9 - LEVEMENTE ACIMA DO PESO\n" +
                        "IMC ENTRE 30,0 E 34,9 - OBESIDADE GRAU I\n" +
                        "IMC ACIMA DE 40,0 - OBESIDADE GRAU III");
                msg.setNeutralButton("OK",null);
                msg.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.aerobico:
                Intent it = new Intent(MainActivity.this,AeroActivity.class);
                startActivity(it);
                break;
            case R.id.circuitos:
                Intent it2 = new Intent(MainActivity.this,Circuito.class);
                startActivity(it2);
                break;
            case R.id.musculacao:
                Intent it3 = new Intent(MainActivity.this,MusculacaoActivity.class);
                startActivity(it3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
