public class NohAAB<K extends Comparable<K>, V> {

    private K chave;
    private V valor;
    private NohAAB<K, V> esquerda;
    private NohAAB<K, V> direita;
    private int quantidade;

    public NohAAB(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.quantidade = 1;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public NohAAB<K, V> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NohAAB<K, V> esquerda) {
        this.esquerda = esquerda;
    }

    public NohAAB<K, V> getDireita() {
        return direita;
    }

    public void setDireita(NohAAB<K, V> direita) {
        this.direita = direita;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
