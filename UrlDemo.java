import java.net.*;

class UrlDemo {
    public static void main(String[] args) {
        try {
            // Create a URL object with the given URL string
            URL u1 = new URL("https://open.spotify.com/album/7hQjYxd9K38amRCUuZpBu0");
            
            // Output the components of the URL
            System.out.println("Protocol: " + u1.getProtocol());
            System.out.println("Host: " + u1.getHost());
            System.out.println("Port: " + u1.getPort());  // -1 if no port is specified
            System.out.println("File: " + u1.getFile());
        } catch (MalformedURLException e) {
            // Handle the case when the URL is malformed
            System.out.println("Invalid URL format: " + e.getMessage());
        }
    }
}
