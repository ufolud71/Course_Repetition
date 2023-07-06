package com.repetition_fixed.hashmap;

public class Grade {

    private double biology;
    private double history;
    private double physics;
    private double chemistry;
    private double english;

    public Grade(double biology, double history, double physics, double chemistry, double english) {
        this.biology = biology;
        this.history = history;
        this.physics = physics;
        this.chemistry = chemistry;
        this.english = english;
    }

    public double getBiology() {
        return biology;
    }

    public double getHistory() {
        return history;
    }

    public double getPhysics() {
        return physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getEnglish() {
        return english;
    }

    public double getAverage() {
        return (getBiology() + getChemistry() + getPhysics() + getEnglish() + getHistory())/5;
    }
}
