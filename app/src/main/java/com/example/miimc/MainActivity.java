package com.example.miimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private EditText peso;
    private EditText altura;
    private TextView resultado;
    private TextView bajopeso;
    private TextView ideal;
    private TextView sobrepeso;
    private TextView obesidad;
    private TextView obesidadsevera;
    private TextView obesidadmorbida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = (EditText)findViewById(R.id.editpeso);
        altura = (EditText)findViewById(R.id.editaltura);
        resultado= (TextView)findViewById(R.id.resultado);

        bajopeso= (TextView)findViewById(R.id.textView6);
        ideal= (TextView)findViewById(R.id.textView7);
        sobrepeso= (TextView)findViewById(R.id.textView8);
        obesidad= (TextView)findViewById(R.id.textView9);
        obesidadsevera= (TextView)findViewById(R.id.textView10);
        obesidadmorbida= (TextView)findViewById(R.id.textView11);
    }

    public void IMC(View view){

        String valor1 = peso.getText().toString();
        String valor2 = altura.getText().toString();

        float x = Float.parseFloat(valor1);
        float y = Float.parseFloat(valor2);

        y = y / 100;

        float calculo = x / ( y * y );

        BigDecimal bg = new BigDecimal(calculo).setScale(2, RoundingMode.UP);

        String result = String.valueOf(bg);

        resultado.setText(result);

        if (calculo < 18.5){

            String a = "Tu";

            bajopeso.setText(a);

        }
        if (calculo > 18.6 && calculo < 24.9){

            String a = "Tu";

            ideal.setText(a);

        }
        if (calculo > 25 && calculo < 29.9){

            String a = "Tu";

            sobrepeso.setText(a);

        }
        if (calculo > 30 && calculo < 34.9){

            String a = "Tu";

            obesidad.setText(a);

        }
        if (calculo > 35 && calculo < 39.9){

            String a = "Tu";

            obesidadsevera.setText(a);

        }
        if (calculo > 40){

            String a = "Tu";

            obesidadmorbida.setText(a);

        }
    }

}
