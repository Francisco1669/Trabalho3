package Vetor;

public class Vetor {
    private double[] notas = new double[100001];
    private int totalNotas = 0;

    public void adiciona(double nota) {
        if (this.totalNotas < this.notas.length) {
            this.notas[this.totalNotas] = nota;
            this.totalNotas++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public boolean remove(double nota) {
        int indice = -1;
        for (int i = 0; i < totalNotas; i++) 
            if (nota == this.notas[i]) {
                indice = i;
                break;
            }
        if (indice != -1) { 
            for (int i = indice; i < (totalNotas - 1); i++)
                notas[i] = notas[i + 1];
            totalNotas--;
            return true;
        }
        return false;
    }

    public int tamanho() {
        return totalNotas;
    }

    public boolean contem(double nota) {
        for (int i = 0; i < this.totalNotas; i++) {
            if (notas[i] == nota) {
                return true;
            }
        }
        return false;
    }

    public boolean cheio() {
        return (totalNotas == this.notas.length);
    }
}
