package cn.suryani.trainng;

import cn.suryani.trainning.Application;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0", "management.port=0"})
public abstract class SpringTest {

    @Value("${local.server.port}")
    private int port;

    protected String localPath() {
        return "http://localhost:" + port;
    }

}
