package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    TextView descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       String deporteNombre = getIntent().getStringExtra("deporte_nombre");
        descripcion= findViewById(R.id.descripcion);

        TextView txtDeporteEnActivity2 = findViewById(R.id.txtDeporteEnActivity2);
        txtDeporteEnActivity2.setText(deporteNombre);

        if(deporteNombre.equals("Box"))
        {
            descripcion.setText("Deporte de combate en el que dos personas de la misma categoría de peso luchan entre sí golpeándose con los puños, empleando para ello unos guantes especiales y siguiendo unas reglas específicas; se practica sobre un ring o cuadrilátero durante un número determinado de asaltos, generalmente de tres minutos de duración; gana el boxeador que consigue noquear al adversario o, si esto no ocurre, aquel que deciden los jueces.");
        }
        else if(deporteNombre.equals("Basketball")){
            descripcion.setText("El baloncesto, también conocido como básquetbol, basquetbol o simplemente básquet, es un deporte de equipo, jugado entre dos conjuntos de cinco jugadores cada uno en cuatro períodos de cuartos de diez minutos cada uno");

        } else if (deporteNombre.equals("Futbol")) {
            descripcion.setText("El fútbol, futbol o balompié es un deporte de equipo jugado entre dos conjuntos de once jugadores cada uno, mientras los árbitros se ocupan de que las normas se cumplan correctamente.");
        }
    }
}