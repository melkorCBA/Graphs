public class Graph {
    private final int MAX_VERTEX_SIZE = 7;
    Vertex[] vertexList;
    int[][] adjmatrix;
    int nVert;

    private Stack dfsStack;
    private Queue bfsQueue;

    public Graph() {
        this.vertexList = new Vertex[MAX_VERTEX_SIZE];
        this.adjmatrix = new int[MAX_VERTEX_SIZE][MAX_VERTEX_SIZE];
        nVert = 0;

//        initialize adjacency matrix
        for (int i = 0; i < MAX_VERTEX_SIZE; i++) {
            for (int j = 0; j < MAX_VERTEX_SIZE; j++) {
                adjmatrix[i][j] = 0;
            }
        }

        dfsStack = new Stack(5);
        bfsQueue = new Queue(20);

    }

    public void addVertex(char label) {
        vertexList[nVert++] = new Vertex(label);


    }

    public void addEdge(int start, int end) {
        adjmatrix[start][end] = 1;
        adjmatrix[end][start] = 1;

    }

    public void viewGraph() {
        for (Vertex x : vertexList) {
            System.out.println(x);
        }
    }

    public int getAdjUnvisitedVert(int vertPoint) {

        for (int i = 0; i < MAX_VERTEX_SIZE; i++) {

            if (adjmatrix[vertPoint][i] == 1) {
                if (vertexList[i].wasVisited == false) {
                    return i;
                }

            }

        }
        return -1;
    }

    public void dfs() {
//
//        begin at index zero
        int currentVertexIndex = 0;
        dfsStack.push(0);
        vertexList[0].wasVisited = true;
        System.out.println(vertexList[dfsStack.peek()]);
        while (dfsStack.top != -1) {


            currentVertexIndex = this.getAdjUnvisitedVert(dfsStack.peek());
            if (currentVertexIndex != -1) {
                dfsStack.push(currentVertexIndex);
                vertexList[currentVertexIndex].wasVisited = true;
                System.out.println(vertexList[dfsStack.peek()]);


            } else {
                currentVertexIndex = dfsStack.pop();

            }
        }
//        reset wasVisted
        for (Vertex x : vertexList) {
            x.wasVisited = false;
        }
    }


    public void bfs() {
        bfsQueue.push(0);
        vertexList[0].wasVisited = true;
        int cuurentVertexIndex = 0;
        System.out.println(vertexList[cuurentVertexIndex]);

        while (!bfsQueue.isEmpty()) {
            cuurentVertexIndex = this.getAdjUnvisitedVert(bfsQueue.peek());
            if (cuurentVertexIndex != -1) {
                bfsQueue.push(cuurentVertexIndex);
                vertexList[cuurentVertexIndex].wasVisited = true;
                System.out.println(vertexList[cuurentVertexIndex]);

            } else {
                bfsQueue.pop();
            }
        }

        for (Vertex x : vertexList) {
            x.wasVisited = false;
        }

    }

    public void mst() {
//        begin at index zero
        int currentVertexIndex = 0;
        dfsStack.push(0);
        vertexList[0].wasVisited = true;
//        System.out.println(vertexList[dfsStack.peek()]);
        while (dfsStack.top != -1) {


            currentVertexIndex = this.getAdjUnvisitedVert(dfsStack.peek());
            if (currentVertexIndex != -1) {
                System.out.print(vertexList[dfsStack.peek()]);
                dfsStack.push(currentVertexIndex);
                vertexList[currentVertexIndex].wasVisited = true;
                System.out.print(vertexList[dfsStack.peek()]);
                System.out.print(", ");


            } else {
                currentVertexIndex = dfsStack.pop();

            }
        }
        for (Vertex x : vertexList) {
            x.wasVisited = false;
        }
    }
}
