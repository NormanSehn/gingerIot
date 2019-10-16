package cn.gingergo.core.gingeriot.rest;

import cn.gingergo.core.gingeriot.bootstrap.MqttProducer;
import cn.gingergo.core.web.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping("/sub")
public class SubController extends BaseController{


    Logger logger = LoggerFactory.getLogger(SubController.class);;

    @RequestMapping(value = "/banItem",
            method = {RequestMethod.GET, RequestMethod.POST},
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity banItem(@RequestParam String  item) throws Exception {
        try {
            MqttProducer mqttProducer = new MqttProducer();
            mqttProducer.pub("/go","test go");
            ResponseModel<String> rm = ResponseModel.<String>builder().success(true).result("").build();
            return ResponseEntity.ok(rm);
        } catch (Exception e) {
            logger.error("ban item error", e);
            ResponseModel<String> rm = ResponseModel.<String>builder().success(false).result("").build();
            return ResponseEntity.ok(rm);
        }

    }

}
