import java.io.*;
/**
 * Write a description of class boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boy
{   
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("enter weight");
            a[i]=Integer.parseInt(br.readLine());
        }
        //selection sort
        for(int i=0;i<10;i++)
        for(int z=i;z<9;z++)
        {
            if(a[i]>a[z+1])
            {
                int temp=a[i];
                a[z+1]=a[i];
                a[z+1]=temp;
            }
        }
         System.out.print("assending");
        for(int i=0;i<10;i++)
        System.out.print(a[i]+" ");
        System.out.print("decending");
         int b[]=new int[10];
        for(int i=0;i<10;i++)
        a[i]=b[9-i];
        for(int i=0;i<10;i++)
        System.out.print(b[i]+" ");
    }
}