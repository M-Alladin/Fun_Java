import java.io.*;
public class electricity
{
    public static void main()throws IOException
    {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("enter units");
        int p = Integer.parseInt(br.readLine());
        float z=0;
        if (p<=100)
        {
            z=((p*80)/100)+50;
        System.out.println("amt="+z);
        }    
        else if (p<=200)
        {
            
        z=p+50;
         System.out.println("amt="+z);
        }
        else
        {
        z=((p*125)/100)+50;
         System.out.println("amt="+z);
        }
    }
}
        