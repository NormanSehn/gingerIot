package cn.gingergo.core.gingeriot.bootstrap.Bean;

import cn.gingergo.core.gingeriot.enums.ConfirmStatus;
import lombok.Builder;
import lombok.Data;

/**
 * 消息
 **/
@Data
@Builder
public class SendMqttMessage {

    private String Topic;

    private byte[] payload;

    private int qos;

    private boolean retained;

    private boolean dup;

    private int messageId;


    private long timestamp;

    private volatile ConfirmStatus confirmStatus;


}
