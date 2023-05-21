package jogodadama;

import javax.swing.*;

public class Pecas {

    private byte cor;

    public Pecas(byte cor) {
        this.setCor(cor);
    }

    public byte getCor() {
        return this.cor;
    }

    public void setCor(byte tipo) {
        this.cor = tipo;
    }

    public void mover(Casa casa, byte cor) {
        if(cor != (byte)0){
            casa.getPeca().setCor(cor);
        }
    }

    public void comer(Casa casa) {
        casa.setPeca(null);
    }

}
