package com.leetcode;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: 两数之和
 * @author: SoulGai
 * @create: 2024-11-17 12:56
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 **/
public class IntTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        return new int[1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
