package christofides_algorithm;

public class MinimumSpanningTree {
	
	public static int[][] getKruskalMST(int[][] cost) {
		
		
		int[][] minimumSpanningTree = new int[5][5];	
		
		int mincost = 0; // Cost of min MST.

		// Initialize sets of disjoint sets.
		for (int i = 0; i < V; i++)
			parent[i] = i;

		// Include minimum weight edges one by one
		int edge_count = 0;
		while (edge_count < V - 1)
		{
			int min = INF, a = -1, b = -1;
			
			for (int i = 0; i < V; i++){
				for (int j = 0; j < V; j++)
				{
					if (find(i) != find(j) && cost[i][j] < min)
					{
						min = cost[i][j];
						a = i;
						b = j;
					}
				}
			}

			union1(a, b);
			//System.out.printf("Edge %d:(%d, %d) cost:%d \n",edge_count++, a, b, min);
			edge_count++;
			//System.out.println(a+" "+ b+" "+min);
			minimumSpanningTree[a][b] = min;
			minimumSpanningTree[b][a] = min;
			mincost += min;
		}
		System.out.printf("\n Minimum cost= %d \n", mincost);
		
		
		
		
		
		return minimumSpanningTree;
	}
	static int V = 5;
	static int[] parent = new int[V];
	static int INF = Integer.MAX_VALUE;
	// Find set of vertex i
	
	public static int find(int i)
	{
		while (parent[i] != i)
			i = parent[i];
		return i;
	}
	// Does union of i and j. It returns
	// false if i and j are already in same
	// set.
	public static void union1(int i, int j)
	{
		int a = find(i);
		int b = find(j);
		parent[a] = b;
	}
}
