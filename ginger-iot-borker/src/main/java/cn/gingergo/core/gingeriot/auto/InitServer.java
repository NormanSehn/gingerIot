package cn.gingergo.core.gingeriot.auto;


import cn.gingergo.core.gingeriot.bootstrap.BootstrapServer;
import cn.gingergo.core.gingeriot.bootstrap.NettyBootstrapServer;
import cn.gingergo.core.gingeriot.properties.InitBean;

/**
 * 初始化服务
 **/
public class InitServer {

    private InitBean serverBean;

    public InitServer(InitBean serverBean) {
        this.serverBean = serverBean;
    }

    BootstrapServer bootstrapServer;

    public void open(){
        if(serverBean!=null){
            bootstrapServer = new NettyBootstrapServer();
            bootstrapServer.setServerBean(serverBean);
            bootstrapServer.start();
        }
    }


    public void close(){
        if(bootstrapServer!=null){
            bootstrapServer.shutdown();
        }
    }

}
