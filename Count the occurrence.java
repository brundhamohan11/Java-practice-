Write a Java Program to Count and Display the Frequency of Each Element in an Array.

import java.util.*;
public class Main
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int ar[]=new int[a];
     int f[]=new int[100];
     for(int i=0;i<a;i++)
      {  
         ar[i]=sc.nextInt();
         f[ar[i]]++;
       }
     for(int i=0;i<a;i++)
      { 
        if(f[ar[i]]>0)
          {
           System.out.println(ar[i] +" occurs "  +f[ar[i]] + " times ");
           f[ar[i]]=0;
          }
       }
    }
}

