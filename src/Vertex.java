public class Vertex {
    public char lable;
    public boolean wasVisited;

    public Vertex(char lable) {
        this.lable = lable;
        wasVisited=false;

    }

    @Override
    public String toString() {
        return String.valueOf(lable);
    }
}
