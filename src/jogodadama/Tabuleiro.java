package jogodadama;

import javax.swing.*;

public class Tabuleiro {
    
    private Casa[][] tabuleiro = new Casa[8][8];
    
    /* NÚMEROS DO TABULEIRO ESCONDIDO REFERENTES A CADA IMAGEM PARA AS JLABEL
        pecaBranca = 1;
        pecaPreta = 2;
        pecaBrancaApertada = 3;
        pecaPretaApertada = 4;
        rainhaBranca = 5;
        rainhaPreta = 6;
        rainhaBrancaApertada = 7;
        rainhaPretaApertada = 8;
        posicaoFutura = 9;
    */
    
    public void iniciarTabuleiro(){
        //PRIMEIRA LINHA
        tabuleiro[0][0] = null;
        tabuleiro[0][1] = new Casa(new Pecas((byte) 2), (byte) 0, (byte) 1, "b1", null, null, tabuleiro[1][0], 
                tabuleiro[1][2], null, null, null, tabuleiro[2][3]);
        tabuleiro[0][2] = null;
        tabuleiro[0][3] = new Casa(new Pecas((byte) 2), (byte) 0, (byte) 3, "b2", null, null, tabuleiro[1][2], 
                tabuleiro[1][4], null, null, tabuleiro[2][1], tabuleiro[2][5]);
        tabuleiro[0][4] = null;
        tabuleiro[0][5] = new Casa(new Pecas((byte) 2), (byte) 0, (byte) 5, "b3", null, null, tabuleiro[1][4], 
                tabuleiro[1][6], null, null, tabuleiro[2][3], tabuleiro[2][7]);
        tabuleiro[0][6] = null;
        tabuleiro[0][7] = new Casa(new Pecas((byte) 2), (byte) 0, (byte) 7, "b4", null, null, tabuleiro[1][6], 
                null, null, null, tabuleiro[2][5], null);
        
        //SEGUNDA LINHA
        tabuleiro[1][0] = new Casa(new Pecas((byte) 2), (byte) 1, (byte) 0, "b5", null, tabuleiro[0][1], null, 
                tabuleiro[2][1], null, null, null, tabuleiro[3][2]);
        tabuleiro[1][1] = null;
        tabuleiro[1][2] = new Casa(new Pecas((byte) 2), (byte) 1, (byte) 2, "b6", tabuleiro[0][1], tabuleiro[0][3], tabuleiro[2][1], 
                tabuleiro[2][3], null, null, tabuleiro[3][0], tabuleiro[3][4]);
        tabuleiro[1][3] = null;
        tabuleiro[1][4] = new Casa(new Pecas((byte) 2), (byte) 1, (byte) 4, "b7", tabuleiro[0][3], tabuleiro[0][5], tabuleiro[2][3], 
                tabuleiro[2][5], null, null, tabuleiro[3][2], tabuleiro[3][6]);
        tabuleiro[1][5] = null;
        tabuleiro[1][6] = new Casa(new Pecas((byte) 2), (byte) 1, (byte) 6, "b8", tabuleiro[0][5], tabuleiro[0][7], tabuleiro[2][5], 
                tabuleiro[2][7], null, null, tabuleiro[3][4], null);
        tabuleiro[1][7] = null;
        
        //TERCEIRA LINHA
        tabuleiro[2][0] = null;
        tabuleiro[2][1] = new Casa(new Pecas((byte) 2), (byte) 2, (byte) 1, "b9", tabuleiro[1][0], tabuleiro[1][2], tabuleiro[3][0], 
                tabuleiro[3][2], null, tabuleiro[0][3], null, tabuleiro[4][3]);
        tabuleiro[2][2] = null;
        tabuleiro[2][3] = new Casa(new Pecas((byte) 2), (byte) 2, (byte) 3, "b10", tabuleiro[1][2], tabuleiro[1][4], tabuleiro[3][2], 
                tabuleiro[3][4], tabuleiro[0][1], tabuleiro[0][5], tabuleiro[4][1], tabuleiro[4][5]);
        tabuleiro[2][4] = null;
        tabuleiro[2][5] = new Casa(new Pecas((byte) 2), (byte) 2, (byte) 5, "b11", tabuleiro[1][4], tabuleiro[1][6], tabuleiro[3][4], 
                tabuleiro[3][6], tabuleiro[0][3], tabuleiro[0][7], tabuleiro[4][3], tabuleiro[4][7]);
        tabuleiro[2][6] = null;
        tabuleiro[2][7] = new Casa(new Pecas((byte) 2), (byte) 2, (byte) 7, "b12", tabuleiro[1][6], null, tabuleiro[3][6], 
                null, tabuleiro[0][5], null, tabuleiro[4][5], null);
        
        //QUARTA LINHA
        tabuleiro[3][0] = new Casa(null, (byte) 3, (byte) 0, "b13", null, tabuleiro[2][1], null,
                tabuleiro[4][1], null, tabuleiro[1][2], null, tabuleiro[5][2]);
        tabuleiro[3][1] = null;
        tabuleiro[3][2] = new Casa(null, (byte) 3, (byte) 2, "b14", tabuleiro[2][1], tabuleiro[2][3], tabuleiro[4][1], 
                tabuleiro[4][3], tabuleiro[1][0], tabuleiro[1][4], tabuleiro[5][0], tabuleiro[5][4]);
        tabuleiro[3][3] = null;
        tabuleiro[3][4] = new Casa(null, (byte) 3, (byte) 4, "b15", tabuleiro[2][3], tabuleiro[2][5], tabuleiro[4][3], 
                tabuleiro[4][5], tabuleiro[1][2], tabuleiro[1][6], tabuleiro[5][2], tabuleiro[5][6]);
        tabuleiro[3][5] = null;
        tabuleiro[3][6] = new Casa(null, (byte) 3, (byte) 6, "b16", tabuleiro[2][5], tabuleiro[2][7], tabuleiro[4][5], 
                tabuleiro[4][7], tabuleiro[1][4], null, tabuleiro[5][4], null);
        tabuleiro[3][7] = null;
        
        //QUINTA LINHA
        tabuleiro[4][0] = null;
        tabuleiro[4][1] = new Casa(null, (byte) 4, (byte) 1, "b17", tabuleiro[3][0], tabuleiro[3][2], tabuleiro[5][0], 
                tabuleiro[5][2], null, tabuleiro[2][3], null, tabuleiro[6][3]);
        tabuleiro[4][2] = null;
        tabuleiro[4][3] = new Casa(null, (byte) 4, (byte) 3, "b18", tabuleiro[3][2], tabuleiro[3][4], tabuleiro[5][2], 
                tabuleiro[5][4], tabuleiro[2][1], tabuleiro[2][5], tabuleiro[6][1], tabuleiro[6][5]);
        tabuleiro[4][4] = null;
        tabuleiro[4][5] = new Casa(null, (byte) 4, (byte) 5, "b19", tabuleiro[3][4], tabuleiro[3][6], tabuleiro[5][4], 
                tabuleiro[5][6], tabuleiro[2][3], tabuleiro[2][7], tabuleiro[6][3], tabuleiro[6][7]);
        tabuleiro[4][6] = null;
        tabuleiro[4][7] = new Casa(null, (byte) 4, (byte) 7, "b20", tabuleiro[3][6], null, tabuleiro[5][6], 
                null, tabuleiro[2][5], null, tabuleiro[6][5], null);
        
        //SEXTA LINHA
        tabuleiro[5][0] = new Casa(new Pecas((byte) 1), (byte) 5, (byte) 0, "b21", null, tabuleiro[4][1], null, 
                tabuleiro[6][1], null, tabuleiro[3][2], null, tabuleiro[7][2]);
        tabuleiro[5][1] = null;
        tabuleiro[5][2] = new Casa(new Pecas((byte) 1), (byte) 5, (byte) 2, "b22", tabuleiro[4][1], tabuleiro[4][3], tabuleiro[6][1], 
                tabuleiro[6][3], tabuleiro[3][0], tabuleiro[3][4], tabuleiro[7][0], tabuleiro[7][4]);
        tabuleiro[5][3] = null;
        tabuleiro[5][4] = new Casa(new Pecas((byte) 1), (byte) 5, (byte) 4, "b23", tabuleiro[4][3], tabuleiro[4][5], tabuleiro[6][3], 
                tabuleiro[6][5], tabuleiro[3][2], tabuleiro[3][6], tabuleiro[7][2], tabuleiro[7][6]);
        tabuleiro[5][5] = null;
        tabuleiro[5][6] = new Casa(new Pecas((byte) 1), (byte) 5, (byte) 6, "b24", tabuleiro[4][5], tabuleiro[4][7], tabuleiro[6][5], 
                tabuleiro[6][7], tabuleiro[3][4], null, tabuleiro[7][4], null);
        tabuleiro[5][7] = null;
        
        //SÉTIMA LINHA
        tabuleiro[6][0] = null;
        tabuleiro[6][1] = new Casa(new Pecas((byte) 1), (byte) 6, (byte) 1, "b25", tabuleiro[5][0], tabuleiro[5][2], tabuleiro[7][0], 
                tabuleiro[7][2], null, tabuleiro[4][3], null, null);
        tabuleiro[6][2] = null;
        tabuleiro[6][3] = new Casa(new Pecas((byte) 1), (byte) 6, (byte) 3, "b26", tabuleiro[5][2], tabuleiro[5][4], tabuleiro[7][2], 
                tabuleiro[7][4], tabuleiro[4][1], tabuleiro[4][5], null, null);
        tabuleiro[6][4] = null;
        tabuleiro[6][5] = new Casa(new Pecas((byte) 1), (byte) 6, (byte) 5, "b27", tabuleiro[5][4], tabuleiro[5][6], tabuleiro[7][4], 
                tabuleiro[7][6], tabuleiro[4][3], tabuleiro[4][7], null, null);
        tabuleiro[6][6] = null;
        tabuleiro[6][7] = new Casa(new Pecas((byte) 1), (byte) 6, (byte) 7, "b28", tabuleiro[5][6], null, tabuleiro[7][6], 
                null, tabuleiro[4][5], null, null, null);
        
        //OITAVA LINHA
        tabuleiro[7][0] = new Casa(new Pecas((byte) 1), (byte) 7, (byte) 0, "b29", null, tabuleiro[6][1], null, 
                null, null, tabuleiro[5][2], null, null);
        tabuleiro[7][1] = null;
        tabuleiro[7][2] = new Casa(new Pecas((byte) 1), (byte) 7, (byte) 2, "b30", tabuleiro[6][1], tabuleiro[6][3], null, 
                null, tabuleiro[5][0], tabuleiro[5][4], null, null);
        tabuleiro[7][3] = null;
        tabuleiro[7][4] = new Casa(new Pecas((byte) 1), (byte) 7, (byte) 4, "b31", tabuleiro[6][3], tabuleiro[6][5], null, 
                null, tabuleiro[5][2], tabuleiro[5][6], null, null);
        tabuleiro[7][5] = null;
        tabuleiro[7][6] = new Casa(new Pecas((byte) 1), (byte) 7, (byte) 6, "b32", tabuleiro[6][5], tabuleiro[6][7], null, 
                null, tabuleiro[5][4], null, null, null);
        tabuleiro[7][7] = null;
    }
    
