import java.io.*;
public class bubblesort
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
        //bubble sort
        for(int i=0;i<x-1;i++)
        { 
            for(int z=0;z<x-1-i;z++)
            {
               
               if(a[z]>a[z+1])
               {    
                   int temp=a[z+1];
                    a[z+1]=a[z];
                    a[z]=temp;
                }
            }
        }
       for(int i=0;i<a.length;i++) 
       {
           System.out.println(a[i]);
        }
    }
}
       
        

