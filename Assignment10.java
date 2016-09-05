import java.util.Scanner;
class Prime
{
 String result;
 public void prime(int x)
 {
  int b,c=0;
  for(int a=1;a<=x;a++)
   {
    b=x%a;
    if (b==0)
    c=c+1;
   }
   if (c==2)
   result = "no. is prime";
   else
   result = "no. is not prime";
 } 
 public String toString()
 {
  return result;
 } 
}


public class Assignment10
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("Enter a no.:");
   int n = s.nextInt();
   Prime a = new Prime();
   a.prime(n);
   System.out.println(a);
  }
}


