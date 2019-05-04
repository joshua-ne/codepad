import java.util.LinkedList;

enum State {Unvisited, Visited, Visiting};

boolean search(Graph g, Node start, Node end) {
	if (start == end) return true;

	Queue<Node> queue = new LinkedList<>();

	//mark every node in the graph as unvisited
	for (Node i : g.getNodes()) {
		u.state = State.Unvisited;
	}

	start.state = State.Visiting;
	queue.add(start);

	Node u;

	while (!queue.isEmpty()) {
		u = u.queue.remove();
		if (u != null) {
			for (Node v : u.getAdjacent()) {
				if (v.state == State.Unvisited) {
					if (v == end) {return true;}
					else {
						v.state = State.Visiting;
						queue.add(v);
					}
				}
			}
			u.state = State.Visited;
		}
	}
	return false;
}