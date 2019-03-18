package org.jim.mycat.data;

import org.jim.mycat.dal.dataobject.TUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

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
    public void testGetById() {
        int id = 1;
        TUser user = userRepository.getById(id);
        System.out.println(user.getName());
    }

    @Test
    public void testListAll() {
        List<TUser> records = userRepository.listAll();
        for (TUser record : records) {
            System.out.println(record.getName());
        }
    }
}
