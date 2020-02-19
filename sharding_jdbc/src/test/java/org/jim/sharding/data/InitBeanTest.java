package org.jim.sharding.data;

import io.shardingsphere.core.yaml.sharding.YamlShardingConfiguration;
import io.shardingsphere.core.yaml.sharding.YamlShardingRuleConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.util.concurrent.ExecutorService;

//@SpringBootTest
@RunWith(SpringRunner.class)
public class InitBeanTest {

    //@Autowired
    private DataSource dataSource;

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
    public void testDataSource() throws Exception {
        YamlShardingConfiguration config = YamlShardingConfiguration.unmarshal(
                ResourceUtils.getFile("classpath:sharding.yml"));
        System.out.println(config.getDataSources());
        //System.out.println(dataSource.toString());
    }

}
