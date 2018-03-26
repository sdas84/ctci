package com.bigd.java.algo;

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






}
