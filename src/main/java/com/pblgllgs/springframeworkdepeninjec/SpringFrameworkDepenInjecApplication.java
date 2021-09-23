package com.pblgllgs.springframeworkdepeninjec;

import com.pblgllgs.springframeworkdepeninjec.controller.ConstructorInjectedController;
import com.pblgllgs.springframeworkdepeninjec.controller.MyController;
import com.pblgllgs.springframeworkdepeninjec.controller.PropertyInjectedController;
import com.pblgllgs.springframeworkdepeninjec.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkDepenInjecApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringFrameworkDepenInjecApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("-------Primary Bean");

        System.out.println(myController.sayHello());

        System.out.println("-------Property");

        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");


        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------Setter");

        SetterInjectedController setterInjectedController =
                (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------Contructor");

        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

    }

}
