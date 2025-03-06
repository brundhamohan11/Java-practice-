Question:Write a Java program to find the XOR  of all input numbers 


import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++)
        {
            result ^= sc.nextInt();
        }
        System.out.println(result);
    }
}
