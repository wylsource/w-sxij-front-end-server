package com.lywu.sxij.controller;

import com.lywu.sxij.entity.User;
import com.lywu.sxij.result.Result;
import com.lywu.sxij.utils.ResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: WuYL
 * @Description: 登录模块的控制器
 * @Date: Create in 2018/2/4 13:22
 * @Modified By:
 */
@RestController
@RequestMapping("/authen")
public class LoginController {

//    @RequestMapping("/login")
//    public Result prelogin(HttpServletResponse response
//    ) {
////        System.out.println(users.getUserAccount() + "--" + users.getUserPassword());
//        User user = new User();
//        response.addHeader("Access-Control-Allow-Origin", "*");
//        return ResultUtil.success(user);
//    }
//    @GetMapping()
    @GetMapping("/zuul")
    public Result testZuul(){
        return ResultUtil.success("zuul 转发成功");
    }

    @GetMapping("/info/{token}")
    public Result getUserInfo(@PathVariable("token") String token) {
        User user = new User();
        user.setUserAccount("admin");
        user.setUserPassword("admin");
        user.setUserAvatar("user_images/武玉龙.png");
        user.setUserName("管理员");
        System.out.println("token --- " + token);
        return ResultUtil.success(user);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User users, HttpServletResponse response
    ) {
        System.out.println(users.getUserAccount() + "--" + users.getUserPassword());
        User user = new User();
        String token = UUID.randomUUID().toString();
        return ResultUtil.success(token);
    }
}
