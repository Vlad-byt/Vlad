import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 12580);
        ServerSocket listener = new ServerSocket(12580);
        Socket client = listener.accept();
        
        OutputStream output = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(output);
        
        bufferedOutputStream.write("Hello");
        bufferedOutputStream.close();
        socket.close();
    }
}

