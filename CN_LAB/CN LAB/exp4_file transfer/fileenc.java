//this one is in one prog..similarly do in sender and receiver sender la enc and receiver la dec
import java.io.*;
import java.net.*;
class filetrans
{
	public static void main(String arr[])
	{
		String x="";
		try
		{
			File x1=new File("test2.java");
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
			char s[]=x.toCharArray();
			for(int i=0;i<s.length;i++)
			{
				s[i]=(char)(s[i]+3);  
			}

			//encrypt
			String y=new String(s);
			FileOutputStream fout=new FileOutputStream("enc.txt");
			fout.write(y.getBytes());
			System.out.println("the encrypted file is saved in enc.txt");

			//decrypt
			char s1[]=y.toCharArray();
			for(int i=0;i<s1.length;i++)
			{
				s1[i]=(char)(s1[i]-3);  
			}
			String a=new String(s1);
			FileOutputStream fout1=new FileOutputStream("dec.txt");
			fout1.write(a.getBytes());
			System.out.println("the decrypted file is saved in decc.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}