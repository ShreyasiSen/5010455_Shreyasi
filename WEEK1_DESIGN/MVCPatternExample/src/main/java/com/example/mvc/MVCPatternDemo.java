package com.example.mvc;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to control the model and view
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Chayan Ghosh");
        controller.setStudentGrade("A+");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Rupam Chatterjee");
        student.setId("125");
        student.setGrade("B+");
        return student;
    }
}
