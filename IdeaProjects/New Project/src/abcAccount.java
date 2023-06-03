import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class abcAccount {
    // package org.example;
    public static void main(String[] args) {
        AbcAccount vishalAccount =  new AbcAccount(123, 0, "Vishal", 123456789, "BJTPB8816Q", "Chennai", 600094, "India", 'M', true);
        AbcAccount myFriendAccount = new AbcAccount(456, 0, "Bharath", 3456789, "ASDRET23Q", "Mumbai", 500097, "India", 'M', false);
        System.out.println(vishalAccount);
        vishalAccount.deposit(1000);
        System.out.println(vishalAccount);
        System.out.println(myFriendAccount);
        myFriendAccount.deposit(890);
        myFriendAccount.withdrawal(540);
        System.out.println(myFriendAccount);
        myFriendAccount.add = "Mumbai";
        System.out.println(myFriendAccount);
    }

    public class AbcAccount {
        long accNo;
        double balance;
        String name;
        long aadharNumber;
        String panNo;
        String add;
        int pincode;
        String country;
        char gender;
        boolean isMarried;

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdrawal(double amount) {
            balance = balance - amount;
        }

        public void applyDebitCard() {
            System.out.println("Debit card applied");
        }

        public AbcAccount(long accNo, double balance, String name, long aadharNumber, String panNo, String add, int pincode, String country, char gender, boolean isMarried) {
            this.accNo = accNo;
            this.balance = balance;
            this.name = name;
            this.aadharNumber = aadharNumber;
            this.panNo = panNo;
            this.add = add;
            this.pincode = pincode;
            this.country = country;
            this.gender = gender;
            this.isMarried = isMarried;
        }

        @Override
        public String toString()
        {
            return "AbcAccount{" + "accNo=" + accNo + ", balance=" + balance + ", name='" + name + '\'' + ", aadharNumber=" + aadharNumber + ", panNo='" + panNo + '\'' + ", add='" + add + '\'' + ", pincode=" + pincode + ", country='" + country + '\'' + ", gender=" + gender + ", isMarried=" + isMarried + '}';
        }
    }
}
