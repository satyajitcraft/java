package com.company;

import java.util.Scanner;



class subject{
    int subject=100;
    int obtd;
}



public class PracticeSet {

    public static void main(String[] args) {
        subject s1 = new subject();
        System.out.println("enter the marks of maths: ");
            Scanner sc = new Scanner(System.in); 
            s1.obtd=sc.nextInt();
            subject s2= new subject();
            System.out.println("enter the marks of science: ");
            s2.obtd=sc.nextInt();
            subject s3= new subject();
            System.out.println("enter the marks of english: ");
            s3.obtd=sc.nextInt();
            
            int sum=s1.obtd+s2.obtd+s3.obtd;
            float total_pass_percent= (sum/3f);

            if(s1.obtd >=33 && s2.obtd>=33 && s3.obtd>=33 && total_pass_percent>=120){
                System.out.println("congratulations!! you are Passed.");

            }else{
                System.out.println("sorry you have Failed.");
            }
        }
        


        
    }
    

