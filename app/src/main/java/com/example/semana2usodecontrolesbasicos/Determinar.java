package com.example.semana2usodecontrolesbasicos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class Determinar extends AppCompatActivity {

    Integer estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinar);

        TextView Nombre = (TextView)findViewById(R.id.tvNombreReci);
        TextView Edad = (TextView)findViewById(R.id.tvEdadReci);
        TextView Estado = (TextView)findViewById(R.id.tvEstado);
        Button bVolver = (Button)findViewById(R.id.btnEnviar2);

        Bundle datosRecibidos = this.getIntent().getExtras();

        String nombre = datosRecibidos.getString("cNombre");
        String edad = datosRecibidos.getString("pEdad");

        Nombre.setText("Tu nombre es: "+nombre);
        Edad.setText("Tu edad es: "+edad);

        estado = Integer.parseInt(edad);

        if(estado < 18){
            Estado.setText("Eres menor de edad");
        }
        if(estado > 50){
            Estado.setText("Eres una persona de la tercera edad");
        }
        else{
            Estado.setText("Eres mayor de edad");
        }

        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new
                        Intent(Determinar.this,MainActivity.class);
                startActivity(vuelva);
            }
        });


    }
}