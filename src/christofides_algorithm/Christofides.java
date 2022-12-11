package christofides_algorithm;

import christofides_algorithm.Weighted_Graph.Graph;

public class Christofides {

	public static void main(String[] args) {		
		
		double distance = 0;
		int size = 5;
		int[] id = {1, 2, 3, 4, 5};
		int[][] cordinate = {{0,0}, {1,2}, {2,2}, {3,3}, {5,5}};
		
		int vertices = 5;
		Graph graph = new Graph(vertices);
		
		
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				distance = (getDistance(cordinate[i][0],cordinate[i][1],cordinate[j][0],cordinate[j][1]));
				System.out.println(distance);
				graph.addEdge(id[i], id[j], distance);
			}
		}
		
		graph.printGraph();
	} 
	private static double getDistance(double x1, double y1, double x2, double y2) {
	    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
}

