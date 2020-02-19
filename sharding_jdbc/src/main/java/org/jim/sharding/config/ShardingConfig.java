package org.jim.sharding.config;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import io.shardingsphere.core.keygen.KeyGenerator;
import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@Configuration
public class ShardingConfig {
    @Value("${server.port:8661}")
    private long workerId;

    @Bean
    public KeyGenerator keyGenerator() {
        DefaultKeyGenerator.setWorkerId(workerId & 1023);
        return new DefaultKeyGenerator();
    }

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        DataSource dataSource = YamlShardingDataSourceFactory.createDataSource(
                ResourceUtils.getFile("classpath:sharding.yml"));
        return dataSource;
    }

//    @Bean
//    public SqlSessionFactoryBean sqlBizSessionFactory() throws IOException, SQLException {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        Resource[] resources = new Resource[]{new ClassPathResource("org/jim/sharding/dal/mapper/TOrderMapper.xml")};
//        sqlSessionFactoryBean.setMapperLocations(resources);
//        return sqlSessionFactoryBean;
//    }

//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = sqlBizSessionFactory();
//
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("org.jim.sharding.dal;org.jim.sharding.dal.mapper;org.jim.sharding.data.mapper");
//        //mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlBizSessionFactory");
//        mapperScannerConfigurer.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
//        return mapperScannerConfigurer;
//    }

}
