package com.company;

class A{
    int a;
    public int satyajit(){
        return 1;
    }
    public void meth1(){
        System.out.println("I am a method 1 of class A .");
    }
    public void meth2(){
        System.out.println("I am method 2 of class A.");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B.");
    }
    public void meth3(){
        System.out.println("I am a method 3 of class B.");
    }
}
public class methodoverriding {

    public static void main(String[] args) {

        // A satya = new A();
        // satya.meth1();
        B pikun = new B();
        pikun.meth2();
        
    }
    
}
