public class SlidingWindow2 {

    public static int[] subArray(int[] arr, int start, int length){
        int[] subArray = new int[length];
        int j = 0;
        for (int i = start; i < (start+length); i++) {
            subArray[j] = arr[i];
            j++;
        }
        return subArray;
    }

    public static int[] slidingWindow(int[] arr, int k){
        int sum = 0;
        int temp = 0;
        // prepare first window
        for (int i = 0; i < k; i++) { sum += arr[i]; }
        int j = 0;
        // grow and shring
        for (int i = k; i < arr.length; i++) {
            temp = sum;
            //grow
            temp += arr[i];
            //shring
            temp -= arr[i-k];
            if (temp > sum) {
                sum = temp;
                j = i - k+1;
            }
        }
        return subArray(arr, j, k);
    }


    public static void main(String[] args) {
        int [] arr = {3, 4, 2, 6, 1, 10};
        
        for (int i : slidingWindow(arr, 3)) {
            System.out.println(i);
        }
    }
}
