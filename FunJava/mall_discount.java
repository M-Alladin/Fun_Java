
import java.io.*;
public class mall_discount
{
    public static void main()throws IOException
    {
        InputStreamReader lon =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(lon);
        System.out.println("enter amt ");
        double i = Double.parseDouble(br.readLine());
        if (i<2000)
        {
        i=i-i*1/20;
        System.out.println("the amt to be paid ="+i);
        }
        else if (i>2000 && i<5000)
        {
            i=i-i*1/4;
            System.out.println ("the amt to be paid is "+i);
        }
        else if (1>5000 && i<10000)
        {
            i=i-i*35/100;
            System.out.println("the amt to be paid is " +i);
        }
        else
        {
            i=i-i*1/2;
            System.out.println("the amt to be paid is "+i);
        }
    }
}
        
       
