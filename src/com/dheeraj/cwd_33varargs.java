package com.dheeraj;

public class cwd_33varargs {
    static int sum(int ...arr){
        int result =0;
        for (int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3,4,5,6));
    }
}
