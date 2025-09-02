import java.util.*;

public class GraphList {
    private final Map<Integer, List<Integer>> adjList;
    private final boolean isDirected;

    public GraphList(int vertices, boolean isDirected) {
        this.adjList = new HashMap<>();
        this.isDirected = isDirected;

        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        if (!isDirected) {
            adjList.get(v).add(u);
        }
    }

    public void printGraph() {
        for(int vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            for(int neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }   
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of vertices: ");
            int vertices = sc.nextInt();
            System.out.print("Is the graph directed? (Yes/No): ");
            String directedInput = sc.next();
            boolean isDirected = directedInput.equalsIgnoreCase("Yes");
            
            GraphList graph = new GraphList(vertices, isDirected);
            System.out.print("Enter number of edges: ");
            int edges = sc.nextInt();
            System.out.println("Enter edges (u v):");
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.addEdge(u, v);
            }
            
            System.out.println("Graph adjacency list:");
            graph.printGraph();
        }
    }
}
