package com.university;

public class Student {
    /*Leaves and Bank Account details using composition*/
    private String fName;
    private String lName;
    private int studentId;
    private String fatherName;
    private String motherName;
    private String parentOccupation;
    private int classTwelveTotalMarks;
    private int classTenTotalMarks;
    private String programEnrolled;
    private String courseEnrolled;
    private int currentYearOfStudy;
    private int TotalNumberOfyears;
    private int numberOfDaysPresent;
    private static final int totalNumberOfWorkingDays=100;

    public void generateMarksheet(int[] marks)
    {System.out.println("Marksheet generated");
    }
    public void displayAttendancePercentage()
    {
        System.out.println("Attendance Percentage:"+numberOfDaysPresent/totalNumberOfWorkingDays);
    }
    public void applyReval()
    {
        System.out.println("Applied Reval");
    }
    public void enrollForExam()
    {
        System.out.println("Enrolled for Exams");
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getParentOccupation() {
        return parentOccupation;
    }

    public void setParentOccupation(String parentOccupation) {
        this.parentOccupation = parentOccupation;
    }

    public int getClassTwelveTotalMarks() {
        return classTwelveTotalMarks;
    }

    public void setClassTwelveTotalMarks(int classTwelveTotalMarks) {
        this.classTwelveTotalMarks = classTwelveTotalMarks;
    }

    public int getClassTenTotalMarks() {
        return classTenTotalMarks;
    }

    public void setClassTenTotalMarks(int classTenTotalMarks) {
        this.classTenTotalMarks = classTenTotalMarks;
    }

    public String getProgramEnrolled() {
        return programEnrolled;
    }

    public void setProgramEnrolled(String programEnrolled) {
        this.programEnrolled = programEnrolled;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public int getCurrentYearOfStudy() {
        return currentYearOfStudy;
    }

    public void setCurrentYearOfStudy(int currentYearOfStudy) {
        this.currentYearOfStudy = currentYearOfStudy;
    }

    public int getTotalNumberOfyears() {
        return TotalNumberOfyears;
    }

    public void setTotalNumberOfyears(int totalNumberOfyears) {
        TotalNumberOfyears = totalNumberOfyears;
    }

    public int getNumberOfDaysPresent() {
        return numberOfDaysPresent;
    }

    public void setNumberOfDaysPresent(int numberOfDaysPresent) {
        this.numberOfDaysPresent = numberOfDaysPresent;
    }
    public static int totalNumberOfWorkingDays()
    {
        return totalNumberOfWorkingDays;
    }
}
