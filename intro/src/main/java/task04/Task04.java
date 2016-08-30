package task04;

public class Task04 {
    public static void main(String[] args) {
        double[] a = {1, 4, 3, 4, 15, 16};
        System.out.println(findMax(a));
    }

    static double findMax(double[] a) {
        double maxValue = a[0] + a[a.length - 1];
        double sum;
        for (int i = 1; i < (a.length - i - 1); i++) {
            sum = a[i] + a[a.length - i - 1];
            if (maxValue < sum) maxValue = sum;
        }
        return (maxValue);
    }
}
