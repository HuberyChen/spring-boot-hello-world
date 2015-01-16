package cn.suryani.trainning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
@ComponentScan(basePackageClasses = Application.class)
@EnableAutoConfiguration
public class Application {

    public static final void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
