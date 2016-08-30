package task03;

public class Task03 {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 12.0;
        double h = 2.5;
        if (args.length >= 3) {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            h = Double.parseDouble(args[2]);
        }

        while (a < b) {
            System.out.println(a + " " + calcFunction(a));
            a += h;
        }
    }

    private static double calcFunction(double x) {
        return (Math.tan(2 * x) - 3);
    }
}
