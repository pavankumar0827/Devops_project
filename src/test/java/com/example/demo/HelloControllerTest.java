package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {

    @Test
    public void testHello() {
        HelloController controller = new HelloController();
        String response = controller.sayHello();
        assertEquals("Hello from Backend Java App on Tomcat!", response);
    }
}
