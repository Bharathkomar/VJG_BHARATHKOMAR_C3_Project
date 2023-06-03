package com.university;

public  class University {
    private String univName;
    public static String[] coursesOffered = {"Information Technology", "Mechanical", "Electrical,Communication and Electronics","Chemical","Marine","BioTech","Aeronautical","Aerospace","Mechatronics","ComputerScience"};
    static final String univCode = "SVCE001";
    private int numberOfCurrentStudents = 800;
    private int totalNumberOfStudentsStudied;
    private int numberOfStudentsPassedOut;
    private int numberOfEmployees;

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public static String[] getCoursesOffered() {
        return coursesOffered;
    }

    public static void setCoursesOffered(String[] coursesOffered) {
        University.coursesOffered = coursesOffered;
    }

    public int getNumberOfCurrentStudents() {
        return numberOfCurrentStudents;
    }

    public void setNumberOfCurrentStudents(int numberOfCurrentStudents) {
        this.numberOfCurrentStudents = numberOfCurrentStudents;
    }

    public int getTotalNumberOfStudentsStudied() {
        return totalNumberOfStudentsStudied;
    }

    public void setTotalNumberOfStudentsStudied(int totalNumberOfStudentsStudied) {
        this.totalNumberOfStudentsStudied = totalNumberOfStudentsStudied;
    }

    public int getNumberOfStudentsPassedOut() {
        return numberOfStudentsPassedOut;
    }

    public void setNumberOfStudentsPassedOut(int numberOfStudentsPassedOut) {
        this.numberOfStudentsPassedOut = numberOfStudentsPassedOut;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}

