package christofides_algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import christofides_algorithm.Weighted_Graph.Graph;

public class Christofides {

	/*
	 * public static void main(String[] args) {		
		
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
		
		//graph.printGraph();
		(graph.getMST(graph)).printGraph(); 
		
	}
	private static double getDistance(double x1, double y1, double x2, double y2) {
	    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	*/
	
	public static void main(String[] args) {
		
		getInput();
		
		/*int[][] graph = {
				{ 0, 2, 5, 3, 4 },
		        { 2, 0, 6, 4, 5 },
		        { 5, 6, 0, 7, 8 },
		        { 3, 4, 7, 0, 6 },
		        { 4, 5, 8, 6, 0 }
		        };
		
		
		//MINIMUM SPANNING TREE
		int[][] graphMST = new int[graph.length][graph[0].length];
		graphMST = MinimumSpanningTree.getKruskalMST(graph);
		for(int i = 0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				System.out.print(graphMST[i][j] + " ");
			}
			System.out.println();
		}
	
		boolean[] oddVertex = new boolean[graph.length];
		//VERTEX WITH ODD Degree
		int count = 0;
		for(int i = 0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				if (graphMST[i][j]!= 0)
					count++;
			}
			if(count % 2 == 1) {
				oddVertex[i] = true;
				System.out.println("Vertex with odd degree: "+ i);
			}
			else
				oddVertex[i] = false;
			
			count = 0;
		}
		
		int[][] subGraph = new int[graph.length][graph[0].length];
		//make a subgraph using only the odd vertices
		for(int i=0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				if(oddVertex[i] && oddVertex[j] && (i!=j)) {
					subGraph[i][j] = graph[i][j];
				}
				else
					subGraph[i][j] = 0;
			}
		}
		
		for(int i = 0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				System.out.print(subGraph[i][j] + " ");
			}
			System.out.println();
		}
		
	*/
	}
	
	public static void getInput() {
		ArrayList<String> cities = new ArrayList<String>();
		int numberofCities = 11;
		double[][] graph = new double[numberofCities][numberofCities];
		
		try {
		      File myObj = new File("input.txt");
		      Scanner myReader = new Scanner(myObj);
		      String endString = "End of Data";
		      String data = ""; //first line
		      
		      String source = "";
		      String destination = "";
		      double distance = 0.0;
		      
		      while(myReader.hasNextLine()){
		    	  data = myReader.nextLine();//next line
		    	  
		    	  if (data.equals(endString))
		    		  break;
		    	  source = data;
		    	  System.out.println("Source: "+ source);
		    	  if(!cities.contains(source)) {
		    		  cities.add(source);
		    	  }
		    	  
		    	  data = myReader.nextLine();//next line
		    	  if (data.equals(endString))
		    		  break;
		    	  destination = data;
		    	  System.out.println("Destination: "+ destination);
		    	  if(!cities.contains(destination)) {
		    		  cities.add(destination);
		    	  }
		    	  
		    	  data = myReader.nextLine();//next line
		    	  if (data.equals(endString))
		    		  break;
		    	  distance = Double.parseDouble(data);
		    	  System.out.println("Distance: "+ distance);
		    	  
		    	  graph[cities.indexOf(source)][cities.indexOf(destination)] = distance;
		    	  graph[cities.indexOf(destination)][cities.indexOf(source)] = distance;
		    	  
		      }
		      myReader.close();
		    } 
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		for(int i=0; i<cities.size();i++) {
   		 System.out.println(cities.get(i));
   	 	}
		for(int i = 0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

