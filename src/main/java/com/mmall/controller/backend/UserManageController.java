package com.mmall.controller.backend;

import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/manage/user")
public class UserManageController {
    @Resource
    private IUserService iUserService;
}
