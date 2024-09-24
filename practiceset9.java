package com.company;

class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length=5;
        this.breadth=6;
    }
    public rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

class cylinder{
    private int radius;
    private int height;
    public cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;

    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
public class practiceset9 {


    public static void main(String[] args) {
        // // problem 1
        // cylinder mycylinder = new cylinder();
        // mycylinder.setHeight(10);
        // mycylinder.setRadius(5);
        // System.out.println(mycylinder.getHeight());
        // System.out.println(mycylinder.getRadius());
        
        // // problem 2
        // System.out.println(mycylinder.surfacearea());
        // System.out.println(mycylinder.volume());

        // // problem 3
        // cylinder mycylinder = new cylinder(5, 10);
        // System.out.println(mycylinder.getHeight());
        // System.out.println(mycylinder.getRadius());
        // System.out.println(mycylinder.surfacearea());
        // System.out.println(mycylinder.volume());

        // problem 4

        // rectangle myrectangle = new rectangle();
        rectangle myrectangle = new rectangle(5,6);
        System.out.println(myrectangle.getBreadth());
        System.out.println(myrectangle.getLength());

    }
    
}
