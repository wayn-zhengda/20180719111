package cn.mayn.com.socketDemo02;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.stereotype.Service;

@Service("serverHandler")
@ChannelHandler.Sharable
public class ServerHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
//                Byte bytes = 21;
                 System.out.println("已接收数据");
                 ctx.write(msg);
                 ctx.flush();
//                 ctx.writeAndFlush(msg);


            //           ctx.writeAndFlush(msg);
           System.out.println("已返回数据");
       }finally {
//           ReferenceCountUtil.release(msg);
       }

    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
