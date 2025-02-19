import java.io.*;
import java.net.*;
class TestSender
{
  public static void main(String arr[])
 {
   try
   {
     DatagramSocket ds=new DatagramSocket(9000);
     String s="Hi kaviya!";
     DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),InetAddress.getByName("192.168.73.126"),8000);
     ds.send(dp);
     System.out.println("Message sent");
     byte b[]=new byte[1000];
     DatagramPacket dp1=new DatagramPacket(b,b.length);
     ds.receive(dp1);
     System.out.println("Received message:"+new String(b,0,500));
   }
   catch(Exception e)
   {
     System.out.println(e);
   }
 }
}