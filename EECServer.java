import java.io.*;
import java.net.*;

class EECServer {
    public static void main(String args[]) throws Exception {
        // Server listens on port 6666
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();  // Accept a connection from a client
        DataInputStream dis = new DataInputStream(s.getInputStream());

        // Read the message sent by the client
        String str = dis.readUTF();
        System.out.println("Received from client: " + str);

        // Close the input stream and socket
        ss.close();
    }
}
