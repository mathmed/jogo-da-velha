package com.example.jogodavelha;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
    private TextView tv_vez;

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

        tv_vez = (TextView) findViewById(R.id.tv_vez);
        this.initEventos();

    }
    public void initEventos(){
        this.pos00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos00, 0 , 0);
            }
        });
        this.pos01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos01, 0 , 1);
                }
        });
        this.pos02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos02, 0 , 2);
            }
        });
        this.pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos10, 1 , 0);
            }
        });
        this.pos11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos11, 1, 1);
            }
        });
        this.pos12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos12, 1 , 2);
            }
        });
        this.pos20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos20, 2 , 0);
            }
        });
        this.pos21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.jogar(pos21, 2 , 1);
            }
        });
        this.pos22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.this.jogar(pos22, 2 , 2);

            }
        });
    }
    public void jogar(ImageView img,int x, int y){
        int i =this.controller.fazerJogada(x, y);
        if (i == 2){
            this.finishGame();
            this.tv_vez.setText(R.string.finishGame);
        }else if(i == 0 ){
            img.setImageResource(MainActivity.this.controller.JogadorDavez());
            this.tv_vez.setText(getString(R.string.agoraEaVez)+" : "+ getString(MainActivity.this.controller.anterior()));
        }
    }
    public void finishGame()
    {
        if(this.controller.haveWinner()){
            new AlertDialog.Builder(this).setTitle("Há um vencedor").setMessage("O jogador com "+getString(this.controller.atual())+" venceu! clique em continuar ").setCancelable(false).
                    setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.clearGame();
                            MainActivity.this.tv_vez.setText(getString(R.string.agoraEaVez)+ getString(MainActivity.this.controller.atual()));

                        }
                    }).show();

        }else {
            new AlertDialog.Builder(this).setTitle("O jogo finalizou sem vencedor").setMessage("Clique em continuar para inicar outra partida!").setCancelable(false).
                    setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.clearGame();
                            MainActivity.this.tv_vez.setText(getString(R.string.agoraEaVez)+ getString(MainActivity.this.controller.atual()));
                        }
                    }).show();

        }

    }

    public void clearGame(){
        this.pos00.setImageResource(0);
        this.pos01.setImageResource(0);
        this.pos02.setImageResource(0);
        this.pos10.setImageResource(0);
        this.pos11.setImageResource(0);
        this.pos12.setImageResource(0);
        this.pos20.setImageResource(0);
        this.pos21.setImageResource(0);
        this.pos22.setImageResource(0);
        this.controller.restartGame();



    }
}
