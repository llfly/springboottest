package com.llfly.test;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.testng.annotations.Test;

import com.llfly.test.Main;

/**
 * Created by fangyou on 2018/1/14.
 */


@SpringApplicationConfiguration(classes = Main.class)
public class MainTest {
    @Test
    public void contextLoads() {

    }
}
