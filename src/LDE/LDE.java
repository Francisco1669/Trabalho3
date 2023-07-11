package LDE;

public class LDE implements Lista {

    private No inicio;
    private No fim;
    private int tamanho;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(int info) {
        No novo = new No(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(int info) {
        No novo = new No(info);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }

    }

    @Override
    public boolean estahVazia() {
        if (this.tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int info) {
        No p = inicio;
        while (p != null && p.getInfo() != info)
            p = p.getProx();
        if (p == null)
            return false;
        if (p == inicio) {
            inicio = p.getProx();
            if (inicio != null)
                inicio.setAnt(null);
            else
                fim = null;
        } else if (p.getProx() == null) {
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;

    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

}
