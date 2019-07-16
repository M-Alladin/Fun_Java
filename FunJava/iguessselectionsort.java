import java.io.*;
public class iguessselectionsort
{
    public static void main()throws IOException
    
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no of elements");
        int o=Integer.parseInt(br.readLine());
        int a[]=new int[o];
        System.out.println("enterthe array elemants");
        for(int i=0; i <a.length;i++)
        a[i]= Integer.parseInt(br.readLine());
        for(int i=0;i<a.length;i++)
           { 
                
                for(int z=i;z<a.length;z++)
                {
                    int sm =a[z];
            
                    if(sm>a[z])
                    {
                        sm=a[z];
                        a[i]=sm;
                    }
                    
                }
        }
        for(int i=0;i<a.length;i++)
        System.out.print(" "+a[i]);
            
        
    }
}
            