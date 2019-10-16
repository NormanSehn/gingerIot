package cn.gingergo.core.gingeriot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

public abstract class BaseController {

    Logger logger = LoggerFactory.getLogger(BaseController.class);;

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleError(HttpServletRequest req, Exception ex) {
        String msg = "Request:" + req.getRequestURL() + " raised " + ex;
        logger.error(msg);
        return ResponseEntity.badRequest().body(msg);
    }
}
