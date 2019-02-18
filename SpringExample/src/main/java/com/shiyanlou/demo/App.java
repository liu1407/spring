package com.shiyanlou.demo;

import com.shiyanlou.demo.helloworld.HelloWorld;
import com.shiyanlou.demo.loosely_coupled.OutputHelper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext(new String[]{"Spring-Output.xml"});
        OutputHelper outputHelper = (OutputHelper) context.getBean("OutputHelper");
        outputHelper.generateOutput();
        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}