package BinarySearch;

public class Solution {

    public static int search(int[] nums, int target) {

        int max = nums.length - 1;
        int min = 0;

        int guessed;
        while(min <= max) {
            guessed = (max+min)/2;

            if(nums[guessed] == target) return guessed;

            if(target > nums[guessed]) min = guessed + 1;

            if(target < nums[guessed]) max = guessed - 1;

        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{-1,0,3,5,9,12}, 12));

    }

}
