package cn.mayn.com.socketDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServiceThread extends Thread{

    Socket socket =null;

    public ServiceThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run(){

        try {
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
        //关闭输出流
        socket.shutdownOutput();
        //关闭流
        printWriter.close();
        outputStream.close();
        bufferedReader.close();
        inputStreamReader.close();
        socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
