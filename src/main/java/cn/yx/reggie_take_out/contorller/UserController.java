package cn.yx.reggie_take_out.contorller;

import cn.yx.reggie_take_out.common.R;
import cn.yx.reggie_take_out.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@Auther：Y.
*@Date：2022/12/31  15:29
* 
**/
@RestController
@RequestMapping("/user")
public class UserController {

    //发送手机验证码
    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user){

        return null;
    }

}
