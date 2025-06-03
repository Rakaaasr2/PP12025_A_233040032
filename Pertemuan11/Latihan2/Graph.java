package Pertemuan11.Latihan2;

import Pertemuan11.Latihan1.Vertex;

public class Graph {

    private Vertex vertexlist[]; // array of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // current number of verties

    public Graph(int maxVertds) { //construktor
        vertexlist = new Vertex[maxVertds];
        // adjacency matrix
        adjMat = new int[maxVertds][maxVertds];
        nVerts = 0;

        for(int i = 0; i < maxVertds; i++) { // set adjacency
            for(int j = 0; j < maxVertds; j++)
                adjMat[i][j] = 0;

        }

    }
}
