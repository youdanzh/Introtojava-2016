/*  MonthyPayment.java
 Youdan Zhang
 Gloria
 yzhan143
 Your section 1 */
import java.util.Random; 
import java.util.Scanner; 
public class MonthyPayment
{
  public static void main (String [] args)
  { greeting();
    calculator();
  }
  public static void greeting(){ 
    System.out.println("Welcome to monthly payment calculator");
  }
  
  public static void calculator(){
    double r,n,P,M;
    double a,x,y,z,s;
    System.out.print("Enter the amount you borrow: ");
    Scanner scan = new Scanner (System.in);
    P=scan.nextDouble();
    System.out.print(" Enter the months you borrow: ");
    Scanner read= new Scanner (System.in);
    n=read.nextInt();
    if(P<=1000)
    {
      Random gen=new Random();
      z=gen.nextInt(7)+6;
      r=z/100;
      a=r+1;
      x=(Math.pow(a,n));
      M = (P*r*x)/(x-1);
      System.out.print("You monthly payment is: "+M);    
    }
    else if (P>1000){
      Random large=new Random();
      s=large.nextInt(5)+4;
      r=s/100;
      a=r+1;
      x=(Math.pow(a,n));
      M = (P*r*x)/(x-1);
      System.out.printf("You monthly payment is: %.2f ",M);    
    }
  }
}
/*
Welcome to monthly payment calculator
Enter the amount you borrow: 12345
Enter the months you borrow: 12
You monthly payment is: 1315.39 */