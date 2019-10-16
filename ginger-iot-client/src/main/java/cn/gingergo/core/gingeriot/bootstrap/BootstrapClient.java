package cn.gingergo.core.gingeriot.bootstrap;


import io.netty.channel.Channel;

/**
 * 启动类接口
 **/
public interface BootstrapClient {


    void shutdown();

    void initEventPool();

    Channel start();


}
