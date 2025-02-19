import java.io.*;
import java.net.*;
class TestReceiver
{
	public static void main(String arr[])
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(8000);
        		byte b[]=new byte[1000];
            		DatagramPacket dp=new DatagramPacket(b,b.length);
            		ds.receive(dp);
            		System.out.println("Received Msg :"+new String(b,0,200));
           		String s="hello";
            		System.out.println(dp.getAddress().getHostAddress());
            		System.out.println(dp.getPort());
			DatagramPacket dp1=new DatagramPacket(s.getBytes(),s.length(),InetAddress.getByName("192.168.73.127"),9000);
           		ds.send(dp1);
			System.out.println("sent..");
        	}
        	catch(Exception e)
        	{
            		System.out.println(e);
       		}
    	}
}