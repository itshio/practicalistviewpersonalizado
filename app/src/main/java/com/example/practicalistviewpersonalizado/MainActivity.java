package com.example.practicalistviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvcoches;
    ArrayList<Coche> lista_coches = new ArrayList<Coche>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();


         lvcoches =(ListView)findViewById(R.id.lvcoches);
        Adaptadorcoche adaptador= new Adaptadorcoche(this, lista_coches);
        lvcoches.setAdapter(adaptador);

    }


    private void cargarDatos(){

        lista_coches.add(new Coche("Seat","Alhambra","alhambra",13000.));

        lista_coches.add(new Coche("Seat","Altea","altea",17500.));

        lista_coches.add(new Coche("Seat","Arona","arona",12300.));

        lista_coches.add(new Coche("Seat","Ateca","ateca",21500.));

        lista_coches.add(new Coche("Seat","Bocanegra","bocanegra",19000.));

        lista_coches.add(new Coche("Seat","Cupra","cupra",18500.));

        lista_coches.add(new Coche("Seat","Leon","leon",14900.));

        lista_coches.add(new Coche("Seat","Ibiza","ibiza",9000.));


    }




}
