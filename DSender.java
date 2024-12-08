import java.net.*;

public class DSender {
    public static void main(String args[]) throws Exception {
        // Create a DatagramSocket to send the packet
        DatagramSocket ds = new DatagramSocket();
        
        // Message to be sent
        String str = "Welcome, Mansi here";
        
        // Specify the IP address to send the packet to (localhost in this case)
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        
        // Create a DatagramPacket with the message, its length, destination IP, and port
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        
        // Send the DatagramPacket
        ds.send(dp);
        
        // Close the DatagramSocket after sending the packet
        ds.close();
    }
}
