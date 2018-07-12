package com.soto.test;

import com.soto.pojo.Category;
import com.soto.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Product p = (Product) context.getBean("p");

        System.out.println(p.getName());

        System.out.println(p.getCategory().getName());

    };
}
