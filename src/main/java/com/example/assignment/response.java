package com.example.assignment;

import javax.print.event.PrintJobAttributeEvent;

public class response {
    private int id;
    private String name;
    private int age;
    private marks Marks;
    private String div;
    private String college;

    public response() {
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public response(int id, String name, int age, marks marks, String div, String college) {
        this.id = id;
        this.name = name;
        this.age = age;
        Marks = marks;
        this.div = div;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public marks getMarks() {
        return Marks;
    }

    public void setMarks(marks marks) {
        Marks = marks;
    }


}
