package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hi yousuf");

        System.out.println("enter a number");

        int A = 100;
        int B = 100;
        System.out.println(A+A);

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a name ");
        String num1 = scan.next();

        System.out.println("enter a sir name ");
        String num2 = scan.next();

System.out.println(num1+num2);


        System.out.println("enter a number to get to know your grade");
        Scanner grade = new Scanner(System.in);

        int a = grade.nextInt();

        if (a >= 100){
            System.out.println("A grade");
        }

        else if (a < 100 && a >= 80){
            System.out.println("it is B grade");
        }



    }




}
