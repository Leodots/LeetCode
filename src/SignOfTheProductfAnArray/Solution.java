package SignOfTheProductfAnArray;

public class Solution {

    public void arraySign(int[] nums) {

        int product = 1;

        for(int i = 0; i < nums.length; i++) {

            product *= nums[i];
            product = signFunc(product);
        }
    }

    public int signFunc(int value){

        if (value  > 0) return 1;

        if (value  < 0) return -1;

        return 0;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        solution.arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41});

    }

}
