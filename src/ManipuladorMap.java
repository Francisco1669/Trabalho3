import java.util.Map;


public class ManipuladorMap {
    private Map<Integer, Veiculo> vetorMapa;
    private Map<Integer, Veiculo> listaMapa;
    private Map<Integer, Veiculo> arvoreMapa;
    
    private long tempoInserirVetor;
    private long tempoExibirVetor;
    private long tempoInserirLDE;
    private long tempoExibirLDE;
    private long tempoInserirAAB;
    private long tempoExibirAAB;
    private long tempoContar;
    private long tempoRemover;
    
    public ManipuladorMap(Map<Integer, Veiculo> vetorMapa, Map<Integer, Veiculo> listaMapa, Map<Integer, Veiculo> arvoreMapa) {
        this.vetorMapa = vetorMapa;
        this.listaMapa = listaMapa;
        this.arvoreMapa = arvoreMapa;
    }

    
    public void inserirVeiculosAAB() {
        tempoInserirAAB = System.nanoTime();
        
        for (int i = 0; i < 100000; i++) {
            Veiculo veiculo = new Veiculo();
            
            arvoreMapa.put(veiculo.getChassi(), veiculo);
        }
        
        tempoInserirAAB = System.nanoTime() - tempoInserirAAB;
    }
    public void inserirVeiculosVetor() {
        tempoInserirVetor = System.nanoTime();
        
        for (int i = 0; i < 100000; i++) {
            Veiculo veiculo = new Veiculo();
            vetorMapa.put(veiculo.getChassi(), veiculo);
            
        }
        
        tempoInserirVetor = System.nanoTime() - tempoInserirVetor;
    }
    public void inserirVeiculosLDE() {
        tempoInserirLDE = System.nanoTime();
        
        for (int i = 0; i < 100000; i++) {
            Veiculo veiculo = new Veiculo();
            
            listaMapa.put(veiculo.getChassi(), veiculo);
            
        }
        
        tempoInserirLDE = System.nanoTime() - tempoInserirLDE;
    }
    
    public void exibirVeiculosLDE() {
        tempoExibirLDE = System.nanoTime();
        
        System.out.println("Veículos no mapa do vetor:");
        for (Veiculo veiculo : vetorMapa.values()) {
            System.out.println(veiculo);
        }
        
        System.out.println("Veículos no mapa da lista:");
        for (Veiculo veiculo : listaMapa.values()) {
            System.out.println(veiculo);
        }
        
        System.out.println("Veículos no mapa da árvore:");
        for (Veiculo veiculo : arvoreMapa.values()) {
            System.out.println(veiculo);
        }
        
        tempoExibirLDE = System.nanoTime() - tempoExibirLDE;
    }
    public void exibirVeiculosAAB() {
        tempoExibirAAB = System.nanoTime();
        
        System.out.println("Veículos no mapa do vetor:");
        for (Veiculo veiculo : vetorMapa.values()) {
            System.out.println(veiculo);
        }
        
        System.out.println("Veículos no mapa da lista:");
        for (Veiculo veiculo : listaMapa.values()) {
            System.out.println(veiculo);
        }
        
        System.out.println("Veículos no mapa da árvore:");
        for (Veiculo veiculo : arvoreMapa.values()) {
            System.out.println(veiculo);
        }
        
        tempoExibirAAB = System.nanoTime() - tempoExibirAAB;
    }
    public void exibirVeiculosVetor() {
        tempoExibirVetor = System.nanoTime();
        
        System.out.println("Veículos no mapa do vetor:");
        for (Veiculo veiculo : vetorMapa.values()) {
            System.out.println(veiculo);
        }
        
        System.out.println("Veículos no mapa da lista:");
        for (Veiculo veiculo : listaMapa.values()) {
            System.out.println(veiculo);
        }
        
        System.out.println("Veículos no mapa da árvore:");
        for (Veiculo veiculo : arvoreMapa.values()) {
            System.out.println(veiculo);
        }
        
        tempoExibirVetor = System.nanoTime() - tempoExibirVetor;
    }
    
    public void contarVeiculosFord() {
        tempoContar = System.nanoTime();
        
        int countVetor = 0;
        int countLista = 0;
        int countArvore = 0;
        
        for (Veiculo veiculo : vetorMapa.values()) {
            if (veiculo.getMarca().equals("Ford")) {
                countVetor++;
            }
        }
        
        for (Veiculo veiculo : listaMapa.values()) {
            if (veiculo.getMarca().equals("Ford")) {
                countLista++;
            }
        }
        
        for (Veiculo veiculo : arvoreMapa.values()) {
            if (veiculo.getMarca().equals("Ford")) {
                countArvore++;
            }
        }
        
        System.out.println("Quantidade de veículos Ford no mapa do vetor: " + countVetor);
        System.out.println("Quantidade de veículos Ford no mapa da lista: " + countLista);
        System.out.println("Quantidade de veículos Ford no mapa da árvore: " + countArvore);
        
        tempoContar = System.nanoTime() - tempoContar;
    }
    
    public void removerVeiculos() {
        tempoRemover = System.nanoTime();
        
        vetorMapa.entrySet().removeIf(entry -> entry.getKey() <= 202050000);
        listaMapa.entrySet().removeIf(entry -> entry.getKey() <= 202050000);
        arvoreMapa.entrySet().removeIf(entry -> entry.getKey() <= 202050000);
        
        tempoRemover = System.nanoTime() - tempoRemover;
    }
    
    public void exibirTemposGastos() {
        System.out.println("Tempo gasto para inserir os veículos:");
        System.out.println("Mapa do vetor: " + tempoInserirVetor + " nanossegundos");
        System.out.println("Mapa da lista: " + tempoInserirLDE + " nanossegundos");
        System.out.println("Mapa da árvore: " + tempoInserirAAB + " nanossegundos");
        
        System.out.println("Tempo gasto para exibir os veículos:");
        System.out.println("Mapa do vetor: " + tempoExibirVetor + " nanossegundos");
        System.out.println("Mapa da lista: " + tempoExibirLDE + " nanossegundos");
        System.out.println("Mapa da árvore: " + tempoExibirAAB + " nanossegundos");
        
        System.out.println("Tempo gasto para contar veículos da marca Ford:");
        System.out.println("Mapa do vetor: " + tempoContar + " nanossegundos");
        System.out.println("Mapa da lista: " + tempoContar + " nanossegundos");
        System.out.println("Mapa da árvore: " + tempoContar + " nanossegundos");
        
        System.out.println("Tempo gasto para remover os veículos:");
        System.out.println("Mapa do vetor: " + tempoRemover + " nanossegundos");
        System.out.println("Mapa da lista: " + tempoRemover + " nanossegundos");
        System.out.println("Mapa da árvore: " + tempoRemover + " nanossegundos");
    }
}
