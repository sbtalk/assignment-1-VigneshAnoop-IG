package com.exam.question1;

public class Manager extends Employee{
    private double bonus;

    Manager(int id, String name, double salary,double bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void display(){
        System.out.println("manager info: " );
        super.display();
        System.out.println("bonus: " + bonus);
    }
}
