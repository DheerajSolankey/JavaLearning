package com.dheeraj;

import java.util.Scanner;

public class cwd_18switch {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("you are to become an adult!");
            case 23 -> System.out.println("you are going to job!");
            case 60 -> System.out.println("get retired");
        }
//        if (age > 56) {
//            System.out.println("you are experienced");
//
//        }
//        else if(age>46){
//            System.out.println("you are semi-experienced");
//
//        }
//        else if(age>36){
//            System.out.println("you are newbie");
//
//        }
//        else{
//            System.out.println("you are not experienced");
//        }
    }
    }