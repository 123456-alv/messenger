package com.example.fragment02;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
class Datos extends BaseAdapter {
    /*variables globales
    layout inflater se utiliza para instanciar el archivo de diseño
    y que se muestre en MainActivity
     */
    LayoutInflater inflater=null;
    //generar los datos
   /* Context context;
    String[] titulos;
    String [] descripciones;*/
    int [] avatar1;
    int [] avatar;

    //generar constructor
    public Datos(Context context,int[] avatar1,/* String[] descripciones,*/ int[] avatar) {
       // this.context = context;
        //this.titulos = titulos;
        //this.descripciones = descripciones;
        this.avatar1 = avatar1;
        this.avatar = avatar;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    //generar vista y asignar mediante inflate los elementos del archivo xml
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = inflater.inflate(R.layout.historias,null);
        //referenciar

        ImageView Avatar1 = vista.findViewById(R.id.avatar1);
        ImageView Avatar = vista.findViewById(R.id.avatar);

        //asignar datos a cada una de las posiciones

        Avatar1.setImageResource(avatar1[position]);
        Avatar.setImageResource(avatar[position]);

        return vista;
    }
    //generar gets
    @Override
    public int getCount() {return avatar1.length;}

    @Override
    public Object getItem(int position) {return null;}

    @Override
    public long getItemId(int position) {return 0;}


}