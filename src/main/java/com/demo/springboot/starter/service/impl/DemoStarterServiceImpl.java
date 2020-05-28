package com.demo.springboot.starter.service.impl;

import com.demo.springboot.starter.service.DemoStarterService;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 配置服务
 */
public class DemoStarterServiceImpl implements DemoStarterService {

    private String applicationName = "SpringBoot-Starter-Demo-Application";
    private String dataBaseName = "My-SQL-Starter";
    private String userName = "root";
    private String password = "root";
    private String host = "192.168.0.111";
    private Integer port = 9090;

    private ConcurrentHashMap<String, Object> configurationMap = new ConcurrentHashMap<String, Object>();

    public DemoStarterServiceImpl(String applicationName, String dataBaseName, String userName,
                                  String password, String host, Integer port) {
        this.applicationName = applicationName;
        this.dataBaseName = dataBaseName;
        this.userName = userName;
        this.password = password;
        this.host = host;
        this.port = port;
    }

    @Override
    public String getConfiguration() {
        return String.format("{" +
                "applicationName:%s, " +
                "dataBaseName:%s, " +
                "userName:%s, " +
                "password:%s, " +
                "host:%s, " +
                "port:%s" +
                "}", applicationName, dataBaseName, userName, password, host, port);
    }

    @Override
    public ConcurrentHashMap<String, Object> getConfigurationMap() {

        configurationMap.put("applicationName", this.applicationName);
        configurationMap.put("dataBaseName", this.dataBaseName);
        configurationMap.put("userName", this.userName);
        configurationMap.put("password", this.password);
        configurationMap.put("host", this.host);
        configurationMap.put("port", this.port);
        return configurationMap;
    }
}
