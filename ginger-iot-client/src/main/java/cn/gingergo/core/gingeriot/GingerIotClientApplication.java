package cn.gingergo.core.gingeriot;

import cn.gingergo.core.gingeriot.bootstrap.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GingerIotClientApplication {
    @Autowired
    Producer producer;
    public static void main(String[] args) {
        SpringApplication.run(GingerIotClientApplication.class, args);
    }

}

