package cn.gingergo.core.gingeriot.properties;


import cn.gingergo.core.gingeriot.enums.ProtocolEnum;
import cn.gingergo.core.gingeriot.mqtt.MqttHander;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix ="ginger.iot.server")
@Data
public class InitBean {

    private ProtocolEnum protocol;

    private int port ;

    private String serverName ;

    private boolean keepalive ;

    private boolean reuseaddr ;


    private boolean tcpNodelay ;

    private int backlog ;

    private  int  sndbuf ;

    private int revbuf ;


    private int heart ;

    private boolean ssl ;

    private String jksFile;

    private String jksStorePassword;

    private String jksCertificatePassword;

    private Class<MqttHander> mqttHander ;


    private int  initalDelay ;

    private  int period ;

    private int bossThread;

    private int workThread;

}
