import java.io.*;

public class area
{
    public static void main()throws IOException
    {
    InputStreamReader in =new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(in);
    System.out.println("enter length");
    int z = Integer.parseInt(br.readLine());
    System.out.println("enter breadth");
    int x = Integer.parseInt(br.readLine());
    int area=x*z;
    System.out.println("the area is "+area);
}
}
