package cn.gingergo.core.gingeriot.auto;

import io.netty.handler.codec.mqtt.MqttQoS;

import java.lang.annotation.*;

/*
 * 消费者配置注解类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MqttMessageListener {

    String[] topic() ;

    MqttQoS qos() default MqttQoS.AT_MOST_ONCE;

}
