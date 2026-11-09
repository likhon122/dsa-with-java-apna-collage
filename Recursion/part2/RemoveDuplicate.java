package Recursion.part2;

public class RemoveDuplicate { // Time complexity O(n) and space complexity O(n)

  static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map) {
    // Base case
    if (idx == str.length()) {
      System.out.println(newStr);
      return;
    }

    // self work
    char character = str.charAt(idx);
    int mapIndex = character - 'a';
    if (map[mapIndex] == false) {
      newStr.append(character);
      map[mapIndex] = true;
    }

    // Recursive work
    removeDuplicate(str, idx + 1, newStr, map);
  }

  public static void main(String[] args) {
    boolean[] map = new boolean[26];
    StringBuilder newString = new StringBuilder();

    removeDuplicate("likhonislam", 0, newString, map);

  }
}
