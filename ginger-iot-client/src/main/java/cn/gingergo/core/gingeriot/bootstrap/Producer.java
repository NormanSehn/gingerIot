package cn.gingergo.core.gingeriot.bootstrap;

import cn.gingergo.core.gingeriot.auto.MqttListener;
import cn.gingergo.core.gingeriot.bootstrap.Bean.SubMessage;
import cn.gingergo.core.gingeriot.properties.ConnectOptions;
import io.netty.channel.Channel;

import java.util.List;



public interface Producer {

    Channel getChannel();

    Producer connect(ConnectOptions connectOptions);

    void  close();

    void setMqttListener(MqttListener mqttListener);

    void pub(String topic, String message, boolean retained, int qos);

    void pub(String topic, String message);

    void pub(String topic, String message, int qos);

    void pub(String topic, String message, boolean retained);

    void sub(SubMessage... subMessages);

    void unsub(List<String> topics);

    void unsub();

    void disConnect();

}
