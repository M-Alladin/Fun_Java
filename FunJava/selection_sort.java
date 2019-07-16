import java.io.*;
/**
 * Write a description of class selection_sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selection_sort
{
   public static void main()throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the array length");
       int x=Integer.parseInt(br.readLine());
       int a[]=new int [x];
       for(int i=0;i<x;i++)
       {
           System.out.print ("enter the element");
           a[i]=Integer.parseInt(br.readLine());
        }
        //selection sort
       for(int i=0;i<a.length;i++)
       for(int z=i;z<a.length-1;z++)
       {
           if(a[z]>a[z+1])
           {
               int temp =a[z];
               a[z]=a[z+1];
               a[z+1]=temp;
            }
        }
        for (int i=0;i<a.length;i++)
        System.out.print(a[i]);
    }
}
       