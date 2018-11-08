package cn.mayn.com.socketDemo02;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("clientConfig")
public class ClientConfig {
    @Value("25171")
    private int portNumber;

    @Resource(name = "messageInitilzer")
    protected ChannelInitializer<? extends Channel> channelInitializer;

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public ChannelInitializer<? extends Channel> getChannelInitializer() {
        return channelInitializer;
    }

    public void setChannelInitializer(ChannelInitializer<? extends Channel> channelInitializer) {
        this.channelInitializer = channelInitializer;
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("spring-context.xml");
        ClientConfig clientConfig = (ClientConfig)annotationConfigApplicationContext.getBean("clientConfig");
        System.out.println(clientConfig.getPortNumber());
    }


}
