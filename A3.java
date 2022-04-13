import java.util.*;
import java.lang.*;
import java.io.*;
class Array{
    int start,finish;
    public Array(int start,int finish)
    {
        this.start=start;
        this.finish=finish;
    }
}
class Compare{
    void compare(Array a[],int n)
    {
        Arrays.sort(a,new Comparator<Array>()
        {
            public int compare(Array a1,Array a2)
            {
                return a1.finish-a2.finish;
            }

            
        });
    }
}




public class A3 {
    static void printmax(Array a[],int n)
    {
        int i,j;
        i=0;
        System.out.print("("+a[i].start+","+a[i].finish+") ");
        for(j=1;j<n;j++)
        {
            if(a[j].start>=a[i].finish)
            {
                System.out.print("("+a[j].start+","+a[j].finish+") ");
            }
            i=j;
        }
    }
    public static void main(String args[])
    {
        Array a[]=new Array[5];
        a[0]=new Array(1,2);
        a[1]=new Array(3,4);
        a[2]=new Array(0,6);
        a[3]=new Array(5,7);
        a[4]=new Array(8,9);
        int n=a.length;
        printmax(a,n);
    }
}
