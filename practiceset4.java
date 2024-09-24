package com.company;

import java.util.Scanner;


public class practiceset4 {

    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur marks in physics :");
        m1 = sc.nextInt();
        System.out.println("enter ur marks in chemistry :");
        m2 = sc.nextInt();
        System.out.println("enter ur marks in mathematics :");
        m3 = sc.nextInt();

        float percentage = (m1+m2+m3)/3.0f;
        System.out.println("Your total percentage is: " +percentage);
        
        if (percentage>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("congrtas !! you are passed.");
            
        } else{
            System.out.println("sorry you have failed.");
        }

        
    }
    
}
