package Studies;


public class Study {


    public static boolean isEqualToSum(int[] array, int sum) {

        int high = array.length - 1;
        int low = 0;

        while(sum(array, high, low) != sum) {

            if(sum(array, high, low) < sum) low++;

            if(sum(array, high, low) > sum) high--;

            if(low >= array.length - 1 || high < 0) return false;

            if(high == low && sum(array, high, low) != sum) return false;
        }
        return true;
    }

    public static int sum(int[] array, int high, int low) {
        return array[high] + array[low];
    }


    public static void main(String[] args) {

        System.out.println(isEqualToSum(new int[]{1, 2, 4, 6}, 10));

    }
}
