package com.dheeraj;
class MYthr extends Thread{
    public MYthr (String name){
        super(name);
    }
    public void run(){
        int i =30;
        System.out.println("thank you");
//        while (true){
//            System.out.println("i am thread");
//        }
    }
}

public class cwd_threadcons {
    public static void main(String[] args) {
        MYthr t1= new MYthr("dheeraj");
        MYthr t2= new MYthr("divi");
        t1.start();
        t2.start();
        System.out.println("the id of thread t is"+ t1.getId());
        System.out.println("the id of thread t is"+ t2.getId());
        System.out.println("the id of thread t is"+ t1.getName());
        System.out.println("the id of thread t is"+ t2.getName());

    }
}
