package com.company;

public  class Person {
    String name;
    double age;
    String address;
    String nationality;

    public Person() {
        this.name = "no name";
        this.age = 000;
        this.address = "no address ";
        this.nationality = " Egyptian";
    }

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, double age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