    public void atualizarCasas(){
        tabuleiro[0][1].atualizarCasas(null, null, tabuleiro[1][0], tabuleiro[1][2], null, null, null, tabuleiro[2][3]);
        tabuleiro[0][3].atualizarCasas(null, null, tabuleiro[1][2],tabuleiro[1][4], null, null, tabuleiro[2][1], tabuleiro[2][5]);
        tabuleiro[0][5].atualizarCasas(null, null, tabuleiro[1][4],tabuleiro[1][6], null, null, tabuleiro[2][3], tabuleiro[2][7]);
        tabuleiro[0][7].atualizarCasas(null, null, tabuleiro[1][6],null, null, null, tabuleiro[2][5], null);
        tabuleiro[1][0].atualizarCasas(null, tabuleiro[0][1], null,tabuleiro[2][1], null, null, null, tabuleiro[3][2]);
        tabuleiro[1][2].atualizarCasas(tabuleiro[0][1], tabuleiro[0][3], tabuleiro[2][1],tabuleiro[2][3], null, null, tabuleiro[3][0], tabuleiro[3][4]);
        tabuleiro[1][4].atualizarCasas(tabuleiro[0][3], tabuleiro[0][5], tabuleiro[2][3],tabuleiro[2][5], null, null, tabuleiro[3][2], tabuleiro[3][6]);
        tabuleiro[1][6].atualizarCasas( tabuleiro[0][5], tabuleiro[0][7], tabuleiro[2][5],tabuleiro[2][7], null, null, tabuleiro[3][4], null); 
        tabuleiro[2][1].atualizarCasas(tabuleiro[1][0], tabuleiro[1][2], tabuleiro[3][0],tabuleiro[3][2], null, tabuleiro[0][3], null, tabuleiro[4][3]);
        tabuleiro[2][3].atualizarCasas(tabuleiro[1][2], tabuleiro[1][4], tabuleiro[3][2],tabuleiro[3][4], tabuleiro[0][1], tabuleiro[0][5], tabuleiro[4][1], tabuleiro[4][5]); 
        tabuleiro[2][5].atualizarCasas(tabuleiro[1][4], tabuleiro[1][6], tabuleiro[3][4],tabuleiro[3][6], tabuleiro[0][3], tabuleiro[0][7], tabuleiro[4][3], tabuleiro[4][7]);
        tabuleiro[2][7].atualizarCasas(tabuleiro[1][6], null, tabuleiro[3][6],null, tabuleiro[0][5], null, tabuleiro[4][5], null);
        tabuleiro[3][0].atualizarCasas(null, tabuleiro[2][1], null,tabuleiro[4][1], null, tabuleiro[1][2], null, tabuleiro[5][2]);
        tabuleiro[3][2].atualizarCasas(tabuleiro[2][1], tabuleiro[2][3], tabuleiro[4][1],tabuleiro[4][3], tabuleiro[1][0], tabuleiro[1][4], tabuleiro[5][0], tabuleiro[5][4]);
        tabuleiro[3][4].atualizarCasas(tabuleiro[2][3], tabuleiro[2][5], tabuleiro[4][3],tabuleiro[4][5], tabuleiro[1][2], tabuleiro[1][6], tabuleiro[5][2], tabuleiro[5][6]);
        tabuleiro[3][6].atualizarCasas(tabuleiro[2][5], tabuleiro[2][7], tabuleiro[4][5], tabuleiro[4][7], tabuleiro[1][4], null, tabuleiro[5][4], null); 
        tabuleiro[4][1].atualizarCasas(tabuleiro[3][0], tabuleiro[3][2], tabuleiro[5][0],tabuleiro[5][2], null, tabuleiro[2][3], null, tabuleiro[6][3]); 
        tabuleiro[4][3].atualizarCasas(tabuleiro[3][2], tabuleiro[3][4], tabuleiro[5][2],tabuleiro[5][4], tabuleiro[2][1], tabuleiro[2][5], tabuleiro[6][1], tabuleiro[6][5]);
        tabuleiro[4][5].atualizarCasas(tabuleiro[3][4], tabuleiro[3][6], tabuleiro[5][4],tabuleiro[5][6], tabuleiro[2][3], tabuleiro[2][7], tabuleiro[6][3], tabuleiro[6][7]); 
        tabuleiro[4][7].atualizarCasas(tabuleiro[3][6], null, tabuleiro[5][6], null, tabuleiro[2][5], null, tabuleiro[6][5], null);
        tabuleiro[5][0].atualizarCasas(null, tabuleiro[4][1], null,tabuleiro[6][1], null, tabuleiro[3][2], null, tabuleiro[7][2]);
        tabuleiro[5][2].atualizarCasas(tabuleiro[4][1], tabuleiro[4][3], tabuleiro[6][1],tabuleiro[6][3], tabuleiro[3][0], tabuleiro[3][4], tabuleiro[7][0], tabuleiro[7][4]);
        tabuleiro[5][4].atualizarCasas(tabuleiro[4][3], tabuleiro[4][5], tabuleiro[6][3],tabuleiro[6][5], tabuleiro[3][2], tabuleiro[3][6], tabuleiro[7][2], tabuleiro[7][6]); 
        tabuleiro[5][6].atualizarCasas(tabuleiro[4][5], tabuleiro[4][7], tabuleiro[6][5],tabuleiro[6][7], tabuleiro[3][4], null, tabuleiro[7][4], null); 
        tabuleiro[6][1].atualizarCasas(tabuleiro[5][0], tabuleiro[5][2], tabuleiro[7][0],tabuleiro[7][2], null, tabuleiro[4][3], null, null);
        tabuleiro[6][3].atualizarCasas(tabuleiro[5][2], tabuleiro[5][4], tabuleiro[7][2],tabuleiro[7][4], tabuleiro[4][1], tabuleiro[4][5], null, null); 
        tabuleiro[6][5].atualizarCasas(tabuleiro[5][4], tabuleiro[5][6], tabuleiro[7][4],tabuleiro[7][6], tabuleiro[4][3], tabuleiro[4][7], null, null);
        tabuleiro[6][7].atualizarCasas(tabuleiro[5][6], null, tabuleiro[7][6], null, tabuleiro[4][5], null, null, null); 
        tabuleiro[7][0].atualizarCasas(null, tabuleiro[6][1], null, null, null, tabuleiro[5][2], null, null);
        tabuleiro[7][2].atualizarCasas(tabuleiro[6][1], tabuleiro[6][3], null, null, tabuleiro[5][0], tabuleiro[5][4], null, null);
        tabuleiro[7][4].atualizarCasas(tabuleiro[6][3], tabuleiro[6][5], null, null, tabuleiro[5][2], tabuleiro[5][6], null, null);
        tabuleiro[7][6].atualizarCasas(tabuleiro[6][5], tabuleiro[6][7], null, null, tabuleiro[5][4], null, null, null); 
    }
    
    public void limparTabuleiro( ){
         for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j].getPeca().getCor() == (byte) 9) {
                    tabuleiro[i][j].setPeca(null);
                }
                if (tabuleiro[i][j].getPeca().getCor() == (byte) 3) {
                    tabuleiro[i][j].setPeca(null);
                }
                if (tabuleiro[i][j].getPeca().getCor() == (byte) 4) {
                    tabuleiro[i][j].setPeca(null);
                }
                if (tabuleiro[i][j].getPeca().getCor() == (byte) 7) {
                    tabuleiro[i][j].setPeca(null);
                }
                if (tabuleiro[i][j].getPeca().getCor() == (byte) 8) {
                    tabuleiro[i][j].setPeca(null);
                }
          
            }
        }
    }
    public Casa getCasa(byte linha, byte coluna){
        return tabuleiro[linha][coluna];
    }
    
}