package org.jim.sharding.data;

import org.jim.sharding.dal.dao.TOrderMapper;
import org.jim.sharding.dal.dataobject.TOrder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class OrderRepository {

    //@Resource
    private TOrderMapper orderMapper;

    public void save(TOrder order) {
        orderMapper.insertSelective(order);
    }

}
