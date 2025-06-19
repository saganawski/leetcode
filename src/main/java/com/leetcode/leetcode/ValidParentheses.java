package com.leetcode.leetcode;


import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        final String givenString = "()[]{}";
        final Boolean result = isValid(givenString);
        System.out.println("Result : " + result);
    }

    private static Boolean isValid(String s) {
        HashMap<Character, Character> closingMap = new HashMap<>();
        closingMap.put(')', '(');
        closingMap.put(']', '[');
        closingMap.put('}', '{');

        //iterate over a string
        // add char to dataStructure
        // on interaction if closeing bracket is in DS remove
        // valid is DS is empty
        final Stack<Character> characters = new Stack<>();

       for(Character character : s.toCharArray()){
           if(!closingMap.containsKey(character)){
               characters.push(character);
           } else{
               if(characters.isEmpty() || characters.pop() != closingMap.get(character)){
                   return false;
               }
           }
       }

        return characters.isEmpty();
    }
}


/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"

        Output: true

        Example 2:

        Input: s = "()[]{}"

        Output: true

        Example 3:

        Input: s = "(]"

        Output: false

        Example 4:

        Input: s = "([])"

        Output: true



        Constraints:

        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.*/
