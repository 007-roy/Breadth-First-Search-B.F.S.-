package Graph;
import java.util.Iterator;
import java.util.LinkedList;


public class Breadth_First_Search {
    private int V;
    private LinkedList<Integer> adj[];

    //Create A Graph
    Breadth_First_Search(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < V;i++)
            adj[i] = new LinkedList<>();
    }

    //Add edges to graph
    void addedge(int v,int w){
        adj[v].add(w);
    }

    //BFS Algorithm
    void BFS(int s){

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args){
        Breadth_First_Search g = new Breadth_First_Search(4);

        g.addedge(0,1);
        g.addedge(0,2);
        g.addedge(1,2);
        g.addedge(2,0);
        g.addedge(2,3);
        g.addedge(3,3);

        System.out.println("Starting from Vertex 0 : \n");


        g.BFS(0);
    }

}
