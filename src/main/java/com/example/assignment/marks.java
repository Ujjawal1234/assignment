package com.example.assignment;

public class marks
{
    private int physics;
    private int chem;

    public marks() {
    }

    public marks(int physics, int chem) {
        this.physics = physics;
        this.chem = chem;
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
}
