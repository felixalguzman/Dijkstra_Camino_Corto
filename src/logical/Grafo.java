package logical;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Grafo {

    private ArrayList<ArrayList<int[]>> vertices;
    private HashSet<Integer> explorado;


    public Grafo(String inputFileName) throws FileNotFoundException {
        vertices = new ArrayList<ArrayList<int[]>>();
        Scanner in = new Scanner(new File(inputFileName));
        //add all vertices
        while (in.hasNextLine()) {
            vertices.add(new ArrayList<int[]>());
            String[] line = in.nextLine().split("\t");
            int nodo = Integer.parseInt(line[0]);
            for (int i = 1; i < line.length; i++) {
                String[] edgeStr = line[i].split(",");
                int[] edge = new int[2];
                edge[0] = Integer.parseInt(edgeStr[0]);
                edge[1] = Integer.parseInt(edgeStr[1]);
                vertices.get(nodo - 1).add(edge);
            }
        }
    }
    public int[] caminoCorto(){
        int n = vertices.size();
        explorado = new HashSet<Integer>();
        int[] caminos = new int[n];
        explorado.add(1);
        caminos[0] = 0;
        while (explorado.size() < n){
            int w = -1;
            int l = 1000000;
            for (int nodo : explorado){
                for (int[] edge : vertices.get(nodo - 1)){
                    if (!explorado.contains(edge[0])){
                        if (caminos[nodo-1] + edge[1] < l){
                            w = edge[0];
                            l = caminos[nodo-1] + edge[1];
                        }
                    }
                }
            }
            if (w != -1){
                explorado.add(w);
                caminos[w-1] = l;

            } else {
                for (int i = 0; i < n; i++){
                    if (!explorado.contains(i+1)){
                        caminos[i] = 1000000;
                    }
                }
                break;
            }
        }
        return caminos;
    }


}
