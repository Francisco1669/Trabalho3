package Arvore_Binaria;

public class No {
    

    private int valor;
    private No esq;
    private No dir;
    private No pai;

    public No(int v) {
        this.valor = v;
    }

    public int getValor() {
        return valor;
    }

    public No getEsq() {
        return esq;
    }

    public No getDir() {
        return dir;
    }

    public No getPai() {
        return pai;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    
}
