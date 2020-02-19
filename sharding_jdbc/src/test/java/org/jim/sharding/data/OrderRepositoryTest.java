package org.jim.sharding.data;

import org.jim.sharding.dal.dataobject.TOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderRepositoryTest {

    //@Autowired
    private OrderRepository orderRepository;

    @Before
    public void setUp() throws Exception {
        Thread.sleep(2_000L);
        System.out.println("============");
        System.out.println();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println();
        System.out.println("============");
        Thread.sleep(2_000L);
    }

    @Test
    public void testSave() {
        TOrder order = new TOrder();
        order.setOrderTitle("Order 1");
        order.setOrderAmount(1);

        orderRepository.save(order);
    }
}
