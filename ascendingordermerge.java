public class ascendingordermerge {
    public static double median(int[] arr) {
        int n = arr.length;

        if (n % 2 == 0) {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3};

        System.out.println(median(a));
        System.out.println(median(b));
    }
}



