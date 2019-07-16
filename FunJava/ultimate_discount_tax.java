import java.io.InputStream;
import java.io.BufferedReader;
import java.io.*;
public class ultimate_discount_tax
{
    public static void main()throws IOException
    {
    InputStreamReader in =new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    System.out.println("enter amt ");
    int p = Integer.parseInt(br.readLine());
    System.out.println("enter tax");
    float t = Float.parseFloat(br.readLine());
    System.out.println("enter discount");
    float d = Float.parseFloat(br.readLine());
    float damt =p-p*d/100;
    float ttlamt= damt +damt*t/100;
    System.out.println("the amt ="+ttlamt);
    }
}
        