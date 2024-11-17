package com.leetcode;
import java.util.Stack;

/**
 * @program: leetcode
 * @description: 有效的括号
 * @author: SoulGai
 * @create: 2024-11-17 17:11
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * 输入：s = "()"       true
 * 输入：s = "()[]{}"   true
 * 输入：s = "(]"       false
 * 输入：s = "([])"     true
 **/

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("{[]}")); // true
    }

    public static boolean isValid(String s) {

        return true;
    }
}