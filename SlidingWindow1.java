public class SlidingWindow1 {
    public static void main(String[] args) {
        int [] arr = {3, 4, 2, 6, 1, 10};
        
        for (int i : slidingWindow(arr, 3)) {
            System.out.println(i);
        }
    }
    public static int[] subArray(int[] arr, int start, int length){
        int[] subArray = new int[length];
        int j = 0;
        for (int i = start; i < (start+length); i++) {
            subArray[j] = arr[i];
            j++;
        }
        return subArray;
    }

    private static int[] slidingWindow(int[] arr, int k) {
        int windowSum = 0;
        int j = 0;
        for (int i = 0; i < arr.length - k; i++) {
            int temp = arr[i] + arr[i+1] + arr[i+2];
            if (windowSum < temp) {
                windowSum = temp;
                j = i;
            } 
        }
        return subArray(arr, j, k);
    }
}
