
public class arrayyy
{
    public static void main()
    {
        
        int m[]={54,11,23,56,78,80};
        int n[]=new int[6];
        int i=0;
        int z = 6;
        
        System.arraycopy(m,i,n,6,0);
        for(i=0;i<=m.length;i++)
        System.out.println("array ="+m[0]);
    }
}
        
        