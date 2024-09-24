package com.company;

public class methods {

    static void joke(){
        System.out.println("knock knock who is this ????");
    }
    static int mysum(int a , int b){

        int c = a+b;
        return c;

    }
    public static void main(String[] args) {

        joke();
        int d=mysum(7,8);
        System.out.println(+d);
    }
    
}
