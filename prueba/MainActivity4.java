package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity4 extends AppCompatActivity {

    ListView listView;
    ListView listView2;

    int ima1[]={R.drawable.jolyne,R.drawable.para};
    int ima2[]={R.drawable.c,R.drawable.h};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //instanciar vista
        listView = findViewById(R.id.imageness);
        listView2 = findViewById(R.id.imagenes1);
        //instanciar elementos que contiene la lista mediante SetAdapter
        listView.setAdapter(new historias1(this,ima1,ima2));
        listView2.setAdapter(new historias1(this,ima2,ima1));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(),MainActivity5.class);
                String resultado=String.valueOf(i);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });
       listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(),MainActivity5.class);
                String resultado=String.valueOf(i);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });

    }



    public void actividad2(View vie){
        Intent inten = new Intent(vie.getContext(),MainActivity3.class);
        startActivity(inten);
    }
    public void actividad1(View vie){
        Intent inten = new Intent(vie.getContext(),MainActivity.class);
        startActivity(inten);
    }
}