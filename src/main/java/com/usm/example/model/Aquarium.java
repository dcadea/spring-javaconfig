package com.usm.example.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Aquarium {


    private List<Dweller> dwellers;
    private float length;
    private float width;
    private float height;
    private static int q_aquariums = 0;

    public Aquarium() {
    }

    public Aquarium(final float length, final float width, final float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public List<Dweller> getDwellers() {
        return dwellers;
    }

    public void setDwellers(final List<Dweller> dwellers) {
        this.dwellers = dwellers;
    }

    public float getLength() {
        return length;
    }

    public void setLength(final float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(final float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(final float height) {
        this.height = height;
    }

    @PostConstruct
    public void sayHello() {
        System.out.println("Hello from Aquarium ");
    }

    @PreDestroy
    public void sayGoodbye() {
        System.out.println("Goodbye from Aquarium ");
    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "dwellers=" + dwellers +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
