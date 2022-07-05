package com.podzirei.springboottutorialmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootTutorialMasterClassApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());

        //SpringApplication.run(SpringBootTutorialMasterClassApplication.class, args);
    }

}
