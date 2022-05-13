package com.dheeraj;
interface bicycle{
    void applybrakes(int decrease);
    void speedup(int increase);
}
class avoncycle implements bicycle{
   public void applybrakes(int decrease){
        System.out.println("apply brakes");
    }

    public void speedup(int increase){
        System.out.println("apply acceleration");
    }

}
public class cwd_chap11_abstract {
    public static void main(String[] args) {
        avoncycle cycledheeraj=new avoncycle();
        cycledheeraj.applybrakes(3);

    }
}
