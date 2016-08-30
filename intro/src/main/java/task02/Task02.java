package task02;

public class Task02 {
    public static void main(String[] args) {
        double[] a = new double[10];
        double epsilon = 0.03;
        int minIndex = a.length - 1;
        for (int i = 1; i < a.length; i++) {
            a[i] = 1 / Math.pow(i + 1, 2);
            if (a[i] < epsilon) {
                if (i < minIndex) {
                    minIndex = i;
                    System.out.println("Min index=" + minIndex);
                }
                System.out.println("a[" + i + "]=" + a[i]);
            }
        }
    }

}
