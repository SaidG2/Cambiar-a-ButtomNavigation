package com.abdiasgg.punch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Handler;

public class Home extends AppCompatActivity {
    private static final int INTERVALO = 1000; //2 segundos para salir
    private long tiempoPrimerClick;
    @Override
    public void onBackPressed(){
        if (tiempoPrimerClick + INTERVALO > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(this, "Vuelve a presionar para salir", Toast.LENGTH_SHORT).show();
        }
        tiempoPrimerClick = System.currentTimeMillis();
    }
    TextView num1, num2,num3,num4,num5,num6,num7,num8;
    EditText pitch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        boton();
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Heads8Activity.class));
            }
        });
    }
    private void boton() {
        Button heads8 = (Button) findViewById(R.id.button2);
        heads8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, Heads8Activity.class));//Ir a 6 Heads
            }
        });

        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        num3 =findViewById(R.id.num3);
        num4 =findViewById(R.id.num4);
        num5 =findViewById(R.id.num5);
        num6 =findViewById(R.id.num6);
        num7 =findViewById(R.id.num7);
        num8 =findViewById(R.id.num8);

        pitch =findViewById(R.id.pitch);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number,num1,num2,num3,num4,num5,num6,num7,num8;

                double val1=179.625;
                double val2=160.375;
                double val3=136.875;
                double val4=107.125;
                double val5=83.625;
                double val6=64.375;
                double val7=40.875;
                double val8=23.5;


                number=Float.parseFloat(pitch.getText().toString());
                num1=val1/number;
                num2=val2/number;
                num3=val3/number;
                num4=val4/number;
                num5=val5/number;
                num6=val6/number;
                num7=val7/number;
                num8=val8/number;

                Home.this.num1.setText(String.valueOf(Math.round(num1)));
                Home.this.num2.setText(String.valueOf(Math.round(num2)));
                Home.this.num3.setText(String.valueOf(Math.round(num3)));
                Home.this.num4.setText(String.valueOf(Math.round(num4)));
                Home.this.num5.setText(String.valueOf(Math.round(num5)));
                Home.this.num6.setText(String.valueOf(Math.round(num6)));
                Home.this.num7.setText(String.valueOf(Math.round(num7)));
                Home.this.num8.setText(String.valueOf(Math.round(num8)));
            }
        });
    }
}
