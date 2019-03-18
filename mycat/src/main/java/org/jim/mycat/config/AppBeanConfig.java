package org.jim.mycat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Application bean configurations
 *
 * @author Jim
 */
@Configuration
@ImportResource(locations={"classpath:/application-bean.xml"})
public class AppBeanConfig {
}
