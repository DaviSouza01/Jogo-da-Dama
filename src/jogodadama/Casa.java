package jogodadama;

import javax.swing.*;

public class Casa {

    private Pecas peca;
    private byte linha;
    private byte coluna;
    private String nome;

    // [0][1][2][3] = movimentações possíveis
    // [4][5][6][7] = comidas possíveis
    public Casa[] vetorCasas = new Casa[8];

    public Casa(Pecas peca, byte linha, byte coluna, String nome, Casa casaM1, Casa casaM2, Casa casaM3, Casa casaM4,
            Casa casaF1, Casa casaF2, Casa casaF3, Casa casaF4) {
        this.peca = peca;
        this.linha = linha;
        this.coluna = coluna;
        this.nome = nome;
        this.vetorCasas[0] = casaM1;
        this.vetorCasas[1] = casaM2;
        this.vetorCasas[2] = casaM3;
        this.vetorCasas[3] = casaM4;
        this.vetorCasas[4] = casaF1;
        this.vetorCasas[5] = casaF2;
        this.vetorCasas[6] = casaF3;
        this.vetorCasas[7] = casaF4;
    }

    public void atualizarCasas(Casa casaM1, Casa casaM2, Casa casaM3, Casa casaM4,
            Casa casaF1, Casa casaF2, Casa casaF3, Casa casaF4) {
        this.vetorCasas[0] = casaM1;
        this.vetorCasas[1] = casaM2;
        this.vetorCasas[2] = casaM3;
        this.vetorCasas[3] = casaM4;
        this.vetorCasas[4] = casaF1;
        this.vetorCasas[5] = casaF2;
        this.vetorCasas[6] = casaF3;
        this.vetorCasas[7] = casaF4;
    }

    public Pecas getPeca() {
        return this.peca;
    }

    public void setPeca(Pecas peca) {
        this.peca = peca;
    }

    public void setCasas(Casa vetorCasas[]) {
        this.vetorCasas = vetorCasas;
    }

    public void definirPeca(Pecas peca) {
        this.peca = peca;
    }

    public String getNome(){
        return this.nome;
    }
    
}
