import java.io.*;
import java.net.*;
class TestSender
{
	public static void main(String arr[])
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(3000);
			String s="hi panniii";
			DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),InetAddress.getByName("192.168.73.125"),4000);
			ds.send(dp);
			System.out.println("Message sent");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}