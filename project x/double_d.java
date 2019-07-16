import java.io.*;
/**
 * Write a description of class double_d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class double_d
{   
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the dimentions 1st rows 2nd colums ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c[][]=new int [a][b];
        for(int i=0;i<a;i++)
        {
            for(int i1=0;i1<b;i1++)
            {
                System.out.print("input the array colom");
                c [i][i1]=Integer.parseInt(br.readLine());

                
            }
        }
        for(int i=0;i<b;i++)
        {
            System.out.println();
        for(int i1=0;i1<a;i1++)
        {

        }
    }
}
}
  