public class JAVATEST0005 {

    public static void main(String[] args) {

        final int ROWS = 5;
        int number = 1;

        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(number);

                if (j < i) {
                    System.out.print(" ");
                }

                number++;
            }

            System.out.println();
        }
    }
}
