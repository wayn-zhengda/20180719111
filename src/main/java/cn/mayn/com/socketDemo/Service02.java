package cn.mayn.com.socketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//BIO模型下的Socket通信
public class Service02 {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("------Socket start------");
            while (true){
                Socket socket = serverSocket.accept();
                ServiceThread serviceThread = new ServiceThread(socket);
                serviceThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
