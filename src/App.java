public class App {
    public static void main(String[] args) {

        VetorMap vetorMapa = new VetorMap();
        LDE<Integer, Veiculo> listaMapa = new LDE<>();
        AAB<Integer, Veiculo> arvoreMapa = new AAB<>();

        ManipuladorMap manipuladorMapa = new ManipuladorMap(vetorMapa, listaMapa, arvoreMapa);


        manipuladorMapa.inserirVeiculosAAB();
        manipuladorMapa.inserirVeiculosVetor();
        manipuladorMapa.inserirVeiculosLDE();
        manipuladorMapa.ordenarVeiculosLDE();
        manipuladorMapa.exibirVeiculosAAB();
        manipuladorMapa.ordenarVeiculosVetor();
        manipuladorMapa.contarVeiculosFordAAB();
        manipuladorMapa.contarVeiculosFordVetor();
        manipuladorMapa.contarVeiculosFordLDE();
        manipuladorMapa.removerVeiculosVetor();
        manipuladorMapa.removerVeiculosLDE();
        manipuladorMapa.removerVeiculosAAB();
        manipuladorMapa.exibirTemposGastos();
    }
}