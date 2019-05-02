package com.example.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.jogodavelha.models.ControllerJogoDaVelha;

public class MainActivity extends AppCompatActivity {

    private ImageView pos00;
    private ImageView pos01;
    private ImageView pos02;
    private ImageView pos10;
    private ImageView pos11;
    private ImageView pos12;
    private ImageView pos20;
    private ImageView pos21;
    private ImageView pos22;

    private ControllerJogoDaVelha controller;

    public MainActivity(){
        this.controller = new ControllerJogoDaVelha();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pos00 = (ImageView) findViewById(R.id.pos00);
        pos01 = (ImageView) findViewById(R.id.pos01);
        pos02 = (ImageView) findViewById(R.id.pos02);
        pos10 = (ImageView) findViewById(R.id.pos10);
        pos11 = (ImageView) findViewById(R.id.pos11);
        pos12 = (ImageView) findViewById(R.id.pos12);
        pos20 = (ImageView) findViewById(R.id.pos20);
        pos21 = (ImageView) findViewById(R.id.pos21);
        pos22 = (ImageView) findViewById(R.id.pos22);
        this.initEventos();


    }
    public void initEventos(){
        this.pos00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos00.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(0 , 0);
            }
        });
        this.pos01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos01.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(0 , 1);
            }
        });
        this.pos02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos02.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(0 , 2);
            }
        });
        this.pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos10.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(1 , 0);
            }
        });
        this.pos11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos11.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(1 , 1);
            }
        });
        this.pos12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos12.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(1 , 2);
            }
        });
        this.pos20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos20.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(2 , 0);
            }
        });
        this.pos21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos21.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(2 , 1);
            }
        });
        this.pos22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.pos22.setImageResource(MainActivity.this.controller.vez());
                MainActivity.this.controller.fazerJogada(2 , 2);
            }
        });
    }

}
