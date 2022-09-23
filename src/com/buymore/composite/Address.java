package com.buymore.composite;

public class Address {
    private String area;
    private String city;
    private String State;

    public Address(String area, String city, String state) {
        this.area = area;
        this.city = city;
        State = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
