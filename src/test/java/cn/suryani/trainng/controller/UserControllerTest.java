package cn.suryani.trainng.controller;

import cn.suryani.trainng.SpringTest;
import cn.suryani.trainning.domain.User;
import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
public class UserControllerTest extends SpringTest {

    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void canSave() {
        ResponseEntity<User> entity = restTemplate.getForEntity(localPath() + "/user/new/robin", User.class);
        User user = entity.getBody();
        assertEquals("robin", user.getName());

        entity = restTemplate.getForEntity(localPath() + "/user/" + user.getId(), User.class);
        assertEquals("robin", entity.getBody().getName());
        entity = restTemplate.getForEntity(localPath() + "/user/" + user.getId(), User.class);
        assertEquals("robin", entity.getBody().getName());
    }

}
