package task05;

public class Task05 {
    public static void main(String[] args) {
        int sizeMatrix = 10;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if (i == j || ((i + j + 1) == sizeMatrix)) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
