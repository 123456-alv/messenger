package com.example.fragment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;
    //ListView listView1;
    int avatar1[]= {R.drawable.jolyne};
    int avatar[]= {R.drawable._15ef26d_4427_4983_bfbd_78bec7d91227};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //instanciar vista
        listView = findViewById(R.id.lista);
        //listView1 = findViewById(R.id.lista);
        //instanciar elementos que contiene la lista mediante SetAdapter
        listView.setAdapter(new Datos(this,avatar1,avatar));
        //listView1.setAdapter(new Datos(this,avatar));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(),MainActivity3.class);
                String resultado=String.valueOf(i);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        }); }

    public void otro2(View vie){
        Intent inten = new Intent(vie.getContext(),MainActivity.class);
        startActivity(inten);
    }


}
