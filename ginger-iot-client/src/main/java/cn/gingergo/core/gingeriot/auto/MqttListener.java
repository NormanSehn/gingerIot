package cn.gingergo.core.gingeriot.auto;

/**
 * call scan
 **/
public interface MqttListener{

    void callBack(String topic, String msg);

    void callThrowable(Throwable e);
}
