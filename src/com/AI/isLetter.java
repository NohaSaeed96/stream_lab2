package com.AI;

public class isLetter {
    public static boolean letters(String s) {
        if (s==null | s.equals("")) {
            return false;
        } else {
            boolean characterStream = s.chars().allMatch(Character::isLetter);
            return characterStream;
        }
    }
}
