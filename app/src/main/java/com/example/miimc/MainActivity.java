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
    public float valorimc = -1;
    public TextView estado;

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
        estado = (TextView)findViewById(R.id.textView5);

    }

    public float IMC(View view){


        String valor1 = peso.getText().toString();
        String valor2 = altura.getText().toString();


         float x = Float.parseFloat(valor1);
         float y = Float.parseFloat(valor2);


        y = y / 100;

        float calculo = x / ( y * y );


        BigDecimal bg = new BigDecimal(calculo).setScale(2, RoundingMode.UP);

        String result = String.valueOf(bg);

        resultado.setText(result);

        valorimc = calculo;
        System.out.println(valorimc);
        return valorimc;
    }

    public void Tabla(View view){
        if (valorimc < 0){


        }else{
            if (valorimc < 18.5) {

                String a = "Tu";
                String b = "";
                bajopeso.setText(a);
                ideal.setText(b);
                sobrepeso.setText(b);
                obesidad.setText(b);
                obesidadsevera.setText(b);
                obesidadmorbida.setText(b);

                String est = "Bajo Peso";
                estado.setText(est);


            }
            if (valorimc > 18.6 && valorimc < 24.9) {

                String a = "Tu";

                String b = "";
                bajopeso.setText(b);
                ideal.setText(a);
                sobrepeso.setText(b);
                obesidad.setText(b);
                obesidadsevera.setText(b);
                obesidadmorbida.setText(b);

                String est = "Ideal";
                estado.setText(est);

            }
            if (valorimc > 25 && valorimc < 29.9) {

                String a = "Tu";

                String b = "";
                bajopeso.setText(b);
                ideal.setText(b);
                sobrepeso.setText(a);
                obesidad.setText(b);
                obesidadsevera.setText(b);
                obesidadmorbida.setText(b);

                String est = "Sobre Peso";
                estado.setText(est);

            }
            if (valorimc > 30 && valorimc < 34.9) {

                String a = "Tu";

                String b = "";
                bajopeso.setText(b);
                ideal.setText(b);
                sobrepeso.setText(b);
                obesidad.setText(a);
                obesidadsevera.setText(b);
                obesidadmorbida.setText(b);
                String est = "Obesidad";
                estado.setText(est);

            }
            if (valorimc > 35 && valorimc < 39.9) {

                String a = "Tu";

                String b = "";
                bajopeso.setText(b);
                ideal.setText(b);
                sobrepeso.setText(b);
                obesidad.setText(b);
                obesidadsevera.setText(a);
                obesidadmorbida.setText(b);
                String est = "Obesidad Severa";
                estado.setText(est);

            }
            if (valorimc > 40) {

                String a = "Tu";

                String b = "";
                bajopeso.setText(b);
                ideal.setText(b);
                sobrepeso.setText(b);
                obesidad.setText(b);
                obesidadsevera.setText(b);
                obesidadmorbida.setText(a);
                String est = "Obesidad Morvida";
                estado.setText(est);
            }
        }

    }


}
