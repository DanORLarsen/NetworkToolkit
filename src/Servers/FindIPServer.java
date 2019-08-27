package Servers;

import jdk.nashorn.internal.ir.RuntimeNode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FindIPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ipServer = new ServerSocket(1);
            Socket socket = ipServer.accept();

            //Finds the ip adress, and gives address the value
            String address = InetAddress.getLocalHost().toString();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //Writes the string to the client
            out.writeChars(address);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
