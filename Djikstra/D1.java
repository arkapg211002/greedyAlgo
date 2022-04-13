import java.util.*;
import java.io.*;
import java.lang.*;
public class D1
{
    static final int V=9;
    int minD(int dist[],Boolean sptSet[])
    {
        int min=Integer.MAX_VALUE,min_index=-1;
        for(int v=0;v<V;v++)
        {
            if(sptSet[v]==false && dist[v]<=min)
            {
                min=dist[v];
                min_index=v;
            }
        }
        return min_index;
    }

    void printSolution(int dist[])
    {
        System.out.println("Vertex\t\tDistance from Source");
        for(int i=0;i<V;i++)
            System.out.println(i+"\t\t\t"+dist[i]);
    }
    void djikstra(int g[][],int src)
    {
        int dist[]=new int[V];
        Boolean sptSet[]=new Boolean[V];
        for(int i=0;i<V;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
        }
        dist[src]=0;
        for(int c=0;c<V-1;c++)
        {
            int u=minD(dist,sptSet);
            sptSet[u]=true;
            for(int v=0;v<V;v++)
            {
                if(!sptSet[v] && g[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+g[u][v]<dist[v])
                {
                    dist[v]=dist[u]+g[u][v];
                }
            }

        }
        printSolution(dist);
    }
    public static void main(String args[])
    {
        D1 d=new D1();
        int g[][]=new int[][]{{0,4,0,0,0,0,0,8,0},
                              {4,0,8,0,0,0,0,11,0},
                              {0,8,0,7,0,4,0,0,2},
                              {0,0,7,0,9,14,0,0,0},
                              {0,0,0,9,0,10,0,0,0},
                              {0,0,4,14,10,0,2,0,0},
                              {0,0,0,0,0,2,0,1,6},
                              {8,11,0,0,0,0,1,0,7},
                              {0,0,2,0,0,0,6,7,0}
                             };
        d.djikstra(g,0);
    }

    
}