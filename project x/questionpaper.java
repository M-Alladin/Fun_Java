import java.io.*;
class questionpaper
{   
    public static void main()throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the no of elements");
        int x=Integer.parseInt(br.readLine());
        int a[]=new int [x];
        System.out.print("enter the array");
        for(int i=0;i<x;i++)
        a[i]=Integer.parseInt(br.readLine());
            
        for (int i=0;i<a.length;i++)
        for(int z=0;z<a.length-i-1;z++)
        {
            if(a[z]>a[z+1])
            {
                int l=a[z+1];
                a[z+1]=a[z];
                a[z]=l;
            }
        }
        for(int i=0;i<a.length;i++)
        System.out.print(" "+a[i]);
    }
}