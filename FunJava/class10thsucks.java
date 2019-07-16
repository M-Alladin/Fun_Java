import java.io.*;
public class class10thsucks
{
    public static void main()throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter string");
        String s=br.readLine();
        int a=1;
        for(int i=1;i<s.length()-1;i++)
        {
            char c= s.charAt(i-1);
            if (c== 32)
            {
                a++;
            continue ;
             }
            }
            System.out.print(a+"words");
        }
    }
            