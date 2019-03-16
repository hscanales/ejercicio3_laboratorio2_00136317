package tech.visuallatam.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int[] rojo,verde,azul;
    View r,g,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargar();
        clickers();
    }


    private void cargar() {
        r=findViewById(R.id.red);
        g=findViewById(R.id.green);
        b=findViewById(R.id.blue);

        rojo = new int[7];
        rojo[0] = getResources().getColor(R.color.rojo);
        rojo[1] = getResources().getColor(R.color.rojo2);
        rojo[2] = getResources().getColor(R.color.rojo3);
        rojo[3] = getResources().getColor(R.color.rojo4);
        rojo[4] = getResources().getColor(R.color.rojo5);
        rojo[5] = getResources().getColor(R.color.rojo6);


        azul = new int[7];
        azul[0] = getResources().getColor(R.color.azul);
        azul[1] = getResources().getColor(R.color.azul2);
        azul[2] = getResources().getColor(R.color.azul3);
        azul[3] = getResources().getColor(R.color.azul4);
        azul[4] = getResources().getColor(R.color.azul5);
        azul[5] = getResources().getColor(R.color.azul6);


        verde = new int[7];
        verde[0] = getResources().getColor(R.color.verde);
        verde[1] = getResources().getColor(R.color.verde2);
        verde[2] = getResources().getColor(R.color.verde3);
        verde[3] = getResources().getColor(R.color.verde4);
        verde[4] = getResources().getColor(R.color.verde5);
        verde[5] = getResources().getColor(R.color.verde6);

    }


    private void clickers() {
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero= (int)(Math.random()*6);
                r.setBackgroundColor(rojo[numero]);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero= (int)(Math.random()*6);
                g.setBackgroundColor(verde[numero]);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero= (int)(Math.random()*6);
                b.setBackgroundColor(azul[numero]);
            }
        });
    }

}
