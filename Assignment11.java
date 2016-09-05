import java.util.Scanner;
import java.lang.Math.*;
class RandomNo
{
 int b;
 public void random1(int x)
 {
  b=(int)(Math.random()*x);
 
 } 
 public String toString()
 {
  return  String.valueOf(b);
 } 
}


public class Assignment11
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("Enter a no.:");
   int n = s.nextInt();
   RandomNo a = new RandomNo();
   a.random1(n);
   System.out.println(a);
  }
}