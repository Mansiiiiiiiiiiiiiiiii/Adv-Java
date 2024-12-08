import java.io.*;
import java.net.*;

class EECclient {
    public static void main(String args[]) {
        try {
            // Connect to the server on localhost and port 6666
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hi");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
