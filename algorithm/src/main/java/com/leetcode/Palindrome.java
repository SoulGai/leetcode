package com.leetcode;

/**
 * @program: leetcode
 * @description: 回文数
 * @author: SoulGai
 * @create: 2024-11-17 13:44
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数：是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 输入：x = 121  输出：true
 * 输入：x = -121 输出：false
 * 输入：x = 10 输出：false
 **/
public class Palindrome {
    public static boolean isPalindrome(int x) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(23));
        System.out.println(isPalindrome(32));
    }
}
