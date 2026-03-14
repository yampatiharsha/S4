package com.klef.fsad.exam;

public class Student 
{
    private int studentId;
    private String name;
    private String course;
    private int year;

    // Constructor Injection
    public Student(int studentId, String name) 
    {
        this.studentId = studentId;
        this.name = name;
    }

    // Setter Injection
    public void setCourse(String course) 
    {
        this.course = course;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public void display()
    {
        System.out.println(studentId + " " + name + " " + course + " " + year);
    }
}