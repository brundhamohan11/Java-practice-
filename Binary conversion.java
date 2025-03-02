Question:Write a Java program for Binary conversion.

  
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String b = Integer.toBinaryString(n);
        int count = 0;
        for (char ch : b.toCharArray()) 
        {
            if (ch == '1') 
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
