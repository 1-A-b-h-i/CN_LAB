import java.net.*;//net
import java.io.*;//ip/op
class TestClient
{
    public static void main(String ar[])
    {
        try
        {
            Socket s=new Socket("192.168.73.126",2000);//create new server
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));//buffer reader to read from socket
            String s1=br.readLine();
            System.out.println(s1);
       
            PrintStream pr=new PrintStream(s.getOutputStream());//print stream to get output from socket
            pr.println("Thank u");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}
