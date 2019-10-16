package cn.gingergo.core.gingeriot.bootstrap;

import cn.gingergo.core.gingeriot.properties.InitBean;


/**
 * 启动类接口
 **/
public interface BootstrapServer {

    void shutdown();

    void setServerBean(InitBean serverBean);

    void start();


}
