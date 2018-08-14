package cn.mayn.com.socketDemo;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("localhost",8888);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.print("**********socket test*********");
            printWriter.flush();
            socket.shutdownOutput();
            //获取输入流
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = null;
            while ((s=bufferedReader.readLine())!=null){
                System.out.println("server:"+s);
            }
            bufferedReader.close();
            inputStreamReader.close();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
