public class Main {

    public static void main(String[] args) {
        Graph root=new Graph();

        root.addVertex('A');
        root.addVertex('B');
        root.addVertex('C');
        root.addVertex('D');
        root.addVertex('E');
        root.addVertex('F');
        root.addVertex('H');


        root.addEdge(0,1);
        root.addEdge(0,2);
        root.addEdge(0,3);
        root.addEdge(1,3);
        root.addEdge(1,4);
        root.addEdge(2,5);
        root.addEdge(1,6);


//        root.dfs();
        root.mst();
//        root.bfs();



    }
}
