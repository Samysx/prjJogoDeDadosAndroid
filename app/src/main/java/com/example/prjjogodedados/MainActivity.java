package com.example.prjjogodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnJogar;
    ImageView Dado1;
    ImageView Dado2;

    TextView txtEmpates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);
        Dado1 = findViewById(R.id.Dado1);
        Dado2 = findViewById(R.id.Dado2);
        txtEmpates = findViewById(R.id.txtEmpates);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = (int) (7 * Math.random()) + 1;
                int n2 = (int) (7* Math.random())+ 1;

                if(n == 1){
                    Dado1.setImageResource(R.drawable.image1);
                }
                if(n == 2){
                    Dado1.setImageResource(R.drawable.image2);
                }
                if(n == 3){
                    Dado1.setImageResource(R.drawable.image3);
                }
                if(n == 4){
                    Dado1.setImageResource(R.drawable.image4);
                }
                if(n == 5){
                    Dado1.setImageResource(R.drawable.image5);
                }
                if(n == 6){
                    Dado1.setImageResource(R.drawable.image6);
                }

                if(n2 == 1){
                    Dado2.setImageResource(R.drawable.image1);
                }
                if(n2 == 2){
                    Dado2.setImageResource(R.drawable.image2);
                }
                if(n2 == 3){
                    Dado2.setImageResource(R.drawable.image3);
                }
                if(n2 == 4){
                    Dado2.setImageResource(R.drawable.image4);
                }
                if(n2 == 5){
                    Dado2.setImageResource(R.drawable.image5);
                }
                if(n2 == 6){
                    Dado2.setImageResource(R.drawable.image6);
                }
                if(n == n2){
                    int empate = Integer.parseInt(txtEmpates.getText().toString());
                    int pate = empate + 1;
                    txtEmpates.setText(pate+"");
                }
            }
        });
    }
}