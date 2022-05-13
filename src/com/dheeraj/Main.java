package com.dheeraj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your marks1");
        int mark1 = sc.nextInt();
        System.out.println("input your marks2");
        int mark2 = sc.nextInt();
        System.out.println("input your marks3");
        int mark3 = sc.nextInt();
        System.out.println("input your marks4");
        int mark4 = sc.nextInt();
        System.out.println("input your marks5");
        int mark5 = sc.nextInt();
        int sum = mark1 + mark2 + mark3 + mark4 + mark5  ;
        int percentage =sum*100/500;
        System.out.println(sum);
        System.out.println(percentage);



        System.out.println();


    }
}
