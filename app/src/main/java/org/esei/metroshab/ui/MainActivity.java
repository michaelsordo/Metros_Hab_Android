package org.esei.metroshab.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.esei.metroshab.R;
import org.esei.metroshab.core.CalcularMetros;

public class MainActivity extends AppCompatActivity {

    public int resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado=0;
    }

    public void calcularmetros(View view){

        EditText ancho = (EditText) this.findViewById(R.id.ancho);
        EditText alto = (EditText) this.findViewById(R.id.alto);

        String value = ancho.getText().toString();
        int an = Integer.parseInt( value );

        String value2 = alto.getText().toString();
        int al = Integer.parseInt( value2 );

        resultado = (an*al);
        TextView prueba = (TextView) findViewById(R.id.resultado);
        if(an==0 || al==0){
            prueba.setText("Valores incorrectos");
        }else{
            prueba.setText(resultado + " metros cuadrados");
        }


    }





}