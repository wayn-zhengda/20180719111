package cn.mayn.com.socketDemo02;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;


public class ClientConfig {
    private int bossThreadCount;

    private int workerThreadCount;


    private int portNumber;

    public int getBossThreadCount() {
        return bossThreadCount;
    }

    public void setBossThreadCount(int bossThreadCount) {
        this.bossThreadCount = bossThreadCount;
    }

    public int getWorkerThreadCount() {
        return workerThreadCount;
    }

    public void setWorkerThreadCount(int workerThreadCount) {
        this.workerThreadCount = workerThreadCount;
    }

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


    protected ChannelInitializer<? extends Channel> channelInitializer;


}
