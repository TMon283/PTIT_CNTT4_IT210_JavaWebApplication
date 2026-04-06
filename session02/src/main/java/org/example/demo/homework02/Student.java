package org.example.demo.homework02;

public class Student {
    private String fullName;
    private int score;

    public Student(String fullName, int score) {
        this.fullName = fullName;
        this.score = score;
    }

    public String getFullName() {
        return fullName;
    }

    public int getScore() {
        return score;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setScore(int score) {
        this.score = score;
    }
}