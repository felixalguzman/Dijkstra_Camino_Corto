package logical;

import java.io.FileNotFoundException;

/**
 * Created by felix on 4/13/2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
            int[] ver = {7,37,59,82,99,115,133,165,188,197 };
            Grafo g = new Grafo("Archivo/Archivo.txt");
            int[] caminos = g.caminoCorto();

        for (int i: ver){
            System.out.print(caminos[i] + " ");

        }



    }
}
