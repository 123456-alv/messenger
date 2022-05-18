package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private ImageView historiaa;
    //private ImageView historiaa2;

    int ima1[]={R.drawable.jolyne,R.drawable.para,R.drawable.c,R.drawable.h};
    int ima2[]={R.drawable.c,R.drawable.h};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        historiaa = (ImageView) findViewById(R.id.historiaa);

        //historiaa2 = (ImageView) findViewById(R.id.historiaa);
        String resultado = getIntent().getStringExtra("resultado");

        int numEntero = Integer.parseInt(resultado);
        int numEntero2 = Integer.parseInt(resultado);

        historiaa.setImageResource(ima1[numEntero]);
        //historiaa2.setImageResource(ima2[numEntero2]);
    }

}