package com.example.jogodavelha.models;

import com.example.jogodavelha.R;

public class ControllerJogoDaVelha {
    private JogoDaVelha game;
    //private MainActivity view;
    public ControllerJogoDaVelha(){
        //this.view = new MainActivity();
        this.game = new JogoDaVelha();
    }
    public int fazerJogada(int x, int y)
    {
        if(this.game.getAtual() == this.game.insert(x, y )){
            return 1;

        }
        if (this.game.endGame()){
            return 2;
        }
        return 0;

    };

  //  public boolean winner(){
//        return this.game.isTerminated();
    //}
    public void restartGame(){
        this.game.zerarMatriz();
        this.game.restoreTotalJogadas();
    }
    public boolean jogoTruncado(){
        return this.game.getTotalJogadas() == 0;
    }
    public int JogadorDavez(){
        if (this.game.getAtual() == 1){
            return  (R.drawable.red_x);
        }
        return (R.drawable.red_o);
    }

    public int atual(){
        if (this.game.getAtual() == 1){
            return (R.string.vezX);
        }
        return R.string.vezO;
    }
    public int anterior(){
        if (this.game.getAnterior() == 0){
            return (R.string.vezO);
        }
        return R.string.vezX;
    }
    public boolean haveWinner(){
        return this.game.isTerminated();
    }
}
