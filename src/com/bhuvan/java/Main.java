package com.bhuvan.java;


public class Main {

    public static void main(String[] args) {
        //IF-ELSE IF
<<<<<<< HEAD
        int score = 73;
=======
        int score = 93;
>>>>>>> 59e21ba (don-for-today)

        char grade;

        if (score >= 90) {
            grade = 'A';
<<<<<<< HEAD
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
=======
        } else if (score >=80) {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        } else if (score >=60) {
            grade = 'D';
        } else if (score >=50)  {
			grade ='E';
			
		}		else {
>>>>>>> 59e21ba (don-for-today)
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
<<<<<<< HEAD
=======
            case 'E':
                System.out.println("below average");
                break;
>>>>>>> 59e21ba (don-for-today)
            case 'F':
                System.out.println("you are fucked up");
                break;
            default:
                System.out.println("invalid grade");


        }
    }
}
