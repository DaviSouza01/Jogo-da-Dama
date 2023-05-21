package jogodadama;

import javax.swing.*;

public class Verificacao {

    public boolean vez = false;
    public boolean movendo = false;
    public Tabuleiro tabuleiro;
    public boolean obrigatoriedade = false;
    public boolean comidaObrigatoria = false;
    public boolean comidaMais = false;
    public String nome = null;
    public boolean vitoria = false;

    public void checarInteracao(Casa casa, Tabuleiro tabuleiroEscondido) {
        if (casa.getPeca() != null) {
            if (casa.getPeca().getCor() == (byte) 2 && vez && !movendo) {
                if (nome == null) {
                    checarPosicao(casa, (byte) 4, casa.vetorCasas[2], casa.vetorCasas[3], casa.vetorCasas[6], casa.vetorCasas[7]);
                    movendo = true;
                } else {
                    if (nome.equals(casa.getNome())) {
                        checarPosicao(casa, (byte) 4, casa.vetorCasas[2], casa.vetorCasas[3], casa.vetorCasas[6], casa.vetorCasas[7]);
                        movendo = true;
                    }
                }
            } else if (casa.getPeca().getCor() == (byte) 1 && !vez && !movendo) {
                if (nome == null) {
                    checarPosicao(casa, (byte) 3, casa.vetorCasas[0], casa.vetorCasas[1], casa.vetorCasas[4], casa.vetorCasas[5]);
                    movendo = true;
                } else {
                    if (nome.equals(casa.getNome())) {
                        checarPosicao(casa, (byte) 3, casa.vetorCasas[0], casa.vetorCasas[1], casa.vetorCasas[4], casa.vetorCasas[5]);
                        movendo = true;
                    }
                }
            } else if (casa.getPeca().getCor() == (byte) 4 && movendo) {
                casa.getPeca().setCor((byte) 2);
                limparTabuleiro(tabuleiroEscondido);
                movendo = false;
            } else if (casa.getPeca().getCor() == (byte) 3 && movendo) {
                casa.getPeca().setCor((byte) 1);
                limparTabuleiro(tabuleiroEscondido);
                movendo = false;
            } else if (casa.getPeca().getCor() == (byte) 9) {
                casa.getPeca().mover(casa, verificarApertado(tabuleiroEscondido));
                comidaMais = verificarComer(casa);
                limparTabuleiro(tabuleiroEscondido);
                verificarTransformacao(casa);
                movendo = false;
                comidaObrigatoria = false;
                obrigatoriedade = false;
                if (comidaMais) {
                    obrigatoriedade = verificarObrigatoriedade(casa);
                    nome = casa.getNome();
                }
                if (!obrigatoriedade) {
                    nome = null;
                    mudarVezJogador();
                }
                vericacaoComida(tabuleiroEscondido);
            } else if (casa.getPeca().getCor() == (byte) 5 && !vez && !movendo) {
                checarPosicao(casa, (byte) 7, casa.vetorCasas[0], casa.vetorCasas[1], casa.vetorCasas[2], casa.vetorCasas[3],
                        casa.vetorCasas[4], casa.vetorCasas[5], casa.vetorCasas[6], casa.vetorCasas[7]);
                movendo = true;
            } else if (casa.getPeca().getCor() == (byte) 6 && vez && !movendo) {
                checarPosicao(casa, (byte) 8, casa.vetorCasas[0], casa.vetorCasas[1], casa.vetorCasas[2], casa.vetorCasas[3],
                        casa.vetorCasas[4], casa.vetorCasas[5], casa.vetorCasas[6], casa.vetorCasas[7]);
                movendo = true;
            } else if (casa.getPeca().getCor() == (byte) 7 && !vez && movendo) {
                casa.getPeca().setCor((byte) 5);
                limparTabuleiro(tabuleiroEscondido);
                movendo = false;
            } else if (casa.getPeca().getCor() == (byte) 8 && vez && movendo) {
                casa.getPeca().setCor((byte) 6);
                limparTabuleiro(tabuleiroEscondido);
                movendo = false;
            }
        }
    }

