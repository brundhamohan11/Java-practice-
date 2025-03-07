Question:Write a java program to convert the Uppercase to Lowercase.

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(s.toUpperCase().toLowerCase());
    }
}
