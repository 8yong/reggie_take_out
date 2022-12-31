package cn.yx.reggie_take_out.contorller;

import cn.yx.reggie_take_out.common.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/*
@Auther：Y.
*@Date：2022/12/13  23:52
* 
**/
@RestController
@RequestMapping("/order")
public class OrderController {

    public R<?> show(Integer page, Integer pageSize, Long number, Date beginTime,Date endTime){

        return null;
    }

}
