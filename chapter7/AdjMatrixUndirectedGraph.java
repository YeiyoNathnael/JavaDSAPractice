import java.util.*;
public class AdjMatrixUndirectedGraph {
	private int V;
	private int E;
	private ……………………………… adj;
	public AdjMatrixUndirectedGraph(int V) { // empty graph with V vertices
		this.V = ………………………………;
		this.E = ………………………………;
		this.adj = ………………………………;
	}
// initialize graph with from input matrix
	public AdjMatrixUndirectedGraph(int [][] matrix) {
		this.V = ………………………………;
		this.adj = new boolean[V][V];
		for (int i=0; i< ………………………………; i++)
			for (int j = 0; j< ………………………………; j++)
				if (………………………………) addEdge(i, ………………………………);
	}
// number of vertices and edges
public int V() { return ………………………………; }
public int E() { return ………………………………; }
public void addEdge(int v, int w) { // add undirected edge v-w
if (………………………………) {
E++;
adj[v][w] = ………………………………;
adj[w][v] = ………………………………;
}
}
private int w = 0;
AdjIterator(int v) { this.v = v; }
public Iterator<Integer> iterator() { return this; }
public boolean hasNext() {
while (………………………………) {
if (………………………………) return true;
………………………………;
}
return ………………………………;
}
public void remove() { throw new UnsupportedOperationException(); }
public Integer next() {
if (!hasNext()) throw new NoSuchElementException();
return ………………………………;
}
}
// string representation of Graph - takes quadratic time
public String toString() {
StringBuilder s = new StringBuilder();
s.append(V + " " + E + "\n");
for (int v = 0; v < V; v++) {
s.append(v + ": ");
for (int w : adj(v)) {
s.append(w + " ");
}
s.append("\n");
}
return s.toString();
}
// test client
public static void main(String[] args) {
int[][] adjacencyMatrix = {
{0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, // Seattle
{1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, // San Francisco
{0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, // Los Angeles
{1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0}, // Denver
{0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}, // Kansas City
{1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0}, // Chicago
{0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, // Boston
{0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, // New York
{0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1}, // Atlanta
{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, // Miami
{0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1}, // Dallas
{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0} // Houston
};
AdjMatrixUndirectedGraph G = new AdjMatrixUndirectedGraph(adjacencyMatrix);
System.out.println(G);
System.out.println(G.neighbors(5));
}
}
