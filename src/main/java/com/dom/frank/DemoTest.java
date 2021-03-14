package com.dom.frank;

import com.dom.frank.loadConfig.LoadConfig;

import java.util.Properties;

public class DemoTest {

    public static void main(String[] args) {
//        String path = "D:\\Code\\CODE_DOM\\src\\main\\resources\\test.loadconfig.properties";
//        Properties properties = new LoadConfig().getConfigProperties(path);
        Properties properties = new LoadConfig().getConfigProperties();




        String value = properties.getProperty("dom.frank.username");
        System.out.println(value);
        System.out.println(properties.getProperty("dom.frank.password"));
        System.out.println(properties.getProperty("dom.frank.phoneNumber"));
        System.out.println(properties.getProperty("dom.frank.address"));
        System.out.println(properties.getProperty("dom.frank.dream"));
    }
}

