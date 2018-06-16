package com.usm.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Student {

    @Value("${first.name}")
    private String firstName;

    @Value("${last.name}")
    private String lastName;

    @Value("${age}")
    private Integer age;

    private Aquarium aquarium;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    @Autowired
    public void setAquarium(final Aquarium aquarium) {
        this.aquarium = aquarium;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", aquarium=" + aquarium +
                '}';
    }
}

