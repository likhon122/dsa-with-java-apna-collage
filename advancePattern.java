
public class advancePattern {

    public static void hollowPattern(int l, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || j == 0 || i == h - 1 || j == l - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void invertedPyramid() {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j <= 4; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid() {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydPyramid() {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void upperButterflyPattern() {
        int n = 4;
        int firstIdx = 1, lastIdx = n * 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                if (j <= firstIdx || lastIdx <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            firstIdx++;
            lastIdx--;
            System.out.println();

        }
    }

    public static void bottomButterflyPattern() {
        int n = 4;
        int firstIdx = n, lastIdx = n + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                if (j <= firstIdx || lastIdx <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            firstIdx--;
            lastIdx++;
            System.out.println();

        }
    }

    public static void butterflyPattern() {
        upperButterflyPattern();
        bottomButterflyPattern();
    }

    public static void butterflyPatternSimpleLogic(int n) {
        for (int i = 1; i <= n; i++) {
            // Print stars - 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces-  2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // Print stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces 2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombusPattern(int n) {
        // Loop is running for n times
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = n - i; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n || j == n) {
                    if (j == n && i!=1 && i!=n ) {
                        // // Print spaces
                        for (int k = 1; k <= n-2; k++) {
                            System.out.print("   ");
                        }
                    }
                    System.out.print(" * ");
                }
                // if (j == n) {

                //     System.out.print(" * ");
                // }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowPattern(5, 4);
        // invertedPyramid();
        // invertedHalfPyramid();
        // floydPyramid();
        // zeroOneTriangle();
        // butterflyPattern();
        // butterflyPatternSimpleLogic(4);
        // rhombusPattern(15);
        hollowRhombus(25);
    }
}
