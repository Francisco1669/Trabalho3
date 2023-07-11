import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AAB<K extends Comparable<K>, V> implements Map<K, V> {
    private TreeMap<K, V> arvore;

    public AAB() {
        arvore = new TreeMap<>();
    }

    @Override
    public int size() {
        return arvore.size();
    }

    @Override
    public boolean isEmpty() {
        return arvore.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return arvore.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return arvore.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return arvore.get(key);
    }

    @Override
    public V put(K key, V value) {
        return arvore.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return arvore.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        arvore.putAll(m);
    }

    @Override
    public void clear() {
        arvore.clear();
    }

    @Override
    public Set<K> keySet() {
        return arvore.keySet();
    }

    @Override
    public Collection<V> values() {
        return arvore.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return arvore.entrySet();
    }
}
