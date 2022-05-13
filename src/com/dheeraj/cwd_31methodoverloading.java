package com.dheeraj;

public class cwd_31methodoverloading {
    static void change(int a){
        a=98;
    }
    static void change2(int[]arr){
        arr[0]=98;
    }
    static void tellJoke(){
        System.out.println("i am a joke");
    }
    public static void main(String[] args) {
        // tellJoke();
        int marks []={45, 56 ,67 ,78, 88};
        change2(marks);
        System.out.println("print"+marks[0]);



    }
}
