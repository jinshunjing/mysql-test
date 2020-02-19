package org.jim.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.jim.sharding")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ShardingTestApp {
    public static void main(String[] args) {
        SpringApplication.run(ShardingTestApp.class);
    }
}
