package com.dheeraj;
class MYthre extends Thread{
    public MYthre (String name){
        super(name);
    }
    public void run(){
        int i =30;

        while (true){
            System.out.println("thank you"+this.getName());
        }
    }
}

public class cwd_threadproity {
    public static void main(String[] args) {
        MYthre t1= new MYthre("dheeraj");
        MYthre t2= new MYthre("divi(most imp)");
        MYthre t3= new MYthre("divi1");
        MYthre t4= new MYthre("divi2");
        MYthre t5= new MYthre("divi3");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
