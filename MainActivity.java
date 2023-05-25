package com.example.NOMBRE_DE_TU_PROYECTO;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextGrade1, editTextGrade2, editTextGrade3;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextGrade1 = findViewById(R.id.editTextGrade1);
        editTextGrade2 = findViewById(R.id.editTextGrade2);
        editTextGrade3 = findViewById(R.id.editTextGrade3);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }

    private void calcularPromedio() {
        double Primero = Double.parseDouble(editTextGrade1.getText().toString());
        double Segundo = Double.parseDouble(editTextGrade2.getText().toString());
        double Tercero = Double.parseDouble(editTextGrade3.getText().toString());

        double promedio = (Primero + Segundo + Tercero) / 3;

        String resultText = "Promedio: " + promedio;

        if (promedio >= 6.0) {
            resultText += " (Aprobado)";
        } else {
            resultText += " (Reprobado)";
        }

        textViewResult.setText(resultText);
    }
}
