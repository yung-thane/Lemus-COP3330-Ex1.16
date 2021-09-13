/*
 *  UCF COP3330 Fall 2021 Assignment 1.16 Solution
 *  Copyright 2021 Ronald Lemus
 */

import java.util.Scanner;

public class Legal_Driving_Age {
    public static void main(String [] arg){
        System.out.print("What is your age? ");
        Scanner ageInp = new Scanner(System.in);
        int age = ageInp.nextInt();
        int legalAge = 16;
        String result = (age >= legalAge)
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        System.out.println(result);

    }
}
