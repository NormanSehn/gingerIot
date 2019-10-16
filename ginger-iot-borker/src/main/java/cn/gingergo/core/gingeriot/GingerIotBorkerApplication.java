package cn.gingergo.core.gingeriot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"cn.gingergo.core"})
public class GingerIotBorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GingerIotBorkerApplication.class, args);
    }

}

