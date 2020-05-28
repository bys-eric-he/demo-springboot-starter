package com.demo.springboot.starter.config;

import com.demo.springboot.starter.properties.DemoStarterProperties;
import com.demo.springboot.starter.service.DemoStarterService;
import com.demo.springboot.starter.service.impl.DemoStarterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * # @ConditionalOnProperty 注解控制 @Configuration 是否生效。
 * 简单来说也就是我们可以通过在application.properties配置文件中控制 @Configuration 注解的配置类是否生效。
 */
@Configuration
@EnableConfigurationProperties(DemoStarterProperties.class)
@ConditionalOnClass(DemoStarterServiceImpl.class)
@ConditionalOnProperty(
        prefix = "demo.springboot.starter",
        name = "isEnable",
        havingValue = "true"
)
public class DemoStarterAutoConfiguration {

    @Autowired
    private DemoStarterProperties demoStarterProperties;

    @Bean("demoStarterService")
    @ConditionalOnMissingBean(DemoStarterService.class)
    public DemoStarterService demoStarterService() {
        return new DemoStarterServiceImpl(demoStarterProperties.getApplicationName(),
                demoStarterProperties.getDataBaseName(), demoStarterProperties.getUserName(),
                demoStarterProperties.getPassword(), demoStarterProperties.getHost(), demoStarterProperties.getPort());
    }
}
