package logical;

import java.io.FileNotFoundException;

/**
 * Created by felix on 4/13/2017.
 *
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        Grafo g = new Grafo("Archivo/Archivo.txt");
        int[] caminos = g.caminoCorto();



        System.out.println(caminos[6] + "," + caminos[36] + "," + caminos[58] + "," +
                caminos[81] + "," + caminos[98] + "," + caminos[114] + "," +
                caminos[132] + "," + caminos[164] + "," + caminos[187] +
                "," + caminos[196]);



    }
}
