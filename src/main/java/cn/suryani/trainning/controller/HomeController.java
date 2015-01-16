package cn.suryani.trainning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String helloWorld() {
        return "hello world!";
    }

}
