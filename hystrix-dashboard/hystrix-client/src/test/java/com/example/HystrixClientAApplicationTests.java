package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HystrixCircuitBreakerApplication.class)
@WebAppConfiguration
public class HystrixClientAApplicationTests {

 @Test
 public void contextLoads() {
 }

}
