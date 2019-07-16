import java.io.*;
public class compund_intrest
{
public static void main()throws IOException
{   
    InputStreamReader in =new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.println("enter principal");
    double p = Double.parseDouble(br.readLine());
    System.out.println("enter rate");
    double r = Double.parseDouble(br.readLine());
    System.out.println("enter tym");
    double t = Double.parseDouble(br.readLine());
    double i =0.0;
    for(int z=0;z<=t;z++)
    i=p*r/100;
    System.out.println("the intrest is "+i);
}
}
