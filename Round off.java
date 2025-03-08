Question:Write a java program for round off the floating number.

import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        long r=Math.round(n);
        System.out.println(r);
    }
}
