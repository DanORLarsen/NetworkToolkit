package Servers;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class PortScanner {
    public ArrayList<Integer> openPorts(String ip, int fromPort, int toPort){
        ArrayList arrayList = new ArrayList();
        for (int i = fromPort; i <toPort ; i++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(ip,i),50);
                socket.close();
                arrayList.add(i);
            } catch (IOException e) {
            }
        }
        return arrayList;
    }
}
