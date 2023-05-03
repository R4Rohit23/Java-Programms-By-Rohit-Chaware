package com.company.Concept_Problems.Maths;

import java.util.*;

public class Roman_To_Integer {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = s.length() - 1;
        int ans = map.get(s.charAt(i));
        i--;

        while (i >= 0) {
            if (map.get(s.charAt(i + 1)) > map.get(s.charAt(i)))
                ans -= map.get(s.charAt(i));
            else
                ans += map.get(s.charAt(i));
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
