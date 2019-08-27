package Servers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CurrentIPServer {
    public static void main(String[] args) {
        try {
            ServerSocket currentipServer = new ServerSocket(1);
            Socket socket = currentipServer.accept();

            //Finds the ip adress, and gives address the value
            String address = socket.getInetAddress().getHostAddress();
            //Finds the HostName and gives hostName the value
            String hostName = socket.getInetAddress().getHostName();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //Writes the string to the client
            out.writeChars(address);
            out.writeChars(hostName);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
