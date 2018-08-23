package com.yzx.codedemo.controller;

import com.yzx.codedemo.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * BaseController
 */
@ControllerAdvice
@RestController
public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler(value = Exception.class)
    public ResultVO<Void> globalExceptionHandle(Exception e) {
        logger.error("发生异常:", e);
        return ResultVO.getFailed("非常抱歉,服务器异常,请联系客服人员。");
    }

}
