package cn.mayn.com.socketDemo02;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("messageInitilzer")
public class MessageInitilzer extends ChannelInitializer<SocketChannel> {

    @Autowired
    ServerHandler serverHandler;

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        try {
            ChannelPipeline channelPipeline = socketChannel.pipeline();
            channelPipeline.addLast("ServerHandler",serverHandler);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
