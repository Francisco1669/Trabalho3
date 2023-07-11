import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VetorMap<K, V> implements Map<K, V> {
    private Map<K, V> mapa;

    public VetorMap() {
        mapa = new HashMap<>();
    }

    @Override
    public int size() {
        return mapa.size();
    }

    @Override
    public boolean isEmpty() {
        return mapa.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return mapa.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return mapa.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return mapa.get(key);
    }

    @Override
    public V put(K key, V value) {
        return mapa.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return mapa.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        mapa.putAll(m);
    }

    @Override
    public void clear() {
        mapa.clear();
    }

    @Override
    public Set<K> keySet() {
        return mapa.keySet();
    }

    @Override
    public Collection<V> values() {
        return mapa.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return mapa.entrySet();
    }
}
