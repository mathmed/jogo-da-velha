package com.example.jogodavelha.models;

import com.example.jogodavelha.MainActivity;
import com.example.jogodavelha.R;

public class ControllerJogoDaVelha {
    private JogoDaVelha game;
    //private MainActivity view;
    public ControllerJogoDaVelha(){
        //this.view = new MainActivity();
        this.game = new JogoDaVelha();
    }
    public void fazerJogada(int x, int y){
        game.insert(x, y );
    }
    public int JogadorDavez(){
        if (game.getAtual() == 1){
            return  (R.drawable.red_x);
        }
        return (R.drawable.red_o);
    }
    public int atual(){
        if (game.getAtual() == 1){
            return (R.string.vezX);
        }
        return R.string.vezO;
    }

}
