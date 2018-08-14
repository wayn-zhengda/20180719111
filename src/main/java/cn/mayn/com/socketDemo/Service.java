package cn.mayn.com.socketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("------Socket start------");
            Socket socket = serverSocket.accept();
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = null;
            while ((s=bufferedReader.readLine())!=null){
                System.out.println("******"+ s +"******");
            }
            //关闭输入流
            socket.shutdownInput();
            //输入流，响应请求
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("hello");
            printWriter.flush();
            socket.shutdownOutput();

            printWriter.close();
            outputStream.close();
            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
