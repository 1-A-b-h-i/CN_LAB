import java.net.*;
import java.io.*;
class decGui
{
    public static void main(String ar[])
    {
        try
        {
            Socket s=new Socket("localhost",8000);
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s1=br.readLine();
            System.out.println("\n Received msg. "+s1);
            char c[]=s1.toCharArray();
            for(int i=0;i<c.length;i++)
            {
                c[i]=(char)(c[i]-5);
            }
            String a=new String(c);
            System.out.println("\n After Decrypt :"+a);

           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}