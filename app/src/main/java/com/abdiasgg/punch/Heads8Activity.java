package com.abdiasgg.punch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Heads8Activity extends AppCompatActivity {
    TextView num1, num2,num3,num4,num5,num6,num7,num8;
    EditText pitch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heads8);
        boton();
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Heads8Activity.this, Home.class));
            }
        });
    }
    private void boton() {
        Button heads4 = (Button) findViewById(R.id.button2);
        heads4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heads8Activity.this, Home.class));//Ir a 4 Heads
            }
        });/*
        Button heads6 = (Button) findViewById(R.id.button2);
        heads6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heads8Activity.this, Heads6Activity.class));//Ir a 6 Heads
            }
        });*/
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
                num1=val1/number/2;
                num2=val2/number/2;
                num3=val3/number/2;
                num4=val4/number/2;
                num5=val5/number/2;
                num6=val6/number/2;
                num7=val7/number/2;
                num8=val8/number/2;

                Heads8Activity.this.num1.setText(String.valueOf(Math.round(num1)));
                Heads8Activity.this.num2.setText(String.valueOf(Math.round(num2)));
                Heads8Activity.this.num3.setText(String.valueOf(Math.round(num3)));
                Heads8Activity.this.num4.setText(String.valueOf(Math.round(num4)));
                Heads8Activity.this.num5.setText(String.valueOf(Math.round(num5)));
                Heads8Activity.this.num6.setText(String.valueOf(Math.round(num6)));
                Heads8Activity.this.num7.setText(String.valueOf(Math.round(num7)));
                Heads8Activity.this.num8.setText(String.valueOf(Math.round(num8)));
            }
        });
    }
}
/*
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/*
public class MainActivity extends AppCompatActivity {
    TextView textView,textView2;
    EditText editText,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.sum);
        textView2=findViewById(R.id.Ans);
        editText=findViewById(R.id.num1);
        editText2=findViewById(R.id.num2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number,number2,Ans;

                number=Float.parseFloat(editText.getText().toString());
                number2=Float.parseFloat(editText2.getText().toString());
                Ans=number+number2;
                textView2.setText(String.valueOf(Ans));
            }
        });
    }
} */