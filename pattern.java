
public class pattern {

    public static void starPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPattern() {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void characterPattern() {
        char character = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // starPattern();
        // invertedPattern();
        // halfPyramid();
        characterPattern();
    }
}
