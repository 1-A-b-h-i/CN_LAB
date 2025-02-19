import java.io.*;
import java.net.*;

class TestReceiver {
    public static void main(String arr[]) {
        try {
            DatagramSocket ds = new DatagramSocket(8000);
            byte b[] = new byte[1000];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            System.out.println("Receiver is ready...");
            while (true) {
                ds.receive(dp);
                String msg = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Received Msg: " + msg);
                if (msg.equalsIgnoreCase("exit")) {
                    System.out.println("Receiver is closing...");
                    break;
                }
                String reply = "Hello, message received!";
                DatagramPacket dp1 = new DatagramPacket(reply.getBytes(), reply.length(), dp.getAddress(), dp.getPort());
                ds.send(dp1);
                System.out.println("Reply sent.");
            }
            
            ds.close();        
	} catch (Exception e) {
            System.out.println(e);
        }
    }
}
