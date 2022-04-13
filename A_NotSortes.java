import java.util.*;
import java.lang.*;
import java.io.*;
public class A_NotSortes 
{
    int start,finish;
    public A_NotSortes(int start,int finish)
    {
        this.start=start;
        this.finish=finish;
    }
}
 class compare
{
    void Compare(A_NotSortes a[],int n)
    {
        Arrays.sort(a,new Comparator<A_NotSortes>()
        {
            public int compare(A_NotSortes a1,A_NotSortes a2)
            {
                return a1.finish-a2.finish;
            }
        });
    }
}
 class GFG
{
    static void printmax(A_NotSortes a[],int n)
    {
        compare obj=new compare();
        obj.Compare(a,n);
        System.out.println("Following Activities are selected");
        int i=0;
        System.out.print("("+a[i].start+","+a[i].finish+") ");
        for(int j=1;j<n;j++)
        {
            if(a[j].start>=a[i].finish)
            {
                System.out.print("("+a[j].start+","+a[j].finish+") ");
                i=j;
            }
        }

    }
    public static void main(String args[])
    {
        A_NotSortes a[]=new A_NotSortes[5];
        a[0]=new A_NotSortes(1,2);
        a[1]=new A_NotSortes(3,4);
        a[2]=new A_NotSortes(0,6);
        a[3]=new A_NotSortes(5,7);
        a[4]=new A_NotSortes(8,9);
        int n=a.length;
        printmax(a,n);
    }
}