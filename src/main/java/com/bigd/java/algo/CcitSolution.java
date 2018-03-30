package com.bigd.java.algo;

import static com.bigd.java.algo.Ch1ArraysNStrings.*;

public class CcitSolution {

    public static void main(String[] args){
        boolean[] charSet = new boolean[256];
        charSet[55] = true;

//        System.out.println(String.valueOf(removeDuplicates("aaaa".toCharArray())));
        removeDuplicates("abacdbc");

    }
}
