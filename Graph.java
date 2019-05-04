public class Graph {
	public Graph(int v) {
		//create a V-vertiex graph with no edges
	}

	public Graph(In in) {
		//create a graph from input stream in
	}

	int V();
	int E();
	void addEdge(int v, int w);
	Iterable<Integer> adj(int v);
	String toString();
}