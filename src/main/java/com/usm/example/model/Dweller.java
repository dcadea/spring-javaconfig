package com.usm.example.model;

public class Dweller {
    private int dweller;
    private String name;

    public Dweller() {
    }

    public Dweller(final int dweller, final String name) {
        this.dweller = dweller;
        this.name = name;
    }

    public int getDweller() {
        return dweller;
    }

    public void setDweller(final int dweller) {
        this.dweller = dweller;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dweller{" +
                "dweller=" + dweller +
                ", name='" + name + '\'' +
                '}';
    }
}
