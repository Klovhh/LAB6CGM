package com.example.lab6cgm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private int[] arr = {1, 2, 3, 3, 5, 6, 7, 8, 9, 10};
    private int numeroBusqueda;
    private EditText texto;

    private TextView textoResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.numeroBusquedaTxt);
        textoResultado = findViewById(R.id.resultado);

    }


    public void countOccurrences(View view) {
        numeroBusqueda = Integer.parseInt(texto.getText().toString());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numeroBusqueda) {
                count++;
            }
        }
        textoResultado.setText("Numero de ocurrencias: "+count);

    }

    public void searchNumber(View view) {
        numeroBusqueda = Integer.parseInt(texto.getText().toString());
        int count2 = 0;
        for (int j : arr) {
            if (j == numeroBusqueda) {
                count2++;
            }
        }
        if(count2 > 0){
            textoResultado.setText("Se ha encontrado el numero");
        }else if (count2 == 0)textoResultado.setText("NO Se ha encontrado el numero");
        System.out.println(count2);
    }
}
