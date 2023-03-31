public class SlidingWindow {

    public static int[] subArraySum(int[] arr, int k) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < arr.length - k; i++) {
            int currSum = 0;
            for (int j = i; j < k; j++) {
                currSum += arr[j];
            }
            if (sum < currSum)
                sum = currSum;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 6, 1, 10 };

        for (int i : subArraySum(arr, 3)) {
            System.out.println(i);
        }
    }
}