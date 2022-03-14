package SearchInsertPosition;

import java.util.Arrays;

public class Solution {

    public int searchInsert(int[] nums, int target) {

        int x = Arrays.binarySearch(nums, target);

        return x < 0 ? (Math.abs(x) - 1) : x;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums = {1,3,4,6};
        System.out.println(s.searchInsert(nums, 5));

    }

}
