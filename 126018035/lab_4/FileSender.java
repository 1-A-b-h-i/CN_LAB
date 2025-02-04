import java.io.*;
import java.net.*;

class FileSender
{
    public static void main(String are[])
    {
        String s="";
        try
        {
            File x1=new File("Test2.java");
            
            if(x1.exists()){
                FileInputStream fin=new FileInputStream(x1);    
                byte b;
                while((b=(byte)fin.read())!=-1)
                {
                    s=s+(char)b;
                }
            }
            else{
                System.out.println("File not found");
            }
            DatagramSocket ds = new DatagramSocket(3000);
            
            DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),InetAddress.getByName("192.168.73.124"),4000);;
            ds.send(dp);
            System.out.println("Message sent..");
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}