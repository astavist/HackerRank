package main.java.org.example;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static List<Character> convertStringToCharList(String S) {
        List<Character> chars = new ArrayList<>();
        for(char ch : S.toCharArray()) {
            chars.add(ch);
        }

        return chars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        List<Character> chars = convertStringToCharList(S);
        for(int i = start;i<end;i++){
            System.out.print(chars.get(i));
        }

    }
}