    public void limparTabuleiro(Tabuleiro tabuleiro) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro.getCasa((byte) i, (byte) j) != null) {
                    if (tabuleiro.getCasa((byte) i, (byte) j).getPeca() != null) {
                        if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 9) {
                            tabuleiro.getCasa((byte) i, (byte) j).setPeca(null);
                        } else if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 3) {
                            tabuleiro.getCasa((byte) i, (byte) j).setPeca(null);
                        } else if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 4) {
                            tabuleiro.getCasa((byte) i, (byte) j).setPeca(null);
                        } else if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 7) {
                            tabuleiro.getCasa((byte) i, (byte) j).setPeca(null);
                        } else if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 8) {
                            tabuleiro.getCasa((byte) i, (byte) j).setPeca(null);
                        }
                    }
                }

            }
        }
    }

    public void mudarVezJogador() {
        this.vez = !this.vez;
    }

    public boolean getVez() {
        return vez;
    }

    public void checarPosicao(Casa casa, byte cor, Casa posicao1, Casa posicao2, Casa posicaoF1, Casa posicaoF2) {
        boolean comida = false;
        casa.getPeca().setCor(cor);
        if (posicao1 != null) {
            if (posicao1.getPeca() == null && !obrigatoriedade) {
                posicao1.definirPeca(new Pecas((byte) 9));
            } else {
                if (casa.getPeca().getCor() == (byte) 4) { //preto
                    if (posicao1.getPeca() != null && posicaoF1 != null) {
                        if ((posicao1.getPeca().getCor() == (byte) 1 || posicao1.getPeca().getCor() == (byte) 5) && posicaoF1.getPeca() == null) {
                            posicaoF1.definirPeca(new Pecas((byte) 9));
                            comida = true;
                        }
                    }
                } else if (casa.getPeca().getCor() == (byte) 3) { //branco
                    if (posicao1.getPeca() != null && posicaoF1 != null) {
                        if ((posicao1.getPeca().getCor() == (byte) 2 || posicao1.getPeca().getCor() == (byte) 6) && posicaoF1.getPeca() == null) {
                            posicaoF1.definirPeca(new Pecas((byte) 9));
                            comida = true;
                        }
                    }
                }
            }
        }
        if (posicao2 != null) {
            if (posicao2.getPeca() == null && !comida && !obrigatoriedade) {
                posicao2.definirPeca(new Pecas((byte) 9));
            } else {
                if (casa.getPeca().getCor() == (byte) 4) { //preto
                    if (posicao2.getPeca() != null && posicaoF2 != null) {
                        if ((posicao2.getPeca().getCor() == (byte) 1 || posicao2.getPeca().getCor() == (byte) 5) && posicaoF2.getPeca() == null) {
                            posicaoF2.definirPeca(new Pecas((byte) 9));
                            comida = true;
                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }

                            }
                        }
                    }
                } else if (casa.getPeca().getCor() == (byte) 3) { //branco
                    if (posicao2.getPeca() != null && posicaoF2 != null) {
                        if ((posicao2.getPeca().getCor() == (byte) 2 || posicao2.getPeca().getCor() == (byte) 6) && posicaoF2.getPeca() == null) {
                            posicaoF2.definirPeca(new Pecas((byte) 9));
                            comida = true;

                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void checarPosicao(Casa casa, byte cor, Casa posicao1, Casa posicao2, Casa posicao3, Casa posicao4,
            Casa posicaoF1, Casa posicaoF2, Casa posicaoF3, Casa posicaoF4) {
        boolean comida = false;
        casa.getPeca().setCor(cor);
        if (posicao1 != null) {
            if (posicao1.getPeca() == null && !obrigatoriedade) {
                posicao1.definirPeca(new Pecas((byte) 9));
            } else {
                if (casa.getPeca().getCor() == (byte) 8) { //preto
                    if (posicao1.getPeca() != null && posicaoF1 != null) {
                        if ((posicao1.getPeca().getCor() == (byte) 1 || posicao1.getPeca().getCor() == (byte) 5) && posicaoF1.getPeca() == null) {
                            posicaoF1.definirPeca(new Pecas((byte) 9));
                            comida = true;
                        }
                    }
                } else if (casa.getPeca().getCor() == (byte) 7) { //branco
                    if (posicao1.getPeca() != null && posicaoF1 != null) {
                        if ((posicao1.getPeca().getCor() == (byte) 2 || posicao1.getPeca().getCor() == (byte) 6) && posicaoF1.getPeca() == null) {
                            posicaoF1.definirPeca(new Pecas((byte) 9));
                            comida = true;
                        }
                    }
                }
            }
        }
        if (posicao2 != null) {
            if (posicao2.getPeca() == null && !comida && !obrigatoriedade) {
                posicao2.definirPeca(new Pecas((byte) 9));
            } else {
                if (casa.getPeca().getCor() == (byte) 8) { //preto
                    if (posicao2.getPeca() != null && posicaoF2 != null) {
                        if ((posicao2.getPeca().getCor() == (byte) 1 || posicao2.getPeca().getCor() == (byte) 5) && posicaoF2.getPeca() == null) {
                            posicaoF2.definirPeca(new Pecas((byte) 9));
                            comida = true;
                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                } else if (casa.getPeca().getCor() == (byte) 7) { //branco
                    if (posicao2.getPeca() != null && posicaoF2 != null) {
                        if ((posicao2.getPeca().getCor() == (byte) 2 || posicao2.getPeca().getCor() == (byte) 6) && posicaoF2.getPeca() == null) {
                            posicaoF2.definirPeca(new Pecas((byte) 9));
                            comida = true;

                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (posicao3 != null) {
            if (posicao3.getPeca() == null && !comida && !obrigatoriedade) {
                posicao3.definirPeca(new Pecas((byte) 9));
            } else {
                if (casa.getPeca().getCor() == (byte) 8) { //preto
                    if (posicao3.getPeca() != null && posicaoF3 != null) {
                        if ((posicao3.getPeca().getCor() == (byte) 1 || posicao3.getPeca().getCor() == (byte) 5) && posicaoF3.getPeca() == null) {
                            posicaoF3.definirPeca(new Pecas((byte) 9));
                            comida = true;
                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                            if (posicao2 != null) {
                                if (posicao2.getPeca() != null) {
                                    if (posicao2.getPeca().getCor() == (byte) 9) {
                                        posicao2.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                } else if (casa.getPeca().getCor() == (byte) 7) { //branco
                    if (posicao3.getPeca() != null && posicaoF3 != null) {
                        if ((posicao3.getPeca().getCor() == (byte) 2 || posicao3.getPeca().getCor() == (byte) 6) && posicaoF3.getPeca() == null) {
                            posicaoF3.definirPeca(new Pecas((byte) 9));
                            comida = true;

                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                            if (posicao2 != null) {
                                if (posicao2.getPeca() != null) {
                                    if (posicao2.getPeca().getCor() == (byte) 9) {
                                        posicao2.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (posicao4 != null) {
            if (posicao4.getPeca() == null && !comida && !obrigatoriedade) {
                posicao4.definirPeca(new Pecas((byte) 9));
            } else {
                if (casa.getPeca().getCor() == (byte) 8) { //preto
                    if (posicao4.getPeca() != null && posicaoF4 != null) {
                        if ((posicao4.getPeca().getCor() == (byte) 1 || posicao4.getPeca().getCor() == (byte) 5) && posicaoF4.getPeca() == null) {
                            posicaoF4.definirPeca(new Pecas((byte) 9));
                            comida = true;
                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                            if (posicao2 != null) {
                                if (posicao2.getPeca() != null) {
                                    if (posicao2.getPeca().getCor() == (byte) 9) {
                                        posicao2.setPeca(null);
                                    }
                                }
                            }
                            if (posicao3 != null) {
                                if (posicao3.getPeca() != null) {
                                    if (posicao3.getPeca().getCor() == (byte) 9) {
                                        posicao3.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                } else if (casa.getPeca().getCor() == (byte) 7) { //branco
                    if (posicao4.getPeca() != null && posicaoF4 != null) {
                        if ((posicao4.getPeca().getCor() == (byte) 2 || posicao4.getPeca().getCor() == (byte) 6) && posicaoF4.getPeca() == null) {
                            posicaoF4.definirPeca(new Pecas((byte) 9));
                            comida = true;

                            if (posicao1 != null) {
                                if (posicao1.getPeca() != null) {
                                    if (posicao1.getPeca().getCor() == (byte) 9) {
                                        posicao1.setPeca(null);
                                    }
                                }
                            }
                            if (posicao2 != null) {
                                if (posicao2.getPeca() != null) {
                                    if (posicao2.getPeca().getCor() == (byte) 9) {
                                        posicao2.setPeca(null);
                                    }
                                }
                            }
                            if (posicao3 != null) {
                                if (posicao3.getPeca() != null) {
                                    if (posicao3.getPeca().getCor() == (byte) 9) {
                                        posicao3.setPeca(null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean verificarComer(Casa casa) {
        boolean repetir = false;
        if (vez) {
            if (casa.vetorCasas[4] != null) {
                if (casa.vetorCasas[4].getPeca() != null) {
                    if (casa.vetorCasas[4].getPeca().getCor() == (byte) 4 || casa.vetorCasas[4].getPeca().getCor() == (byte) 8) {
                        casa.vetorCasas[0].getPeca().comer(casa.vetorCasas[0]);
                        repetir = true;
                    }
                }
            }
            if (casa.vetorCasas[5] != null) {
                if (casa.vetorCasas[5].getPeca() != null) {
                    if (casa.vetorCasas[5].getPeca().getCor() == (byte) 4 || casa.vetorCasas[5].getPeca().getCor() == (byte) 8) {
                        casa.vetorCasas[1].getPeca().comer(casa.vetorCasas[1]);
                        repetir = true;
                    }
                }
            }
            if (casa.vetorCasas[6] != null) {
                if (casa.vetorCasas[6].getPeca() != null) {
                    if (casa.vetorCasas[6].getPeca().getCor() == (byte) 8) {
                        casa.vetorCasas[2].getPeca().comer(casa.vetorCasas[2]);
                        repetir = true;
                    }
                }
            }
            if (casa.vetorCasas[7] != null) {
                if (casa.vetorCasas[7].getPeca() != null) {
                    if (casa.vetorCasas[7].getPeca().getCor() == (byte) 8) {
                        casa.vetorCasas[3].getPeca().comer(casa.vetorCasas[3]);
                        repetir = true;
                    }
                }
            }
        } else {
            if (casa.vetorCasas[4] != null) {
                if (casa.vetorCasas[4].getPeca() != null) {
                    if (casa.vetorCasas[4].getPeca().getCor() == (byte) 7) {
                        casa.vetorCasas[0].getPeca().comer(casa.vetorCasas[0]);
                        repetir = true;
                    }
                }
            }
            if (casa.vetorCasas[5] != null) {
                if (casa.vetorCasas[5].getPeca() != null) {
                    if (casa.vetorCasas[5].getPeca().getCor() == (byte) 7) {
                        casa.vetorCasas[1].getPeca().comer(casa.vetorCasas[1]);
                        repetir = true;
                    }
                }
            }
            if (casa.vetorCasas[6] != null) {
                if (casa.vetorCasas[6].getPeca() != null) {
                    if (casa.vetorCasas[6].getPeca().getCor() == (byte) 3 || casa.vetorCasas[6].getPeca().getCor() == (byte) 7) {
                        casa.vetorCasas[2].getPeca().comer(casa.vetorCasas[2]);
                        repetir = true;
                    }
                }
            }
            if (casa.vetorCasas[7] != null) {
                if (casa.vetorCasas[7].getPeca() != null) {
                    if (casa.vetorCasas[7].getPeca().getCor() == (byte) 3 || casa.vetorCasas[7].getPeca().getCor() == (byte) 7) {
                        casa.vetorCasas[3].getPeca().comer(casa.vetorCasas[3]);
                        repetir = true;
                    }
                }
            }
        }
        return repetir;
    }

    public boolean verificarObrigatoriedade(Casa casa) {
        if (vez) { // preto
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 2 || casa.getPeca().getCor() == (byte) 6) {
                    if (casa.vetorCasas[3] != null) {
                        if (casa.vetorCasas[3].getPeca() != null) {
                            if (casa.vetorCasas[3].getPeca().getCor() == (byte) 1 || casa.vetorCasas[3].getPeca().getCor() == (byte) 5) {
                                if (casa.vetorCasas[7] != null) {
                                    if (casa.vetorCasas[7].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 2 || casa.getPeca().getCor() == (byte) 6) {
                    if (casa.vetorCasas[2] != null) {
                        if (casa.vetorCasas[2].getPeca() != null) {
                            if (casa.vetorCasas[2].getPeca().getCor() == (byte) 1 || casa.vetorCasas[2].getPeca().getCor() == (byte) 5) {
                                if (casa.vetorCasas[6] != null) {
                                    if (casa.vetorCasas[6].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 6) {
                    if (casa.vetorCasas[0] != null) {
                        if (casa.vetorCasas[0].getPeca() != null) {
                            if (casa.vetorCasas[0].getPeca().getCor() == (byte) 1 || casa.vetorCasas[0].getPeca().getCor() == (byte) 5) {
                                if (casa.vetorCasas[4] != null) {
                                    if (casa.vetorCasas[4].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 6) {
                    if (casa.vetorCasas[1] != null) {
                        if (casa.vetorCasas[1].getPeca() != null) {
                            if (casa.vetorCasas[1].getPeca().getCor() == (byte) 1 || casa.vetorCasas[1].getPeca().getCor() == (byte) 5) {
                                if (casa.vetorCasas[5] != null) {
                                    if (casa.vetorCasas[5].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 1 || casa.getPeca().getCor() == (byte) 5) {
                    if (casa.vetorCasas[0] != null) {
                        if (casa.vetorCasas[0].getPeca() != null) {
                            if (casa.vetorCasas[0].getPeca().getCor() == (byte) 2 || casa.vetorCasas[0].getPeca().getCor() == (byte) 6) {
                                if (casa.vetorCasas[4] != null) {
                                    if (casa.vetorCasas[4].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 1 || casa.getPeca().getCor() == (byte) 5) {
                    if (casa.vetorCasas[1] != null) {
                        if (casa.vetorCasas[1].getPeca() != null) {
                            if (casa.vetorCasas[1].getPeca().getCor() == (byte) 2 || casa.vetorCasas[1].getPeca().getCor() == (byte) 6) {
                                if (casa.vetorCasas[5] != null) {
                                    if (casa.vetorCasas[5].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 5) {
                    if (casa.vetorCasas[3] != null) {
                        if (casa.vetorCasas[3].getPeca() != null) {
                            if (casa.vetorCasas[3].getPeca().getCor() == (byte) 2 || casa.vetorCasas[3].getPeca().getCor() == (byte) 6) {
                                if (casa.vetorCasas[7] != null) {
                                    if (casa.vetorCasas[7].getPeca() == null) {
                                        comidaObrigatoria = true;

                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (casa.getPeca() != null) {
                if (casa.getPeca().getCor() == (byte) 5) {
                    if (casa.vetorCasas[2] != null) {
                        if (casa.vetorCasas[2].getPeca() != null) {
                            if (casa.vetorCasas[2].getPeca().getCor() == (byte) 2 || casa.vetorCasas[2].getPeca().getCor() == (byte) 6) {
                                if (casa.vetorCasas[6] != null) {
                                    if (casa.vetorCasas[6].getPeca() == null) {
                                        comidaObrigatoria = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return comidaObrigatoria;
    }

    public void vericacaoComida(Tabuleiro tabuleiroEscondido) {
        for (byte i = 0; i < 8; i++) {
            for (byte j = 0; j < 8; j++) {
                if (tabuleiroEscondido.getCasa((byte) i, (byte) j) != null) {
                    obrigatoriedade = verificarObrigatoriedade(tabuleiroEscondido.getCasa((byte) i, (byte) j));

                }
            }
        }
    }

    public boolean getObrigatoriedade() {
        return obrigatoriedade;
    }

    public void verificarTransformacao(Casa casa) {
        if (casa.getPeca().getCor() == (byte) 1) {
            if (casa.getNome() == "b1" || casa.getNome() == "b2" || casa.getNome() == "b3" || casa.getNome() == "b4") {
                casa.setPeca(new Pecas((byte) 5));
            }
        } else if (casa.getPeca().getCor() == (byte) 2) {
            if (casa.getNome() == "b29" || casa.getNome() == "b30" || casa.getNome() == "b31" || casa.getNome() == "b32") {
                casa.setPeca(new Pecas((byte) 6));
            }
        }
    }

    public byte verificarApertado(Tabuleiro tabuleiroEscondido) {
        byte retorno = 0;
        for (byte i = 0; i < 8; i++) {
            for (byte j = 0; j < 8; j++) {
                if (tabuleiroEscondido.getCasa((byte) i, (byte) j) != null) {
                    if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca() != null) {
                        switch (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor()) {
                            case (byte) 4:
                                retorno = 2;
                                break;
                            case (byte) 3:
                                retorno = 1;
                                break;
                            case (byte) 7:
                                retorno = 5;
                                break;
                            case (byte) 8:
                                retorno = 6;
                                break;
                        }
                    }
                }
            }
        }
        return retorno;
    }

    public boolean verificarVitoria(JLabel vezDoJogador, JLabel txtComidaObrigatoria, Tabuleiro tabuleiro) {
        byte totalBrancas = 0, totalPretas = 0, totalMovimentosBranca = 0, totalMovimentosPreta = 0;
        if (!movendo) {
            for (byte i = 0; i < 8; i++) {
                for (byte j = 0; j < 8; j++) {
                    if (tabuleiro.getCasa((byte) i, (byte) j) != null) {
                        if (tabuleiro.getCasa((byte) i, (byte) j).getPeca() != null) {
                            if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 1
                                    || tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 5) {
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[0] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[0].getPeca() == null) {
                                        totalMovimentosBranca++;
                                    }
                                }
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[1] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[1].getPeca() == null) {
                                        totalMovimentosBranca++;
                                    }
                                }
                                totalBrancas++;
                            }
                            if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 5) {
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[3] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[3].getPeca() == null) {
                                        totalMovimentosBranca++;
                                    }
                                }
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[4] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[4].getPeca() == null) {
                                        totalMovimentosBranca++;
                                    }
                                }
                            }
                            if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 2
                                    || tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 6) {
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[2] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[2].getPeca() == null) {
                                        totalMovimentosPreta++;
                                    }
                                }
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[3] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[3].getPeca() == null) {
                                        totalMovimentosPreta++;
                                    }
                                }
                                totalPretas++;
                            }
                            if (tabuleiro.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 6) {
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[0] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[0].getPeca() == null) {
                                        totalMovimentosPreta++;
                                    }
                                }
                                if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[1] != null) {
                                    if (tabuleiro.getCasa((byte) i, (byte) j).vetorCasas[1].getPeca() == null) {
                                        totalMovimentosPreta++;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            byte resposta = -1;

            if (totalPretas == (byte) 0) {
                JOptionPane.showMessageDialog(null, "Parabéns jogador Branco!", "Vitória do Branco!", 1);
                resposta = (byte) JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente?", 1);
                if (resposta == (byte) JOptionPane.YES_OPTION) {
                    reset(vezDoJogador, txtComidaObrigatoria, tabuleiro);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Até mais!", 1);
                    System.exit(0);
                    return false;
                }
            } else if (totalMovimentosPreta == (byte) 0 && vez) {
                JOptionPane.showMessageDialog(null, "Parabéns jogador Branco!", "Vitória do Branco!", 1);
                resposta = (byte) JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente?", 1);
                if (resposta == (byte) JOptionPane.YES_OPTION) {
                    reset(vezDoJogador, txtComidaObrigatoria, tabuleiro);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Até mais!", 1);
                    System.exit(0);
                    return false;
                }
            } else if (totalBrancas == (byte) 0) {
                JOptionPane.showMessageDialog(null, "Parabéns jogador Preto!", "Vitória do Preto!", 1);
                resposta = (byte) JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente?", 1);
                if (resposta == (byte) JOptionPane.YES_OPTION) {
                    reset(vezDoJogador, txtComidaObrigatoria, tabuleiro);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Até mais!", 1);
                    System.exit(0);
                    return false;
                }
            } else if (totalMovimentosBranca == (byte) 0 && !vez) {
                JOptionPane.showMessageDialog(null, "Parabéns jogador Preto!", "Vitória do Preto!", 1);
                resposta = (byte) JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente?", 1);
                if (resposta == (byte) JOptionPane.YES_OPTION) {
                    reset(vezDoJogador, txtComidaObrigatoria, tabuleiro);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Até mais!", 1);
                    System.exit(0);
                    return false;
                }
            } else if (totalBrancas == 1 && totalPretas == 1) {
                JOptionPane.showMessageDialog(null, "Empate!", "Empate!", 1);
                resposta = (byte) JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogar novamente?", 1);
                if (resposta == (byte) JOptionPane.YES_OPTION) {
                    reset(vezDoJogador, txtComidaObrigatoria, tabuleiro);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Até mais!", 1);
                    System.exit(0);
                    return false;
                }
            }
        }
        return false;
    }

    public boolean getVitoria() {
        return this.vitoria;
    }

    public void reset(JLabel vezDoJogador, JLabel txtComidaObrigatoria, Tabuleiro tabuleiro) {
        tabuleiro.iniciarTabuleiro();
        tabuleiro.atualizarCasas();
        vezDoJogador.setText("Vez do jogador: Branco");
        txtComidaObrigatoria.setText("");
        vez = false;
        movendo = false;
        obrigatoriedade = false;
        comidaObrigatoria = false;
        comidaMais = false;
        nome = null;
        vitoria = false;
    }
    
}