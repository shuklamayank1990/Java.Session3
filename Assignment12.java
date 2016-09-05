import java.util.Scanner;
import java.lang.Math.*;
class Operation
{
 int b;
 public void opt(int x,int y, String z)
 {
  switch(z)
  {
  case "+" : b = x+y;
  break;
  case "-" : b = x-y;
  break;
  case "*" : b = x*y;
  break;
  case "/" : b = x/y;
  break;
  }
 } 
 public String toString()
 {
  return String.valueOf(b);
 } 
}


public class Assignment12
{
  public static void main(String args[])
  {
   Scanner x=new Scanner(System.in);
   Scanner y=new Scanner(System.in);
   Scanner z=new Scanner(System.in);
   System.out.print("Enter 1st no.:");
   int first = x.nextInt();
   System.out.print("Enter 2nd no.:");
   int second = y.nextInt();
   System.out.print("Enter any one operation (+,-,*,/):");
   String op = z.next(); 
   Operation a = new Operation();
   a.opt(first,second,op);
   System.out.println("Result is : "+a);
  }
}