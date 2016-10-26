/*  OddCraps.java
 Youdan Zhang
 Gloria
 yzhan143
 Your section 1*/
import java.util.Random; 
public class OddCraps
{
  public static void main(String[] args)
  {
    rollagain();
    rollagain();
    rollagain();
  }
  
  public static void rollagain()
  {
    Random gen = new Random();
    int c=gen.nextInt(12)+1;
    
    Random a = new Random();
    int d=a.nextInt(12)+1;
    int i=c+d;
    
     Random num = new Random();
            int p=num.nextInt(12)+1;
            
            Random z = new Random();
            int q=z.nextInt(12)+1;
    
      int n;
      n=p+q;
     System.out.println("You first roll is: "+i);
    if (i==12){
      
      System.out.println("***YOU WIN");
    }
    else if(i==23)
    {  
      System.out.println("***You win.");
    }
    
    else if (i==24||i==2)
    { 
      System.out.println("***You lose.");
    }
    
    else if (i==3)
    {  
      System.out.println("***You lose.");
    }
   
     
      while(n!=i&&n!=12)
      {
         Random nm = new Random();
            int e=nm.nextInt(12)+1;
            
            Random y = new Random();
            int f=y.nextInt(12)+1;
            n=e+f;
        System.out.println("You rolled: "+ n + " roll again");
      }
        if (n==i)
        {
          System.out.println("You rolled: "+ n );
          System.out.println("***You win.");
        }
        else if (n==12)
        {
          System.out.println("You rolled: "+ n );
          System.out.println("***You lose.");
        }
    }
  }
  
/*You first roll is: 18
You rolled: 17 roll again
You rolled: 8 roll again
You rolled: 19 roll again
You rolled: 15 roll again
You rolled: 7 roll again
You rolled: 19 roll again
You rolled: 4 roll again
You rolled: 13 roll again
You rolled: 7 roll again
You rolled: 6 roll again
You rolled: 7 roll again
You rolled: 12 roll again
You rolled: 12
***You lose.
You first roll is: 15
You rolled: 10 roll again
You rolled: 6 roll again
You rolled: 10 roll again
You rolled: 13 roll again
You rolled: 23 roll again
You rolled: 8 roll again
You rolled: 16 roll again
You rolled: 11 roll again
You rolled: 15 roll again
You rolled: 15
***You win.
You first roll is: 18
You rolled: 18
***You win.*/