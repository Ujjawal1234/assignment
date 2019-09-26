package com.example.assignment;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
    @Id
    private int id;
    private String name;
    private int age;
    private int physics;
    private int chem;

//    private float overall;
    private String div;
    private String college;

    public student(int id, String name, int age, int physics, int chem, String div, String college) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.physics = physics;
        this.chem = chem;
        this.div = div;
        this.college = college;
       // this.overall=(physics+chem)/2;
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

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

//    public float getOverall() {
//        return overall;
//    }
//
//    public void setOverall(float overall) {
//        this.overall = overall;
//    }

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

    public student() {
    }
}
