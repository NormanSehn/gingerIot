package cn.gingergo.core.gingeriot.bootstrap;

import cn.gingergo.core.gingeriot.auto.MqttListener;
import cn.gingergo.core.gingeriot.auto.MqttMessageListener;
import io.netty.handler.codec.mqtt.MqttQoS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@MqttMessageListener(qos = MqttQoS.AT_LEAST_ONCE,topic = {"/collect","/go","/never"})
public class SubListener implements MqttListener {

    @Override
    public void callBack(String topic, String msg) {
        log.info("============================="+topic+msg);
    }



    @Override
    public void callThrowable(Throwable e) {
            log.info("exception",e);
    }
}
