package com.demo.springboot.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置信息
 * 在引入该Starter的application.properties配置文件中定义属性
 */
@ConfigurationProperties(prefix = "demo.springboot.starter")
public class DemoStarterProperties {
    private String applicationName;
    private String dataBaseName;
    private String userName;
    private String password;
    private String host;
    private Integer port;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
