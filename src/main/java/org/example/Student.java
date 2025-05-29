package org.example;

public class Student extends Character{
    private int courseYear;

    public Student(String name, String surname, int age, int courseYear) {
        super(name, surname, age);
        this.courseYear = courseYear;
    }

}
