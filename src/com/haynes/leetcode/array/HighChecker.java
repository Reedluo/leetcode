package com.haynes.leetcode.array;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。(从小到大)
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。
 *
 *  
 *
 * 示例：
 *
 * 输入：heights = [1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 当前数组：[1,1,4,2,1,3]
 * 目标数组：[1,1,1,2,3,4]
 * 在下标 2 处（从 0 开始计数）出现 4 vs 1 ，所以我们必须移动这名学生。
 * 在下标 4 处（从 0 开始计数）出现 1 vs 3 ，所以我们必须移动这名学生。
 * 在下标 5 处（从 0 开始计数）出现 3 vs 4 ，所以我们必须移动这名学生。
 * 示例 2：
 *
 * 输入：heights = [5,1,2,3,4]  15234 12534 12354 12345   41235 31245 21345 12345
 * 输出：5
 * 示例 3：
 *
 * 输入：heights = [1,2,3,4,5]
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class HighChecker {

    public int heightChecker(int[] heights) {
        int count = 0;
        int[] array = new int[101];

        for (int i = 0; i < heights.length; i++) {
            array[heights[i]]++;
        }
        for (int i = 1, j = 0; i < array.length; i++) {
            // arr[i]，i就是桶中存放的元素的值，arr[i]是元素的个数
            // arr[i]-- 就是每次取出一个，一直取到没有元素，成为空桶
            while (array[i]-- > 0) {
                // 从桶中取出元素时，元素的排列顺序就是非递减的，然后与heights中的元素比较，如果不同，计算器就加1
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }

    public int heightChecker2(int[] heights) {
        int count = 0;
        int[] clone = heights.clone();
        for (int i = 0, j = i; i < clone.length; j = ++i) {
            if ((i + 1) >= clone.length) {
                break;
            }
            int ai = clone[i + 1];
            while (ai < clone[j]) {
                clone[j + 1] = clone[j];
                if (j-- == 0) {
                    break;
                }
            }
            clone[j + 1] = ai;
        }

        for (int i = 0; i < clone.length; i++) {
            if (clone[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        HighChecker checker = new HighChecker();
        int[] array = {1, 3, 8, 1, 2};
        int i = checker.heightChecker(array);
        System.out.println(i);

    }


}
