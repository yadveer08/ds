public class NumberOfMinSubArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 6, 1, 10 }; //6

        System.out.println(minSubArrays(arr, 20));
    }

    private static int minSubArrays(int[] arr, int k) {
        int product = 1;
        int count = 0;
        int productCount = 2;
        label: while (true) { // n
            boolean check = false;
            for (int i = 0; i < arr.length; i++) { //n
                product = 1;
                for (int j = i; j < productCount; j++) { //n
                    product *= arr[j];
                }
                if (product < k) {
                    count++;
                    check = true;
                }
            }
            productCount++;
            if (check) break label;
        }

        return count;
    }
}
