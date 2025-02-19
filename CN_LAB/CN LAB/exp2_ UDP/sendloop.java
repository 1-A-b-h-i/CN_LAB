import java.io.*;
import java.net.*;
import java.util.Scanner;

class TestSender {
    public static void main(String arr[]) {
        try {
            DatagramSocket ds = new DatagramSocket(9000);
            Scanner sc = new Scanner(System.in);
            String s;
            System.out.println("Sender is ready... Type 'exit' to stop.");
            while (true) {
                System.out.print("Enter message to send: ");
                s = sc.nextLine();
                DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(),InetAddress.getByName("172.22.32.213"), 8000);
                ds.send(dp);
                System.out.println("Message sent.");
                if (s.equalsIgnoreCase("exit")) {
                    System.out.println("Sender is closing...");
                    break;
                }
                byte b[] = new byte[1000];
                DatagramPacket dp1 = new DatagramPacket(b, b.length);
                ds.receive(dp1);
                String receivedReply = new String(dp1.getData(), 0, dp1.getLength());
                System.out.println("Received message: " + receivedReply);
            }

            ds.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
