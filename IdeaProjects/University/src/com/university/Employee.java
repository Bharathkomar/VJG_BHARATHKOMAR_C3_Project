package com.university;

public class Employee {
    String fname;
    String lname;
    String address;
    /*Previous Employment details and Bank Account details*/
    int yearsOfExp;
    String designation;
    String department;
    /*Leaves*/
    int employeeID;
    int housingRentalAllowance;
    int basicPay;
    int dearnessAllowance;
    int specialAllowance;

    int monthlySalary=basicPay+dearnessAllowance+specialAllowance+housingRentalAllowance;
    int totalCTC=monthlySalary*12;
    public void doITdeclaration()
    {
        System.out.println("IT declaration done");
    }
    public void generatepayslip()
    {
        System.out.println("Basic Pay:"+basicPay+" HRA:"+housingRentalAllowance+" "+"DA:"+dearnessAllowance+" "+"Special Allowance:"+specialAllowance+" "+"TotalSalary"+monthlySalary);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getHousingRentalAllowance() {
        return housingRentalAllowance;
    }

    public void setHousingRentalAllowance(int housingRentalAllowance) {
        this.housingRentalAllowance = housingRentalAllowance;
    }

    public int getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public int getDearnessAllowance() {
        return dearnessAllowance;
    }

    public void setDearnessAllowance(int dearnessAllowance) {
        this.dearnessAllowance = dearnessAllowance;
    }

    public int getSpecialAllowance() {
        return specialAllowance;
    }

    public void setSpecialAllowance(int specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getTotalCTC() {
        return totalCTC;
    }

    public void setTotalCTC(int totalCTC) {
        this.totalCTC = totalCTC;
    }
}
