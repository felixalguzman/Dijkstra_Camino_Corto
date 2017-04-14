package logical;

import java.io.FileNotFoundException;

/**
 * Created by felix on 4/13/2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Grafo g = new Grafo("Archivo/Archivo.txt");
        int[] caminos = g.caminoCorto();


        System.out.print(caminos[7] +"," +caminos[37] + "," +caminos[59] + "," +caminos[82] + "," + caminos[99] + ", " +caminos[115]+ ","+ caminos[133] + "," + caminos[165] + ","+caminos[188] + ", " +caminos[197] );





    }
}
