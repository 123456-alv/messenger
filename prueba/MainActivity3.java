package com.example.prueba;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ListView listView;
    String contactos[]={
            "contacto 1",
            "contacto 2",
            "contacto 3",
            "contacto 4",
            "contacto 5",
            "contacto 6"};

    String conversacion[]={
            "",
            "",
            "",
            "",
            "",
            ""};

    String fechas[]={
            "",
            "",
            "",
            "",
            "",
            ""};
    int avatar[]={R.drawable.uno,R.drawable.dos,R.drawable.tres,
            R.drawable.cuatro,R.drawable.quinto,R.drawable.sexto};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView = findViewById(R.id.list2);
        listView.setAdapter(new Datos(this,contactos, conversacion, fechas, avatar));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(),MainActivity2.class);
                String resultado=String.valueOf(i);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });
    }
    public void otro2(View vie){
        Intent inten = new Intent(vie.getContext(),MainActivity.class);
        startActivity(inten);
    }

    public void actividad4(View vie){
        Intent inten = new Intent(vie.getContext(),MainActivity4.class);
        startActivity(inten);
    }
}