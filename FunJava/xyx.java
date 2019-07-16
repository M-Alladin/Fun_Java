import java.io.*;
public class xyx
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter length");
        int n = Integer.parseInt(br.readLine());
        int a []=new int [n];
        System.out.print("enter no");
        for(int i=0;i<a.length;i++)
        a[i]=Integer.parseInt(br.readLine());//i donbefihgdsiuydfgweaudbhaset
        for(int i=0;i<a.length-1;i++)
        for(int z=0;z<a.length-1-i;z++)
        {
            if(a[z]>a[z+1])
            {
                int s=a[z];
                a[z]=a[z+1];
                a[z+1]=s;
            }
    }
    for(int i=0;i<a.length;i++)
    System.out.print(" "+a[i]);
}
}