package com.exam.question1;

public class QuestionOneMain {
    static void main() {
        Employee e1 = new Employee(101,"Vignesh",55000);
        Employee m1 = new Manager(102,"Anoop",65000,5000);
        Employee m2 = new Manager(103,"Naidu",68000,4500);


        e1.display();
        m1.display();
        m2.display();
    }
}
