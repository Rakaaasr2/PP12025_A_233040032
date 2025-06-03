package Pertemuan11.Latihan4;

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

        for (int i = 0; i < maxVertds; i++) { // set adjacency
            for (int j = 0; j < maxVertds; j++)
                adjMat[i][j] = 0;
        }
    }

    public void addVertex(char lab) {
        vertexlist[nVerts++] = new Vertex(lab);
    }
    public void addEdge(int start, int end){
        adjMat[start][end] = adjMat[start][end];
        adjMat[start][end] = adjMat[start][end];

    }

    public void adjacencyMatrix(){
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.println(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

