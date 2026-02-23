package com.exam.question1;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id,String name,double salary){
        this.id = id;
        this.name =name;
        this.salary=salary;
    }

    public void display(){

        System.out.println("id: " + id + " " + "name: " + name + " " + "salary: " + salary);
    }
}


