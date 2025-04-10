//substring,starts ends with...
import java.util.Scanner;
class ss
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
String s=sc.nextLine();
System.out.println("Enter a number for substring starts from its length: "+(s.length()));
int n=sc.nextInt();
String s1=s.substring(n);
System.out.println(s1);
System.out.println("Enter an break from length: "+(s.length()));
int a=sc.nextInt();
int b=sc.nextInt();
String s2=s.substring(a,b);
System.out.println("Substring in given code is:");
System.out.println(s2);
}
}
