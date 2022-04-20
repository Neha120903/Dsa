package Graph;
import java.util.*;
public class MyGraph {
	Map<Integer,LinkedList<Integer>> obj;
	public MyGraph() {
		obj = new HashMap();
	}
	public void addEdge(int v1, int v2, boolean bidirectional) {
		LinkedList<Integer> v1neighbour = obj.getOrDefault(v1,new LinkedList());
		v1neighbour.add(v2);
		obj.put(v1, v1neighbour);
		if(bidirectional == true) {
			LinkedList<Integer> v2neighbour = obj.getOrDefault(v2,new LinkedList());
			v1neighbour.add(v1);
			obj.put(v2, v2neighbour);
		}
	}
	public void bfsTraversal(int source) {
		Queue<Integer> bfs= new LinkedList<>();
		bfs.add(source);
		Set<Integer> vis= new HashSet<>();
		vis.add(source);
		while(!bfs.isEmpty()) {
			int front =bfs.poll();
			System.out.println(front);
			LinkedList<Integer> neighbourlist =obj.get(front);
			for(int res: neighbourlist) {
				if(!vis.contains(res)) {
					bfs.add(res);
					vis.add(res);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		MyGraph mg= new MyGraph();
		mg.addEdge(10,20,true);
		mg.addEdge(20,30 ,true);
		mg.addEdge(s.nextInt(), s.nextInt(),true);
		mg.bfsTraversal(10);
	}
}
