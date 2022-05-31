package com.bhuvan.java;


public class Main {

    public static void main(String[] args) {
        //IF-ELSE IF
        int score = 73;

        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade:" + grade);

        //switch

        switch (grade) {

            case 'A':
                System.out.println("excellent fucker");
                break;
            case 'B':
                System.out.println("very good fucker");
                break;
            case 'C':
                System.out.println("good scoor ");
                break;
            case 'D':
                System.out.println("average");
                break;
            case 'F':
                System.out.println("you are fucked up");
                break;
            default:
                System.out.println("invalid grade");


        }
    }
}
