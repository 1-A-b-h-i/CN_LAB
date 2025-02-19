import java.net.*;
import java.io.*;
class encrypt
{
	public static void main(String arr[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(8000);
			System.out.println("\nWaiting...");
			Socket s=ss.accept();
			System.out.println("\nConnection established");
			PrintStream pr=new PrintStream(s.getOutputStream());
			String s1="Hello";
			char c[]=s1.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				c[i]=(char)(c[i]+7);
			}
			String a=new String(c);
			pr.println(a);
			System.out.println("msg sent");
        	}
       		catch(Exception e)
        	{
            		System.out.println(e);
        	}
       
    	}
}
