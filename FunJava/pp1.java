import java.io.*;
class pp1
{
public static void main () throws IOException 
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    System.out.println("enter product code ");
    String pr = br.readLine();
    System.out.println("enter qty");
    double qty = Double.parseDouble(br.readLine());
    System.out.println("enter rate");
    double r = Double.parseDouble(br.readLine());
    double basic = qty *r;
    if ( basic < 2000)
    System.out.println("the amount ="+basic+"gift=glass set ");
    if(basic>2000 && basic<4000)
    System.out.println("the amount = "+basic+"gift = electrc iron + rs500coupon");
    if (basic >4000 && basic <7000)
    System.out.println("the amount = "+basic+"gift = strolley bag + rs 750.0");
    if (basic >7000)
    System.out.println("the amount = "+basic+"gift = blanket set +rs 1000");
}
}
