package com.example.jogodavelha.models;

import com.example.jogodavelha.MainActivity;
import com.example.jogodavelha.R;

public class ControllerJogoDaVelha {
    private JogoDaVelha game;
    private MainActivity view;
    public ControllerJogoDaVelha(){
        this.view = new MainActivity();
        this.game = new JogoDaVelha();
    }
    public void fazerJogada(int x, int y){
        game.insert(x, y );
    }
    public int getAtual(){
        if (game.getAtual() == 1){
            return  (R.drawable.red_x);
        }
        return (R.drawable.red_o);
    }

}
