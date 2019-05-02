package com.example.jogodavelha.models;

public class JogoDaVelha {

    private int campo[][];
    private int atual;
    private int totalJogadas;

    public JogoDaVelha()
    {
        this.campo = new int[3][3];
        this.atual = 1;
        this.totalJogadas = 9;
    }

    // verifica se o jogo terminou!
    public boolean endGame()
    {
        if(this.isTerminated() ){
            return true;
        }else if(this.totalJogadas == 0){
            return true;
        }
        return false;
    }

    // insere um valor na matriz
    public int insert(int x , int y ){
        this.campo[x][y] = this.atual;
        this.atual = (this.atual+1)%2;
        this.totalJogadas -- ;
        return this.atual;
    }
    // verfica todas as possibilidades de alguem ter vencido o jogo
    private boolean isTerminated()
    {
        // linha superior
        if (campo[0][0] == campo[0][1] && campo[0][1] == campo[0][2]){
            return true;
        }
        // diagonal principal
        if(campo[0][0] == campo[1][1] && campo[1][1] == campo[2][2]){
            return true;
        }
        // coluna direita
        if(campo[0][0] == campo[1][0] && campo[1][0] == campo[2][0]){
            return true;
        }
        if(campo[0][1] == campo[1][1] && campo[1][1]==campo[2][1]){
            return true;
        }
        if (campo[0][2]== campo[1][2] && campo[1][2] == campo[2][2]){
            return true;
        }
        if(campo[0][2] == campo[1][1] && campo[1][1] == campo[2][0]){
            return  true;
        }
        if (campo[1][0] == campo[1][1] && campo[1][1] == campo[1][2]){
            return true;
        }
        if(campo[2][0] == campo[2][1] && campo[2][1] == campo[2][2]){
            return true;
        }
        return false;
    }


}
