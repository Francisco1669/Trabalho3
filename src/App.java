import java.util.Random;

import Arvore_Binaria.AAB;
import LDE.LDE;
import Vetor.Vetor;

public class App {
    public static void main(String[] args) throws Exception {
        
        AAB a = new AAB();
        LDE l = new LDE();
        Vetor v = new Vetor();

        Random r = new Random();
       

        for (int i = 0; i <= 100000; i++) {
           a.add(r.nextInt(100000));
        }
        for (int i = 0; i <= 100000; i++) {
           l.insereInicio(r.nextInt(100000));
        }
        for (int i = 0; i <= 100000; i++) {
           v.adiciona(r.nextInt(100000));
        }
        
    }
}
