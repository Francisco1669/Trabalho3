import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class VetorMap implements Map<Integer, Veiculo> {
    
    private Veiculo[] vetorVeiculo;
    private static int tamanhoVetor = 100000;
    private int size;

    public VetorMap() {
        vetorVeiculo = new Veiculo[tamanhoVetor];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        Integer chassi = (Integer) key;
        for (int i = 0; i < size; i++) {
            if (vetorVeiculo[i].getChassi() == chassi) {
                return true;
                
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        Veiculo veiculo = (Veiculo) value;
        for (int i = 0; i < size; i++) {
            if (vetorVeiculo[i].equals(veiculo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Veiculo get(Object key) {
        Integer chassi = (Integer) key;
        for (int i = 0; i < size; i++) {
            if (vetorVeiculo[i].getChassi() == chassi) {
                return vetorVeiculo[i];
            }
        }
        return null;
    }

    @Override
    public Veiculo put(Integer key, Veiculo value) {
        if (size == vetorVeiculo.length) {
            throw new IllegalStateException("O vetor de veículos está cheio.");
        }
        vetorVeiculo[size] = value;
        size++;
        return value;
    }

    @Override
    public Veiculo remove(Object key) {
        Integer chassi = (Integer) key;
        for (int i = 0; i < size; i++) {
            if (vetorVeiculo[i].getChassi() == chassi) {
                Veiculo removed = vetorVeiculo[i];
                for (int j = i; j < size - 1; j++) {
                    vetorVeiculo[j] = vetorVeiculo[j + 1];
                }
                vetorVeiculo[size - 1] = null;
                size--;
                return removed;
            }
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Veiculo> m) {
        for (Entry<? extends Integer, ? extends Veiculo> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Set<Integer> keySet() {
        Set<Integer> keySet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            keySet.add(vetorVeiculo[i].getChassi());
        }
        return keySet;
    }

    @Override
    public Collection<Veiculo> values() {
        List<Veiculo> values = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            values.add(vetorVeiculo[i]);
        }
        return values;
    }

    @Override
    public Set<Entry<Integer, Veiculo>> entrySet() {
        Set<Entry<Integer, Veiculo>> entrySet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            Entry<Integer, Veiculo> entry = new AbstractMap.SimpleEntry<>(vetorVeiculo[i].getChassi(), vetorVeiculo[i]);
            entrySet.add(entry);
        }
        return entrySet;
    }
}