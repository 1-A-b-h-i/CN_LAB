import java.io.*;
import java.net.*;
class TestRec
{
    public static void main(String are[])
    {
        try
        {
            DatagramSocket ds=new DatagramSocket(8000);
            byte b[]=new byte[1000];
            DatagramPacket dp=new DatagramPacket(b,b.length);
            ds.receive(dp);
            System.out.println("Received Msg :"+new String(b,0,200));
           
            System.out.println(dp.getAddress().getHostAddress());
            System.out.println(dp.getPort());

           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}