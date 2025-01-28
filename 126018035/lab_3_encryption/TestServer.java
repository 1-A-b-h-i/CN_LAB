import java.net.*;
import java.io.*;
class TestServer
{
    public static void main(String ar[])
    {
        try
        {
            ServerSocket ss=new ServerSocket(2000);    
            System.out.println("\n Waiting...");
            Socket s=ss.accept();
            System.out.println("\n Connection Established");

            PrintStream pr=new PrintStream(s.getOutputStream());
            String s1="Welcome";
            char c[]=s1.toCharArray();
            for(int i=0;i<c.length;i++)
            {
                c[i]=(char)(c[i]-5);
            }
            String a=new String(c);
            pr.println(a);
            System.out.println("Msg. sent successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}