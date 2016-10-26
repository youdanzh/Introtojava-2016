import java.util.Scanner;
public class DrawShapes
{
  public static void main (String [] args)
  { 
    
    System.out.println("Welcome to the Drawing Helper!");
    choose();
    choose();
    choose();
  }
  public static void choose()
  { String a;
    System.out.println("\nPick a shape: "+"\nA) square"+ "\nB) right triangle"+"\nC) quit " );
    Scanner scan=new Scanner(System.in);
    a=scan.nextLine();
    
    if(a.equals("A"))
    {
      square();
    }
    else if(a.equals("B"))
    {
      triangle();
    }
    else if(a.equals("C"))
    {
      System.out.println("You quit");
    }
    else
    {System.out.println();}
  }
  
  public static void square()   
  { 
    System.out.print("What size is a side? ");
    int s,i,x,y,z;
    String a =" ";
    Scanner square=new Scanner(System.in);
    s=square.nextInt();
    for(i=0;i<s;i++)
    { System.out.print("*");
    }
    System.out.println();
    for(y=2;y<s;y++)
    { System.out.print("*");
      for(z=2;z<s;z++)
      {System.out.print(a);}
      System.out.print("*");
      System.out.println();
    }
    for(x=0;x<s;x++)
    { System.out.print("*");
    }     
  }
  public static void triangle() 
  { int p,q,i,x,y;
    System.out.print("What is the height of the triangle? ");
    Scanner triangle=new Scanner(System.in);
    p=triangle.nextInt();
    System.out.print("What is the base of the triangle? ");
    Scanner tri=new Scanner(System.in);
    q=tri.nextInt();
    
    
    for(i=1;i<=p;i++){
      if (i==p)
      { for(x=1;x<=q;x++){
        System.out.print("#");}
      }
      
    else if(i!=p)
    {int n=((i*q)/p)+1;
      for(y=1;y<=n;y++)
      {  
        System.out.print("#");
      }
    }
    System.out.println();
  }
}
}

/*Welcome to the Drawing Helper!

Pick a shape: 
A) square
B) right triangle
C) quit 
B
What is the height of the triangle? 6
What is the base of the triangle? 3
#
##
##
###
###
###

Pick a shape: 
A) square
B) right triangle
C) quit 
A
What size is a side? 6
******
*    *
*    *
*    *
*    *
******
Pick a shape: 
A) square
B) right triangle
C) quit 
C
You quit
*/

  