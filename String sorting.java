Question:Write a Java program that takes a string as input and sorts its characters in ascending order.

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sort = new String(ch);
        System.out.println(sort);
    }
}

