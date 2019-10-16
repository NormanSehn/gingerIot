package cn.gingergo.core.gingeriot.bootstrap.Bean;

import io.netty.handler.codec.mqtt.MqttQoS;
import lombok.Builder;
import lombok.Data;

/**
 * 订阅消息
 **/
@Builder
@Data
public class SubMessage {

    private String topic;

    private MqttQoS qos;

}
