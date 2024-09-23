package com.leetcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {
        final String text = "nlaebolko";
        final int result = maxNumberOfBalloons(text);
        System.out.println(result);
    }

    private static int maxNumberOfBalloons(String text) {
        final Map<String, Integer> balloonMap =  new HashMap<>();
        balloonMap.put("b", 0);
        balloonMap.put("a", 0);
        balloonMap.put("l", 0);
        balloonMap.put("o", 0);
        balloonMap.put("n", 0);

        for (int i = 0; i < text.length(); i++) {
            final String currentChar = String.valueOf(text.charAt(i));
            if (balloonMap.containsKey(currentChar)) {
                balloonMap.put(currentChar, balloonMap.get(currentChar) + 1);
            }
        }
        balloonMap.put("l", balloonMap.get("l") / 2);
        balloonMap.put("o", balloonMap.get("o") / 2);
        final int result = balloonMap.values().stream().min(Integer::compareTo).orElse(0);
        return result;
    }
}
