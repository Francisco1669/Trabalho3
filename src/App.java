

public class App {
    public static void main(String[] args) {
        // Crie as instâncias das estruturas de dados (vetor, lista duplamente encadeada e árvore binária)
        VetorMap<Integer, Veiculo> vetorMapa = new VetorMap<>();
        LDE<Integer, Veiculo> listaMapa = new LDE<>();
        AAB<Integer, Veiculo> arvoreMapa = new AAB<>();
           
        ManipuladorMap manipuladorMapa = new ManipuladorMap(vetorMapa, listaMapa, arvoreMapa);
        
        // Execute as operações especificadas
        manipuladorMapa.inserirVeiculosAAB();
        manipuladorMapa.inserirVeiculosVetor();
        manipuladorMapa.inserirVeiculosLDE();
        manipuladorMapa.exibirVeiculosVetor();
        manipuladorMapa.exibirVeiculosAAB();
        manipuladorMapa.exibirVeiculosLDE();
        manipuladorMapa.contarVeiculosFordAAB();
        manipuladorMapa.contarVeiculosFordVetor();
        manipuladorMapa.contarVeiculosFordLDE();
        manipuladorMapa.removerVeiculosVetor();
        manipuladorMapa.removerVeiculosLDE();
        manipuladorMapa.removerVeiculosAAB();
        manipuladorMapa.exibirTemposGastos();
    }
}
