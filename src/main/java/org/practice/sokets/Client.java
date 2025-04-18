package org.practice.sokets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        while(true){
            socket = new Socket(host.getHostName(), 1234);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter message to send: ");
            String message = sc.next();
            sc.close();
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);

            String response = (String) ois.readObject();
            System.out.println("Response: "+response);

        }
    }
}
