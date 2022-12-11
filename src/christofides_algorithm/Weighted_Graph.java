package christofides_algorithm;

import java.util.LinkedList;

public class Weighted_Graph {
	
	static class Edge {
		 int source;
		 int destination;
		 double weight;
	public Edge(int source, int destination, double weight){
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}
	}
	
	static class Graph{
		int verticesSize;
		LinkedList<Edge>[] adjacencyList;
		
		public Graph(int vertices) {
			this.verticesSize = vertices;
			adjacencyList = new LinkedList[vertices];
			for(int i = 0; i < vertices; i++)
				adjacencyList[i] = new LinkedList<>();
		}
		
		public void addEdge(int source, int destination, double weight) {
			Edge edge = new Edge(source, destination, weight);
			adjacencyList[source].addFirst(edge);
		}
		
		public void printGraph(){
			 for (int i = 0; i <verticesSize ; i++) {
				 LinkedList<Edge> list = adjacencyList[i];
				 for (int j = 0; j <list.size() ; j++) {
					 System.out.println("vertex-" + i + " is connected to " +
					 list.get(j).destination + " with weight " + list.get(j).weight);
				 }
			 }
		 }
		public Graph getMST(Graph grph) {
			
			
			
			return grph;
		}
	}
}
