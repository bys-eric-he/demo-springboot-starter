package com.demo.springboot.starter.service;

import java.util.concurrent.ConcurrentHashMap;

public interface DemoStarterService {
    String getConfiguration();
    ConcurrentHashMap<String,Object> getConfigurationMap();
}
