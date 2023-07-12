
public class ManipuladorMap {
    private VetorMap vetorMapa;
    
    private AAB<Integer, Veiculo> arvoreMapa;
    private LDE<Integer, Veiculo> ldeMap;

    private long tempoInserirVetor;
    private long tempoExibirVetor;
    private long tempoInserirLDE;
    private long tempoExibirLDE;
    private long tempoInserirAAB;
    private long tempoExibirAAB;
    private long tempoContarAAB;
    private long tempoContarLDE;
    private long tempoContarVetor;
    private long tempoRemoverAAB;
    private long tempoRemoverLDE;
    private long tempoRemoverVetor;

    public ManipuladorMap(VetorMap vetorMapa, LDE<Integer, Veiculo> ldeMap,
            AAB<Integer, Veiculo> arvoreMapa) {
        this.vetorMapa = vetorMapa;
        this.ldeMap = ldeMap;
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

            ldeMap.put(veiculo.getChassi(), veiculo);

        }

        tempoInserirLDE = System.nanoTime() - tempoInserirLDE;
    }

    public void ordenarVeiculosVetor() {
        tempoExibirVetor = System.nanoTime();
    
        Veiculo[] veiculos = vetorMapa.values().toArray(new Veiculo[0]);
    
        int tamanho = veiculos.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (veiculos[j].getChassi() > veiculos[j + 1].getChassi()) {
                    Veiculo temp = veiculos[j];
                    veiculos[j] = veiculos[j + 1];
                    veiculos[j + 1] = temp;
                }
            }
        }
    
        System.out.println("Veículos ordenados por número do chassi:");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    
        tempoExibirVetor = System.nanoTime() - tempoExibirVetor;
    }

    public void ordenarVeiculosLDE() {
        tempoExibirLDE = System.nanoTime();
    
        Veiculo[] veiculos = ldeMap.values().toArray(new Veiculo[0]);
    
        int tamanho = veiculos.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (veiculos[j].getChassi() > veiculos[j + 1].getChassi()) {
                    Veiculo temp = veiculos[j];
                    veiculos[j] = veiculos[j + 1];
                    veiculos[j + 1] = temp;
                }
            }
        }
    
        System.out.println("Veículos ordenados por número do chassi:");
        for (Veiculo veiculo : veiculos) {
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

        tempoExibirAAB = System.nanoTime() - tempoExibirAAB;
    }

    public void contarVeiculosFordVetor() {
        tempoContarVetor = System.nanoTime();

        int countVetor = 0;

        for (Veiculo veiculo : vetorMapa.values()) {
            if (veiculo.getMarca().equals("Ford")) {
                countVetor++;
            }
        }

        System.out.println("Quantidade de veículos Ford no mapa do vetor: " + countVetor);

        tempoContarVetor = System.nanoTime() - tempoContarVetor;
    }

    public void contarVeiculosFordLDE() {
        tempoContarLDE = System.nanoTime();

        int countLista = 0;

        for (Veiculo veiculo : ldeMap.values()) {
            if (veiculo.getMarca().equals("Ford")) {
                countLista++;
            }
        }

        System.out.println("Quantidade de veículos Ford no mapa da lista: " + countLista);

        tempoContarLDE = System.nanoTime() - tempoContarLDE;
    }

    public void contarVeiculosFordAAB() {
        tempoContarAAB = System.nanoTime();

        int countArvore = 0;

        for (Veiculo veiculo : arvoreMapa.values()) {
            if (veiculo.getMarca().equals("Ford")) {
                countArvore++;
            }
        }

        System.out.println("Quantidade de veículos Ford no mapa da árvore: " + countArvore);

        tempoContarAAB = System.nanoTime() - tempoContarAAB;
    }

    public void removerVeiculosVetor() {
        tempoRemoverVetor = System.nanoTime();

        vetorMapa.entrySet().removeIf(entry -> entry.getKey() <= 202050000);
        
        tempoRemoverVetor = System.nanoTime() - tempoRemoverVetor;
        
        System.out.println("Tempo gasto até remover os veículos do vetor: " + tempoRemoverVetor);
    }

    public void removerVeiculosLDE() {
        tempoRemoverLDE = System.nanoTime();

        
        ldeMap.entrySet().removeIf(entry -> entry.getKey() <= 202050000);        

        tempoRemoverLDE = System.nanoTime() - tempoRemoverLDE;

        System.out.println("Tempo gasto até remover os veículos da lista: " + tempoRemoverLDE);
    }

    public void removerVeiculosAAB() {
        tempoRemoverAAB = System.nanoTime();

        
        arvoreMapa.entrySet().removeIf(entry -> entry.getKey() <= 202050000);

       

        tempoRemoverAAB = System.nanoTime() - tempoRemoverAAB;

         System.out.println("Tempo gasto até remover os veículos da árvore: " + tempoRemoverAAB);
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
        System.out.println("Mapa do vetor: " + tempoContarVetor + " nanossegundos");
        System.out.println("Mapa da lista: " + tempoContarLDE + " nanossegundos");
        System.out.println("Mapa da árvore: " + tempoContarAAB + " nanossegundos");

        System.out.println("Tempo gasto para remover os veículos:");
        System.out.println("Mapa do vetor: " + tempoRemoverVetor + " nanossegundos");
        System.out.println("Mapa da lista: " + tempoRemoverLDE + " nanossegundos");
        System.out.println("Mapa da árvore: " + tempoRemoverAAB + " nanossegundos");
    }
}
