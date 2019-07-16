import java.io.*;
class taxation
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter sex");
        String sex = br.readLine();
        System.out.print("enter age");
        int age =Integer.parseInt(br.readLine());
        if(sex.equals("male")&& age<=65)
        {
            System.out.print("enter maney earned");
            int ti=Integer.parseInt(br.readLine());
            if(ti<160000)
            System.out.print("no tax");
            if(ti>160000 && ti<500000)
            System.out.print("tax="+((ti-160000)*10/100));
            if(ti>500000 &&ti<800000)
            System.out.print("tax="+(((ti-500000)*20/100)+34000));
            if (ti<800000)
            System.out.print("tax="+(((ti-800000)*30/100)+94000));
        }
        else 
        System.out.print("wrong catagory");
    }
}
        

