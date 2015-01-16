package cn.suryani.trainning.controller;

import cn.suryani.trainning.domain.User;
import cn.suryani.trainning.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
@Slf4j
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Inject
    private UserRepository userRepository;

    @RequestMapping(value = "/new/{name}", method = RequestMethod.GET)
    @ResponseBody
    public User newUser(@PathVariable("name") String name) {
        return userRepository.save(User.of(name));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("users/list", "users", userRepository.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findOne(@PathVariable("id") int id) {
        return userRepository.findOne(id);
    }

}
