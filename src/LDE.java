import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LDE<K, V> implements Map<K, V> {
    
    private NohLDE<K, V> inicio;
    private NohLDE<K, V> fim;

    public LDE() {
        inicio = null;
        fim = null;
    }

    @Override
    public int size() {
        int count = 0;
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.getProximo();
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            if (atual.getValor().equals(value)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public V get(Object key) {
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            if (atual.getChave().equals(key)) {
                return atual.getValor();
            }
            atual = atual.getProximo();
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        NohLDE<K, V> novoNoh = new NohLDE<>(key, value);
        if (inicio == null) {
            inicio = novoNoh;
            fim = novoNoh;
        } else {
            fim.setProximo(novoNoh);
            novoNoh.setAnterior(fim);
            fim = novoNoh;
        }
        return value;
    }

    @Override
    public V remove(Object key) {
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            if (atual.getChave().equals(key)) {
                V value = atual.getValor();
                if (atual == inicio && atual == fim) {
                    inicio = null;
                    fim = null;
                } else if (atual == inicio) {
                    inicio = atual.getProximo();
                    inicio.setAnterior(null);
                } else if (atual == fim) {
                    fim = atual.getAnterior();
                    fim.setProximo(null);
                } else {
                    NohLDE<K, V> anterior = atual.getAnterior();
                    NohLDE<K, V> proximo = atual.getProximo();
                    anterior.setProximo(proximo);
                    proximo.setAnterior(anterior);
                }
                return value;
            }
            atual = atual.getProximo();
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        inicio = null;
        fim = null;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            keys.add(atual.getChave());
            atual = atual.getProximo();
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            values.add(atual.getValor());
            atual = atual.getProximo();
        }
        return values;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet = new HashSet<>();
        NohLDE<K, V> atual = inicio;
        while (atual != null) {
            Entry<K, V> entry = new AbstractMap.SimpleEntry<>(atual.getChave(), atual.getValor());
            entrySet.add(entry);
            atual = atual.getProximo();
        }
        return entrySet;
    }
}
