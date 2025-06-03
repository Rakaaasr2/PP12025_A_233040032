package Pertemuan11.Latihan1;

public class Vertex {
    private char label; // label (e,g, `A`)
    private boolean wasVisited;

    public void setLabel(char label) {
        this.label = label;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public Vertex(char lab) { // constructor
        label = lab;
        wasVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }
}

/** setter getter **/

