import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AAB<K extends Comparable<K>, V> implements Map<K, V> {

    private NohAAB<K, V> raiz;

    public AAB() {
        raiz = null;
    }

    @Override
    public int size() {
        return size(raiz);
    }

    private int size(NohAAB<K, V> noh) {
        if (noh == null) {
            return 0;
        } else {
            return noh.getQuantidade() + size(noh.getEsquerda()) + size(noh.getDireita());
        }
    }

    @Override
    public boolean isEmpty() {
        return raiz == null;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        return containsValue(raiz, value);
    }

    private boolean containsValue(NohAAB<K, V> noh, Object value) {
        if (noh == null) {
            return false;
        }
        if (noh.getValor().equals(value)) {
            return true;
        }
        return containsValue(noh.getEsquerda(), value) || containsValue(noh.getDireita(), value);
    }

    @Override
    public V get(Object key) {
        return get(raiz, key);
    }

    private V get(NohAAB<K, V> noh, Object key) {
        if (noh == null) {
            return null;
        }
        int comparacao = ((K) key).compareTo(noh.getChave());
        if (comparacao == 0) {
            return noh.getValor();
        } else if (comparacao < 0) {
            return get(noh.getEsquerda(), key);
        } else {
            return get(noh.getDireita(), key);
        }
    }

    @Override
    public V put(K key, V value) {
        raiz = put(raiz, key, value);
        return value;
    }

    private NohAAB<K, V> put(NohAAB<K, V> noh, K key, V value) {
        if (noh == null) {
            return new NohAAB<>(key, value);
        }
        int comparacao = key.compareTo(noh.getChave());
        if (comparacao == 0) {
            noh.setValor(value);
        } else if (comparacao < 0) {
            noh.setEsquerda(put(noh.getEsquerda(), key, value));
        } else {
            noh.setDireita(put(noh.getDireita(), key, value));
        }
        return noh;
    }

    @Override
    public V remove(Object key) {
        V value = get(key);
        if (value != null) {
            raiz = remove(raiz, key);
        }
        return value;
    }

    private NohAAB<K, V> remove(NohAAB<K, V> noh, Object key) {
        if (noh == null) {
            return null;
        }
        int comparacao = ((K) key).compareTo(noh.getChave());
        if (comparacao < 0) {
            noh.setEsquerda(remove(noh.getEsquerda(), key));
        } else if (comparacao > 0) {
            noh.setDireita(remove(noh.getDireita(), key));
        } else {
            if (noh.getEsquerda() == null) {
                return noh.getDireita();
            } else if (noh.getDireita() == null) {
                return noh.getEsquerda();
            } else {
                NohAAB<K, V> sucessor = min(noh.getDireita());
                noh.setChave(sucessor.getChave());
                noh.setValor(sucessor.getValor());
                noh.setDireita(removeMin(noh.getDireita()));
            }
        }
        return noh;
    }

    private NohAAB<K, V> min(NohAAB<K, V> noh) {
        if (noh.getEsquerda() == null) {
            return noh;
        }
        return min(noh.getEsquerda());
    }

    private NohAAB<K, V> removeMin(NohAAB<K, V> noh) {
        if (noh.getEsquerda() == null) {
            return noh.getDireita();
        }
        noh.setEsquerda(removeMin(noh.getEsquerda()));
        return noh;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        raiz = null;
    }

    @Override
    public Set<K> keySet() {
        return keySet(raiz);
    }

    private Set<K> keySet(NohAAB<K, V> noh) {
        Set<K> keys = new HashSet<>();
        keySetHelper(noh, keys);
        return keys;
    }

    private void keySetHelper(NohAAB<K, V> noh, Set<K> keys) {
        if (noh != null) {
            keySetHelper(noh.getEsquerda(), keys);
            keys.add(noh.getChave());
            keySetHelper(noh.getDireita(), keys);
        }
    }

    @Override
    public Collection<V> values() {
        return values(raiz);
    }

    private Collection<V> values(NohAAB<K, V> noh) {
        List<V> values = new ArrayList<>();
        valuesHelper(noh, values);
        return values;
    }

    private void valuesHelper(NohAAB<K, V> noh, List<V> values) {
        if (noh != null) {
            valuesHelper(noh.getEsquerda(), values);
            values.add(noh.getValor());
            valuesHelper(noh.getDireita(), values);
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet = new HashSet<>();
        entrySetHelper(raiz, entrySet);
        return entrySet;
    }

    private void entrySetHelper(NohAAB<K, V> noh, Set<Entry<K, V>> entrySet) {
        if (noh != null) {
            entrySetHelper(noh.getEsquerda(), entrySet);
            entrySet.add(new AbstractMap.SimpleEntry<>(noh.getChave(), noh.getValor()));
            entrySetHelper(noh.getDireita(), entrySet);
        }
    }

}