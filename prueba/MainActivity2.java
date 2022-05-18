package com.example.prueba;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView personal;
    private TextView con;
    private ImageView av;

    String contactos[]={
            "contacto 1",
            "contacto 2",
            "contacto 3",
            "contacto 4",
            "contacto 5",
            "contacto 6"};
    String conversacion[]={"Hola como estas?\n" +
            "\n                                                   bien gracias, y tu?\n"+
            "\n te amo pedro, ya hazme caso\n"+
            "\n                                             gabriel somos compas",
            "sabes quien es maria?                                                                                   \n" +
                    "\n                                                                  mi ex, por?\n"+
                    "\n me tira los perros\n"+
                    "\n                                                                          ._.\n",

            "Hola como estas?                \n" +
                    "\n                                                   bien gracias, y tu?\n"+
                    "\nte amo pedro, ya hazme caso             \n"+
                    "\n                                             gabriel somos compas\n",
            "Hola                 \n" +
                    "\n                                                                     adios\n"+
                    "\nmugroso feo, vete para allá\n"+
                    "\n                                                                     ay :(\n",
            "Tengo hambre                                                    \n" +
                    "\n                              que coincidencia, yo tambien",
            "Feliz cumpleaños                                              \n"
    };

    int avatar[]={R.drawable.uno,R.drawable.dos,R.drawable.tres,
            R.drawable.cuatro,R.drawable.quinto,R.drawable.sexto};



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        personal = (TextView) findViewById(R.id.personal);
        con = (TextView) findViewById(R.id.con);
        av = (ImageView) findViewById(R.id.av);
        String resultado = getIntent().getStringExtra("resultado");

        int numEntero = Integer.parseInt(resultado);
        personal.setText(contactos[numEntero]);
        con.setText(conversacion[numEntero]);
        av.setImageResource(avatar[numEntero]);
    }
}