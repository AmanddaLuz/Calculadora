package com.aluz.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.common.util.NumberUtils;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText numero1EditText, numero2EditText;
    Button adicaoButton, subtracaoButton, multiplicacaoButton, divisaoButton;
    TextView resultadoTextView;
    double numero1, numero2, resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vinculoComponentes();
        newListeners();
//        criarListeners();
    }
    private void vinculoComponentes(){
        numero1EditText = findViewById(R.id.numero1EditText);
        numero2EditText = findViewById(R.id.numero2EditText);
        adicaoButton = findViewById(R.id.adicaoButton);
        subtracaoButton = findViewById(R.id.subtracaoButton);
        multiplicacaoButton = findViewById(R.id.multiplicacaoButton);
        divisaoButton = findViewById(R.id.divisaoButton);
        resultadoTextView = findViewById(R.id.resultadoTxtView);
    }
//    private void criarListeners() {
//        adicaoButton.setOnClickListener(evt -> tratarDados("A"));
//        subtracaoButton.setOnClickListener(evt -> tratarDados("S"));
//        multiplicacaoButton.setOnClickListener(evt -> tratarDados("M"));
//        divisaoButton.setOnClickListener(evt -> tratarDados("D"));
//    }
//
//    private void tratarDados(String operacao) {
//        String numero1String = numero1EditText.getText().toString();
//        String numero2String = numero2EditText.getText().toString();
//
//        if (numero1String.isEmpty() || numero2String.isEmpty()) {
//            Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//
//        numero1EditText.setText("");
//        numero2EditText.setText("");
//
//        numero1 = Double.parseDouble(numero1String);
//        numero2 = Double.parseDouble(numero2String);
//        if (numero2String.equals("0") && operacao == "D") {
//            Toast.makeText(this, "Não é possível dividir por zero. Noob", Toast.LENGTH_SHORT).show();
//            resultadoTextView.setText("");
//            return;
//        }
//
//
//        if (operacao == "A") {
//            resultado = numero1 + numero2;
//        } else if (operacao == "S") {
//            resultado = numero1 - numero2;
//        } else if (operacao == "M") {
//            resultado = numero1 * numero2;
//        } else if (operacao == "D") {
//            resultado = numero1 / numero2;
//        }
//
//        resultadoTextView.setText(String.valueOf(resultado));
//        resultado = numero1 = numero2 =  0;
//
//    }
    private void newListeners() {
        adicaoButton.setOnClickListener(evt -> adicionar());
        subtracaoButton.setOnClickListener(evt -> subtrair());
        multiplicacaoButton.setOnClickListener(evt -> multiplicar());
        divisaoButton.setOnClickListener(evt -> dividir());

    }
    private void tratarDados() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();

        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
            return;
        }
        numero1 = Double.parseDouble(numero1String);
        numero2 = Double.parseDouble(numero2String);

        numero1EditText.setText("");
        numero2EditText.setText("");
    }
    public void adicionar() {
        tratarDados();
        resultado = numero1 + numero2;
        resultadoTextView.setText(String.valueOf(resultado));
        resultado = numero1 = numero2 =  0;


    }
    public void subtrair() {
        tratarDados();
        resultado = numero1 - numero2;
        resultadoTextView.setText(String.valueOf(resultado));
        resultado = numero1 = numero2 =  0;

    }
    public void multiplicar() {
        tratarDados();
        resultado = numero1 * numero2;
        resultadoTextView.setText(String.valueOf(resultado));
        resultado = numero1 = numero2 =  0;

    }
    public void dividir() {
        tratarDados();
        resultado = numero1 / numero2;
        resultadoTextView.setText(String.valueOf(resultado));
        resultado = numero1 = numero2 =  0;

    }


}