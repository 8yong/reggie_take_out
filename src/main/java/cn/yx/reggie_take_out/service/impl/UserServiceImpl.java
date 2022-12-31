package cn.yx.reggie_take_out.service.impl;

import cn.yx.reggie_take_out.mapper.UserMapper;
import cn.yx.reggie_take_out.pojo.User;
import cn.yx.reggie_take_out.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/*
@Auther：Y.
*@Date：2022/12/31  15:01
* 
**/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public void sendMsg(User user, HttpSession session) {

    }
}
