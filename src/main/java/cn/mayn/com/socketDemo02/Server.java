package cn.mayn.com.socketDemo02;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service("server")
public class Server {

    private int port;

    @Autowired
    ClientConfig clientConfig;


    public void startServer(){
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //ServerBootstrap 是一个启动NIO服务的辅助启动类
        ServerBootstrap bootstrap = new ServerBootstrap();
        //public ServerBootstrap group(EventLoopGroup parentGroup, EventLoopGroup childGroup)
        //bossGroup用于接收channel，注册之后交给workerGroup处理
        //ChannelInitializer是一个特殊的处理类，他的目的是帮助使用者配置一个新的Channel
        bootstrap.group(bossGroup,workerGroup)
                 .channel(NioServerSocketChannel.class)
                 .childHandler(clientConfig.getChannelInitializer());

        try {
            ChannelFuture future = bootstrap.bind(clientConfig.getPortNumber()).sync();
            future.channel().close().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        Server server = (Server) applicationContext.getBean("server");
        server.startServer();
    }
}
