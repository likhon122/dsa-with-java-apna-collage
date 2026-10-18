
public class Strings {

    public static void printStrings(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Likhon";
        String lastName = "Islam";
        String fullName = firstName + " " + lastName;
        printStrings(fullName);
    }

}
