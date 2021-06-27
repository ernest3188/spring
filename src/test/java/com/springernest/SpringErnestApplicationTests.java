package com.springernest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringErnestApplicationTests {

    @Test
    void contextLoads() {
    }
@Test
    void printBeans(){
    AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringErnestApplication.class);

    System.out.println("[BEANS]");

    for(String beanDefinitionName : context.getBeanDefinitionNames()){
        System.out.println(beanDefinitionName);
    }
    System.out.println("[END OF BEANS]");

}
}
