package HappyNumber;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution {


    public boolean isHappy(int n) {

        Set<Integer> hash = new HashSet<>();

        while(n != 1 && !hash.contains(n)) {

            hash.add(n);

            n = getNextInt(n);

        }

        return n == 1;

    }

    private int getNextInt(int n) {

        int totalSum = 0;
        while(n > 0) {

            int d = n % 10;
            totalSum += d * d;
            n /= 10;

        }
        return totalSum;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        Random random = new Random();
        System.out.println(solution.isHappy(random.nextInt(50)));

    }

}
