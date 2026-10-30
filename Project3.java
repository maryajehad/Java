
package project3;

 import java.util.Scanner;
public class Project3 {

   
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num=s.nextDouble();
        
        System.out.println("----------------------------------");
        System.out.println("1- Convert from CM to Inche");
        System.out.println("2- Convert from Inche to CM");
        System.out.println("3- Convert from M to Feet");
        System.out.println("4- Convert from Feet to M");
        System.out.println("5- Convert from Dunm to Hiktar");
        System.out.println("6- Convert from Hiktar to Dunm");
        System.out.println("7- Convert from Cels to Fenh");
        System.out.println("8- Convert from Fenh to Cels");
        System.out.println("----------------------------------");
        
        
        System.out.println("Enter your choice: ");
        int ch=s.nextInt();
        double result=0;
            
        
        switch (ch) {
            case 1:result= num/2.54;break;
            case 2:result=num*2.54;break;
            case 3:result=num*3.28084;break;
            case 4:result=num/3.28084;break;
            case 5:result=num/10;break;
            case 6:result=num*10;break;
            case 7:result=(num*9.0/5.0)+32;break;
            case 8:result=(num-32)*5.0/9.0;break;
            default:result:System.out.println("Invalid choice");break;
        }
        System.out.println("Result = "+result);
            
            
            
            
            
            
            
            
            
            
        }



    }