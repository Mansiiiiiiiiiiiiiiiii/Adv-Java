import java.net.*;

public class LocalIP {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Local IP Address: " + ip.getHostAddress());
    }
}
