package com.example.prueba;
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
    Context context;
    String[] contactos;
    String[] conversacion;
    String [] fechas;
    int [] avatar;

    //generar constructor
    public Datos(Context context,String[] contactos,String[] conversacion, String[] fechas, int[] avatar) {
        this.context = context;
        this.contactos = contactos;
        this.conversacion = conversacion;
        this.fechas = fechas;
        this.avatar = avatar;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    //generar vista y asignar mediante inflate los elementos del archivo xml
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = inflater.inflate(R.layout.item_fila,null);

        //referenciar
        TextView Titulo= vista.findViewById(R.id.contacto);
        TextView Descripcion = vista.findViewById(R.id.fecha);
        TextView Conversacion = vista.findViewById(R.id.con);
        ImageView Avatar = vista.findViewById(R.id.avatar);


        //asignar datos a cada una de las posiciones
        Titulo.setText(contactos[position]);
        Descripcion.setText(fechas[position]);
        Conversacion.setText(conversacion[position]);
        Avatar.setImageResource(avatar[position]);



        return vista;
    }
    //generar gets
    @Override
    public int getCount() {return avatar.length;}

    @Override
    public Object getItem(int position) {return null;}

    @Override
    public long getItemId(int position) {return 0;}


}