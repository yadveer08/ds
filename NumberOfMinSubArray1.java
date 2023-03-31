public class NumberOfMinSubArray1 {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 6, 1, 10 }; // 6

        System.out.println(minSubArrays(arr, 20));
    }

    private static int minSubArrays(int[] arr, int k) {
        int product = 1;
        int productcount = 2;
        int count = 0;
        boolean check = true;
        while (check) { // n
            check = false;
            // creating window
            for (int j = 0; j < productcount; j++) {
                product *= arr[j];
                if (product < k) {
                    count++;
                    check = true;
                }
            }
            for (int j = productcount; j < arr.length; j++) {
                // grow
                product *= arr[j];
                // shrink
                product /= arr[j - productcount];

                if (product < k) {
                    count++;
                    check = true;
                }
            }
        }
        return count;
    }
}
