import java.io.*;
/**
 * Write a description of class pp2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pp2
{
public static void main ()throws IOException 
{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter no 1");
    double x= Integer.parseInt(br.readLine());
    System.out.println("enter no 2");
    double y= Integer.parseInt(br.readLine());
    System.out.println("enter no 3");
    double z= Integer.parseInt(br.readLine());
    if(x>y&&x>z)
    System.out.println("x is the least ");
    if(y>x&&y>z)
    System.out.println("y is the least");
    if(z>x && z>y)
    System.out.println("z is the least ");
}
}