package com.bigd.java.algo;

import java.util.*;
import java.util.Arrays;

public class Ch1ArraysNStrings {

//    Implement an algorithm to determine if a string has all unique characters. What if
//you can not use additional data structures?
//
    public static boolean isUniqueChars(String str){
        //to hold uniCodes, only if str has ascii chars
        boolean[] charSet = new boolean[256];
        for(int i=0; i<str.length(); i++){
            //returns unicode
            int val = str.charAt(i);
            if(charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

//Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
//five characters, including the null character.)
//    The only “gotcha” is to try to do it in place, and to be care-
//ful for the null character.
    public static void reverseString(String str){


    }

//    Design an algorithm and write code to remove the duplicate characters in a string
//without using any additional buffer. NOTE: One or two additional variables are fine.
//An extra copy of the array is not.
    public static String removeDuplicates(String str){
        System.out.println("Before --> " + str);
        if(str == null) return str;
        int len = str.length();
        if(len<2) return str;

        char[] str1 = str.toCharArray();

        int tail = 1;
//abcadbc
        for(int i=1; i<len; ++i){
            int j;
            for(j=0; j<tail; ++j){
//                System.out.println(tail);
//                System.out.println("tail");
//                System.out.println(i);
//                System.out.println(str1[i]);
//                System.out.println(j);
//                System.out.println(str1[j]);
//                System.out.println("------");
                if(str1[i] == str1[j]) {
                    break;
                }
            }

            if(j == tail){

                str1[tail] = str1[i];
                ++tail;
            }
        }
        str1[tail] = '%';

        System.out.println(String.valueOf(str1));
        return str;
    }

    private static String sortStr(String str){
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return Arrays.toString(temp);
    }

    public static boolean anagram(String str1, String str2){
        return sortStr(str1) == sortStr(str2);
    }





}
