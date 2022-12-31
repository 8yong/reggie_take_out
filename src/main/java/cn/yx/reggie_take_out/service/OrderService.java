package cn.yx.reggie_take_out.service;

import cn.yx.reggie_take_out.pojo.Orders;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;

/*
@Auther：Y.
*@Date：2022/12/13  23:54
* 
**/
public interface OrderService extends IService<Orders> {

    //展示
    public Page show(Integer page, Integer pageSize, Long number, Date beginTime, Date endTime);

    //添加


}
