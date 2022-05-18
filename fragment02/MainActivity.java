package com.example.fragment02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

public class MainActivity extends AppCompatActivity implements lista.OnItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            lista firstFragment = new lista();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.flContainer, firstFragment);
            ft.commit();
        }
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.flContainer , new Fragment())
                .commit();
    }
    public void onPizzaItemSelected(int position) {
        Detalle secondFragment = new Detalle();

        Bundle args = new Bundle();
        args.putInt("position", position);
        secondFragment.setArguments(args);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flContainer, secondFragment)
                .addToBackStack(null)
                .commit();
    }
    public void resta(View view){
        Intent intent = new Intent(view.getContext(),MainActivity2.class);
        startActivity(intent);

        //Intent.("Result", String.valueOf(resta));
        //getIntent()
    }

    public void main(View view){
        Intent intent = new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);

        //Intent.("Result", String.valueOf(resta));
        //getIntent()
    }


    public void main2(View view){
        Intent intent = new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);

        //Intent.("Result", String.valueOf(resta));
        //getIntent()
    }

}