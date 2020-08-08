package com.haynes.leetcode.array;
/**
 * 给定一个未经排序的整数数组，找到最长且连续的的递增序列，并返回该序列的长度。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,4,7]
 * 输出: 3
 * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
 * 示例 2:
 *
 * 输入: [2,2,2,2,2]
 * 输出: 1
 * 解释: 最长连续递增序列是 [2], 长度为1。
 *  
 *
 * 注意：数组长度不会超过10000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int count = 1;
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                count++;
            }else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        if (count == nums.length) {
            max = count;
        }else {
            max = Math.max(max, count);
        }
        return max;
    }

    public int findLengthOfLCIS2(int[] nums) {
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) {
                anchor = i;
            }
            ans = Math.max(ans, i - anchor + 1);
        }


        return ans;
    }

    public static void main(String[] args) {
        FindLengthOfLCIS obj = new FindLengthOfLCIS();
        int[] arr = {1,3,5,4,7};
        int i = obj.findLengthOfLCIS(arr);
        System.out.println(i);

    }
}
