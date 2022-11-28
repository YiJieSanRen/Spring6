package com.limu.spring.review.test;

import com.limu.spring.review.SpringConfig;
import com.limu.spring.review.domain.Order;
import com.limu.spring.review.domain.User;
import com.limu.spring.review.domain.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    @Test
    public void testConstructor(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        Order order = appContext.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testIoc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vip vipBean = context.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
    }

    @Test
    public void testAnnotationIoc() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
