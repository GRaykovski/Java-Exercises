package main;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean a = isPalindrome("abc");
        boolean b = isPalindrome("abba");
        System.out.println(a);
        System.out.println(b);
    }
}

