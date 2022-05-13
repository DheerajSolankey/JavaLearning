package com.dheeraj;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone {
    public void ring() {
        System.out.println("ringing...");

    }
    public void vibrate(){
        System.out.println("vibrating...");
    }

    public class cwd_problemoops {
        public static void main(String[] args) {
            Employee harry = new Employee();
            harry.setName("codewithharry");
            harry.salary = 233;
            System.out.println(harry.getSalary());
            System.out.println(harry.getName());
            CellPhone asus =new CellPhone();
            asus.ring();
            asus.vibrate();

        }
    }
}
