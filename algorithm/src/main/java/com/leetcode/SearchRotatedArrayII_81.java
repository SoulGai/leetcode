package com.leetcode;

/**
 * @program: leetcode
 * @description: 81. 搜索旋转排序数组 II
 * @author: SoulGai
 * @create: 2024-12-08 20:52
 * 给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。
 * 你必须尽可能减少整个操作步骤。
 * 输入：nums = [2,5,6,0,0,1,2], target = 0
 * 输出：true
 * 输入：nums = [2,5,6,0,0,1,2], target = 3
 * 输出：false
 **/
public class SearchRotatedArrayII_81 {
    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return false;
        if(n == 1) return nums[0] == target ? true : false;
        int l = 1,r = n-1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) return true;
            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l--;
                r++;
            }else if(nums[l] < nums[mid]){
                if(nums[l] < target && target < nums[mid]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else {
                if(nums[mid] < target && target < nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,1,1,1};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
