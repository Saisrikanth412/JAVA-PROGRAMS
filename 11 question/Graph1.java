/*11.B write java program for the implementation of BFS for a given graph*/

import java.io.*;
import java.util.*;
 class Graph1
{
    private int V;  
    private LinkedList<Integer> adj[]; 
       Graph1(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        
        boolean visited[] = new boolean[V];
 
      
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            
            s = queue.poll();
            System.out.print(s+" ");
 
           
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    
    public static void main(String args[])
    {
        Graph1 g = new Graph1(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
}


/*


OUTPUT:

Following is Breadth First Traversal (starting from vertex 2)
2 0 3 1 

 */