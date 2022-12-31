package cn.yx.reggie_take_out.service.impl;

import cn.yx.reggie_take_out.mapper.OrderMapper;
import cn.yx.reggie_take_out.pojo.Orders;
import cn.yx.reggie_take_out.service.OrderService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Date;

/*
@Auther：Y.
*@Date：2022/12/13  23:54
* 
**/
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Orders> implements OrderService {
    @Override
    public Page show(Integer page, Integer pageSize, Long number, Date beginTime, Date endTime) {
        Page<Object> objectPage = new Page<>();
        return null;
    }
}
