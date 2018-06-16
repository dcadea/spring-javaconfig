package com.usm.example;

import com.usm.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        final Student student = context.getBean(Student.class);

        System.out.println(student);

        ((AnnotationConfigApplicationContext) context).close();
    }

}
