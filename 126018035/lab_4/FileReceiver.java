import java.io.*;
import java.net.*;

class FileReceiver
{
    public static void main(String are[])
    {
        try
        {
            DatagramSocket ds = new DatagramSocket(4000);
            byte b[]=new byte[1010];
            DatagramPacket dp=new DatagramPacket(b,b.length);
            ds.receive(dp);
            FileOutputStream fout=new FileOutputStream("csbs.txt");
            fout.write(b);
            System.out.println(dp.getAddress().getHostAddress());
            System.out.println(dp.getPort());

           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}