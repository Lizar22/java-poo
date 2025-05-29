package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Student harry = new Student("patata", "Potter", 11, 1);
        System.out.println(harry.getName());
        System.out.println(harry.getFilm());
    }

}