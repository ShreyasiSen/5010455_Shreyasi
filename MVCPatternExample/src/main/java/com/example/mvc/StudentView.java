package com.example.mvc;

public class StudentView {
    public void displayStudentDetails(String studentName, String studentId, String studentGrade) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("STUID: " + studentId);
        System.out.println("Grade: " + studentGrade);
    }
}
