import java.util.Scanner;

    public class geometry {

        public static void rightTriangle(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void invertedTriangle(int n) {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void pyramid(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void invertedPyramid(int n) {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void diamond(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the size of the pattern: ");
            int n = input.nextInt();

            if (n <= 0) {
                System.out.println("Invalid size!");
                return;
            }

            System.out.println("Choose the pattern type:");
            System.out.println("1 - Right Triangle");
            System.out.println("2 - Inverted Right Triangle");
            System.out.println("3 - Pyramid");
            System.out.println("4 - Inverted Pyramid");
            System.out.println("5 - Diamond");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    rightTriangle(n);
                    break;
                case 2:
                    invertedTriangle(n);
                    break;
                case 3:
                    pyramid(n);
                    break;
                case 4:
                    invertedPyramid(n);
                    break;
                case 5:
                    diamond(n);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }


                    }
    }


