package com.leetcode;

/**
 * @program: leetcode
 * @description: 33. 搜索旋转排序数组
 * @author: SoulGai
 * @create: 2024-12-08 15:27
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 * 输入：nums = [4,5,6,7,0,1,2], target = 3
 * 输出：-1
 **/
public class SearchInRotatedSortedArray_33 {
    public static int search(int[] nums, int target) {
       int n = nums.length;
       if(n == 0) return -1;
       if(n == 1) return nums[0] == target ? 0 : -1;
       int l = 0, r = n-1;
       while (l <= r){
           int mid = l + (r-l)/2;
           if(nums[mid] == target) return mid;
           if(nums[l]<= nums[mid]){
               if (nums[l] <= target && target <= nums[mid]){
                   r = mid - 1;
               }else {
                   l = mid + 1;
               }
           }else {
               if(nums[mid] <= target && target <= nums[r]){
                   l = mid + 1;
               }else {
                   r = mid - 1;
               }
           }

       }

        return -1; // 未找到目标值
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}