
import java.io.*;
public class classshit
{
    public static void main()throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter string");
        String s=br.readLine();
        int a=1;int b=0;
        for(int i=1;i<s.length()-1;i++)
        {
            char c= s.charAt(i-1);
            if (c== 32)
            {
                
                String d=s.substring(b,i-1);
                int z;
                String f="";
                for(z =1 ; z< d.length()-1;z++)
                {
                    char e = d.charAt(z-1);
                    
                    f+=e;

                }
                    if (f.equals(z))
                    System.out.print (f+"is a palendromic no");
                
            
                b=i;
                a++;
            continue ;
        }
    }
    
}}