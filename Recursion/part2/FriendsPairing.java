package Recursion.part2;

public class FriendsPairing { // Time complexity O(2^n) and space complexity O(n)

  static int friendsPairing(int n) {
    // Base case
    if (n == 1 || n == 2)
      return n;

    // Choices -> Single || Pairing
    // Choice if single
    int fcs = friendsPairing(n - 1);

    // Choice if pairing
    int fcp = friendsPairing(n - 2);
    // If choice pairing then the pared every element can choose n-1 persons so multiply the choices
    int pairWays = (n - 1) * fcp;

    // Return the total ways
    return fcs + pairWays;
  }

  public static void main(String[] args) {
    System.out.println(friendsPairing(3));
  }
}
