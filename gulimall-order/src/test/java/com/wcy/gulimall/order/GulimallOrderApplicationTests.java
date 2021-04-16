package com.wcy.gulimall.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wcy.gulimall.order.entity.OrderSettingEntity;
import com.wcy.gulimall.order.service.OrderSettingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    OrderSettingService orderSettingService;

    @Test
    void contextLoads() {
        OrderSettingEntity orderSettingEntity = new OrderSettingEntity();
        orderSettingEntity.setFlashOrderOvertime(2000);
        orderSettingEntity.setId(1L);
        /* *orderSettingService.save(orderSettingEntity);
        orderSettingService.updateById(orderSettingEntity);*/
        List<OrderSettingEntity> list =orderSettingService.list(new QueryWrapper<OrderSettingEntity>().eq("id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("保存成功");
    }

}
