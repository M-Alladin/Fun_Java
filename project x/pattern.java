import java.io.*;
/**
 * Write a description of class pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern
{
    public static void main () throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no");
        int n=Integer.parseInt(br.readLine());
        for(int i=n;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}
        