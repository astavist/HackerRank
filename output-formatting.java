package main.java.org.example;

import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                System.out.println("================================");
                for(int i=0;i< 3;i++){
                    String s1=input.next();
                    int x=input.nextInt();
                    int a=15-s1.length();
                    for(int j=0;j< a;j++){
                        s1=s1+' ';
                    }String z=Integer.toString(x);
                    if(z.length()==2)
                    {
                        z='0'+z;
                    }
                    if(z.length()==1)
                    {
                        z="00"+z;
                    }
                    System.out.println(s1+z);
                }
                System.out.println("================================");
            }
}
