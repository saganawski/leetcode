package com.leetcode.leetcode;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        final String J = "aA";
        final String S = "aAAbbbb";
        final int result = numJewelsInStones(J, S);
        System.out.println(result);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        /*
        * 1) create a counter to keep track of the number of jewels
        * 2) loop through the jewels creating a hashMap
        * 3) loop through the stones and check if the stone is in the hashMap increment the counter
        * 4) return the counter
        * */

        int counter = 0;

        if(jewels.isEmpty() || stones.isEmpty()){
            return 0;
        }

        final HashMap<Character, Integer> jewelMap = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelMap.put(jewels.charAt(i), 0);
        }

        for (int i = 0; i < stones.length(); i++) {
            if(jewelMap.containsKey(stones.charAt(i))){
                counter++;
            }
        }

        return  counter;

    }
}
