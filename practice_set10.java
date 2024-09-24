package com.company;

class circle1{
    int radius;
    public circle1(){
        System.out.println("i m a circle constructor.");
    }
    public circle1(int r){
        this.radius = r;
        System.out.println("i m a circle constructor.");

    }
    public double circle_area(){
        return Math.PI*radius*radius;

    }
}
class cylinder1 extends circle1{
    int height;
    public cylinder1(int r, int h){
        super(r);
        System.out.println(" i am a cylinder constructor.");
        this.height = h;

    }
    public double cylinder_surface_area(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
}

public class practice_set10 {

    public static void main(String[] args) {

        // cylinder1 gas = new cylinder1();
        // gas.radius = 10;
        // gas.height = 5;
        // System.out.println(gas.circle_area());
        // System.out.println(gas.cylinder_surface_area());

        cylinder1 gas = new cylinder1(10, 5);
        System.out.println(gas.cylinder_surface_area());
        System.out.println(gas.circle_area());
        
        
    }
    
}
