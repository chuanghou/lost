package com.example.lost;


import com.example.lost.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AjcTest {

    @Autowired
    TestController testController;

    @Test
    public void testController() {
        testController.test();
    }

}
