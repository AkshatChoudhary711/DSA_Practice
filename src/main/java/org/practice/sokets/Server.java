package org.practice.sokets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static ServerSocket server = null;
    private static int port = 1234;

    public static void main(String[] args) throws ClassNotFoundException, IOException {
            server = new ServerSocket(port);
            while(true){
                System.out.println("Server is listening...");
                Socket socket = server.accept();
                ObjectInputStream inp = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                String message = (String)inp.readObject();
                System.out.println("Message Received: "+message);
                out.writeObject("Hii Client:"+ message);
                out.close();
                inp.close();
                socket.close();
                if(message == "exit") break;
            }
            System.out.println("Server is stopping...");


    }


}
