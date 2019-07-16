import java.util.*;
class Simple
{
   public static void main()
   {
       int []a=new int[10];
       Scanner s=new Scanner(System.in);
       for(int i=0;i<10;i++)
       {
           a[i]=s.nextInt();
        }
        //a[0]=a[9];
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+"\t");
        }
        
    }
           
}