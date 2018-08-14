package cn.mayn.com.socketDemo03;

import cn.mayn.com.socketDemo02.ServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

public class DiscardServer {


    private int port;

    public DiscardServer(int port) {
        this.port = port;
    }

    public void run() {
      try {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //ServerBootstrap 是一个启动NIO服务的辅助启动类
        ServerBootstrap bootstrap = new ServerBootstrap();
        //public ServerBootstrap group(EventLoopGroup parentGroup, EventLoopGroup childGroup)
        //bossGroup用于接收channel，注册之后交给workerGroup处理
        //ChannelInitializer是一个特殊的处理类，他的目的是帮助使用者配置一个新的Channel

        bootstrap.group(bossGroup, workerGroup)
                 .channel(NioServerSocketChannel.class)
                 .childHandler(new ChannelInitializer<SocketChannel>() {
                     @Override
                     protected void initChannel(SocketChannel socketChannel) throws Exception {
                         ChannelPipeline channelPipeline = socketChannel.pipeline();
                         channelPipeline.addLast(new ServerHandler());
                         channelPipeline.addLast(new StringDecoder());
                     }
                 })
                 .option(ChannelOption.SO_BACKLOG,128)
                 .childOption(ChannelOption.SO_KEEPALIVE,true);
            ChannelFuture future = bootstrap.bind(port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new DiscardServer(25171).run();
    }
}
