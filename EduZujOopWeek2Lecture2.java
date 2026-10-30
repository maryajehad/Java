/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.zuj.oop.week2.lecture2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class EduZujOopWeek2Lecture2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1=s.nextInt();
        System.out.print("Enter n2: ");
        int n2=s.nextInt();
        System.out.print("Enter n3: ");
        int n3=s.nextInt();
        int sum=n1+n2+n3;
        System.out.println
        ("Result="+sum);
        
        int avg=sum/3;
        System.out.println("avg="+avg);
        // TODO code application logic here
    }
    
}
