import java.io.*;
public class bubble_sort
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter length");
        int n = Integer.parseInt(br.readLine());
        int a []=new int [n];
        System.out.print("enter no");
        for(int i=0;i<a.length;i++)
        a[i]=Integer.parseInt(br.readLine());
        for(int i=0;i<a.length-1;i++)
        for(int z=1;z<a.length-1;z++)
        {
            if(a[z]>a[z+1])
            {
                int s=a[z];
                a[z]=a[z+1];
                a[z+1]=s;
            }
    }
    for(int i=0;i<a.length;i++)
    System.out.print(" " + a[i]);
}
}