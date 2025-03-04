Question:Write a java program swap the character.

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);
        String temp ="#";
        s=s.replace(ch1, temp.charAt(0));
        s=s.replace(ch2, ch1);
        s=s.replace(temp.charAt(0), ch2);
        System.out.println(s);
    }
}
