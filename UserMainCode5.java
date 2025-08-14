
//Find the 1 digit to be removed to form palindrome👇
import java.io.*;
import java.util.*;

class UserMainCode5
{
    public int digitRemovePalin(int input1) {
        String s = String.valueOf(input1);
        int n = s.length();
        if (isPalindrome(s)) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            String t = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(t)) {
                return s.charAt(i) - '0';
            }
        }
        return -1;
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}