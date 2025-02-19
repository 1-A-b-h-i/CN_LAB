import java.io.*;
import java.net.*;
class filetrans
{
	public static void main(String arr[])
	{
		String x="";
		try
		{
			File x1=new File("test2.java");//use file in same dir
			if(x1.exists())
			{
				FileInputStream fin=new FileInputStream(x1);
				byte b;
				while((b=(byte)fin.read())!=-1)
				{
					x=x+(char)b;
				}
			}
			else
			{
				System.out.println("file not found");
			}
			FileOutputStream fout=new FileOutputStream("rec.txt");//new txt
			fout.write(x.getBytes());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}