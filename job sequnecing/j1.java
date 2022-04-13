import java.util.*;
import java.lang.*;
import java.io.*;
public class j1
{
    char id;
    int deadline,profit;
    public j1(){}
    public j1(char id,int deadline,int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
    void JS(ArrayList<j1> arr,int t)
    {
        int n=arr.size();
        Collections.sort(arr,(a,b)->a.profit-b.profit);
        boolean result[]=new boolean[t];
        char job[]=new char[t];
        for(int i=0;i<n;i++)
        {
            for(int j=Math.min(t-1,arr.get(i).deadline-1);j>=0;j--)
            {
                if(result[j]==false)
                {
                    result[j]=true;
                    job[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(char jb:job)
        {
            System.out.print(jb+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        ArrayList<j1> arr=new ArrayList<j1>();
        arr.add(new j1('a',2,100));
        arr.add(new j1('b',1,19));
        arr.add(new j1('c',2,27));
        arr.add(new j1('d',1,25));
        arr.add(new j1('e',3,15));
        arr.add(new j1('f',1,9));
        arr.add(new j1('g',3,7));
        j1 j=new j1();
        j.JS(arr,3);
    }


}