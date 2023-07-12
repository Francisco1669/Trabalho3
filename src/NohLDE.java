public class NohLDE<K, V> {
    private K chave;
    private V valor;
    private NohLDE<K, V> anterior;
    private NohLDE<K, V> proximo;

    public NohLDE(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public NohLDE<K, V> getAnterior() {
        return anterior;
    }

    public void setAnterior(NohLDE<K, V> anterior) {
        this.anterior = anterior;
    }

    public NohLDE<K, V> getProximo() {
        return proximo;
    }

    public void setProximo(NohLDE<K, V> proximo) {
        this.proximo = proximo;
    }
}