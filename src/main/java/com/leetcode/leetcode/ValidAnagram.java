package com.leetcode.leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        final String s = "anagram", t = "nagaram";
        final boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    private static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//
//        final HashMap<String, Integer> stringCount = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            final String sChar = String.valueOf(s.charAt(i));
//            final String tChar = String.valueOf(t.charAt(i));
//            if(stringCount.containsKey(sChar)){
//                stringCount.put(sChar, stringCount.get(sChar) + 1);
//            }else{
//                stringCount.put(sChar, 1);
//            }
//            if(stringCount.containsKey(tChar)){
//                stringCount.put(tChar, stringCount.get(tChar) - 1);
//            }else{
//                stringCount.put(tChar, -1);
//            }
//        }
//        final boolean containsOddValue = stringCount.values()
//                .stream()
//                .anyMatch(count -> count % 2 != 0);
//        return containsOddValue;
        final String sortedS = s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        final String sortedT = t.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println("Sorteds : "+sortedS);
        System.out.println("sortedT : "+sortedT);
        return sortedS.equals(sortedT);
    }
}