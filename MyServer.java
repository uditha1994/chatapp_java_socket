import java.io.IOException;
import java.net.ServerSocket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server Started... on port 8000");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}