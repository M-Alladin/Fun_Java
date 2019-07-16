import java.io.*;
public class exam_marks
{   
    public static void main ()throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println ("enter marks");
        float m = Float.parseFloat(br.readLine());
        if (m>80)
        System.out.println("distinction");
        else if (m>60)
        System.out.println("first division");
        else if (m>45)
        System.out.println("second division");
        else if (m>40)
        System.out.println("pass");
        else
        System.out.print("fail");
    }
}
        
