package com.example.jogodavelha.models;

public class JogoDaVelha {

    private int campo[][];
    private int atual;
    private int anterior;
    private int totalJogadas;

    public JogoDaVelha()
    {
        this.campo = new int[3][3];
        this.atual = 1;
        this.anterior = 0;
        this.totalJogadas = 9;
        this.zerarMatriz();
    }

    public void zerarMatriz(){
        for (int i = 0 ; i <3 ;i++){
            for(int j= 0 ; j<3 ; j++){
                this.campo[i][j] = -1;
            }

        }
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
    public void restoreTotalJogadas(){
        this.totalJogadas = 9;
    }
    public int getAtual(){

        return this.atual;
    }
    public int getTotalJogadas(){
        return this.totalJogadas;
    }
    // insere um valor na matriz
    public int insert(int x , int y ){
        if(this.campo[x][y] == -1){
            this.campo[x][y] = this.atual;
            this.anterior = this.atual;
            this.atual = (this.atual+1)%2;
            this.totalJogadas -- ;
        }
        return this.atual;
    }
    public int getAnterior(){
        return this.anterior;
    }
    // verfica todas as possibilidades de alguem ter vencido o jogo
    public boolean isTerminated()
    {
        // linha superior
        if (campo[0][0] == campo[0][1] && campo[0][1] == campo[0][2]){
            return campo[0][0] != -1;
        }
        // diagonal principal
        if(campo[0][0] == campo[1][1] && campo[1][1] == campo[2][2]){
            return campo[0][0] != -1;
        }
        // coluna direita
        if(campo[0][0] == campo[1][0] && campo[1][0] == campo[2][0]){
            return campo[0][0] != -1;
        }
        if(campo[0][1] == campo[1][1] && campo[1][1]==campo[2][1]){
            return campo[0][1] != -1;
        }
        if (campo[0][2]== campo[1][2] && campo[1][2] == campo[2][2]){
            return campo[0][2] != -1;
        }
        if(campo[0][2] == campo[1][1] && campo[1][1] == campo[2][0]){
            return campo[0][2] != -1;
        }
        if (campo[1][0] == campo[1][1] && campo[1][1] == campo[1][2]){
            return campo[1][0] != -1;
        }
        if(campo[2][0] == campo[2][1] && campo[2][1] == campo[2][2]){
            return campo[2][0] != -1;
        }
        return false;
    }


}
