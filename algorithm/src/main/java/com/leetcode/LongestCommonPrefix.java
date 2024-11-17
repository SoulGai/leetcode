package com.leetcode;

/**
 * @program: leetcode
 * @description: 最长公共前缀
 * @author: SoulGai
 * @create: 2024-11-17 16:59
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 *
 * 输入：strs = ["flower","flow","flight"] 输出："fl"
 * 输入：strs = ["dog","racecar","car"]    输出：""
 **/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"", "b", "c"};
        //水平扫描
        System.out.println("水平扫描最长公共前缀是: " + longestCommonPrefix(strs1)); // "fl"
        System.out.println("水平扫描最长公共前缀是: " + longestCommonPrefix(strs2)); // ""
        System.out.println("水平扫描最长公共前缀是: " + longestCommonPrefix(strs3)); // ""
        //垂直扫描
        System.out.println("垂直扫描最长公共前缀是: " + verticalLongestCommonPrefix(strs1)); // "fl"
        System.out.println("垂直扫描最长公共前缀是: " + verticalLongestCommonPrefix(strs2)); // ""
        System.out.println("垂直扫描最长公共前缀是: " + verticalLongestCommonPrefix(strs3)); // ""



    }

    /**
     * 水平扫描法： 适合字符串数量较少或字符数不均的情况。
     * 将第一个字符串作为基准，依次和后面的字符串进行比较，找出公共前缀。
     * 每次比较时更新公共前缀。
     * 如果某个字符串没有公共前缀，则返回空字符串。
     * 时间复杂度：O(S)，其中 S 是所有字符串中字符的总数。
     * 空间复杂度：O(1)，除了输入字符串外不使用额外空间。
     * 优点：直观，易于理解。
     */
    public static String longestCommonPrefix(String[] strs) {

        return "";
    }

    /**
     * 垂直扫描法：适合字符串数量多，且字符串的长度大致相同的情况。
     * 比较每个字符串的同一位置的字符。
     * 如果出现不相等的字符，说明公共前缀结束。
     * 时间复杂度：O(S)，其中 S 是所有字符串中字符的总数。
     * 空间复杂度：O(1)，不需要额外的空间。
     * 优点：不需要逐个删除公共前缀，可以直接按字符比较。
     * @param strs
     * @return
     */
    public static String verticalLongestCommonPrefix(String[] strs) {

        return ""; // 返回最短字符串
    }

}