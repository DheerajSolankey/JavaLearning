package com.dheeraj;
class Circle{
   public int radius;
   Circle(){
       System.out.println("i am non para construtor");
   }

   Circle(int r){
       this.radius=r;
       System.out.println("this is circle constructor");
   }
   public double area(){
       return Math.PI*this.radius*this.radius;
   }

}
class Cylinder extends Circle{
    public int height;

    Cylinder(int r,int h){
        super(r);
        this.height=h;
        System.out.println("this is cylinder constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwd_exercise {
    public static void main(String[] args) {
//        Circle obj= new Circle(12);
//        Cylinder obj1=new Cylinder(12 ,4);
        Circle obj2=new Cylinder(12 ,4);


    }
}
