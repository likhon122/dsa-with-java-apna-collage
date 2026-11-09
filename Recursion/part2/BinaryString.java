package Recursion.part2;

public class BinaryString {
  static void binaryString(int n, int lastPlace, StringBuilder str) {
    // Base Case
    if (n == 0) {
      System.out.println(str);
      return;
    }

    // If last index is 0 then choose 0 or 1 any of them
    binaryString(n - 1, 0, str.append("0"));
    str.deleteCharAt(str.length() -1);
    // If last index is 0 then choose just 1 if 1 then it's violate the rule consecutive one rule
    if (lastPlace == 0) {
      binaryString(n - 1, 1, str.append("1"));
      str.deleteCharAt(str.length() - 1);
    }
  }
  
  static void binaryStringUsingString(int n, int lastPlace, String str) {
    // Base Case
    if (n == 0) {
      System.out.println(str);
      return;
    }

    // If last index is 0 then choose 0 or 1 any of them
    binaryStringUsingString(n - 1, 0, str+"0");
    
    // If last index is 0 then choose just 1 if 1 then it's violate the rule consecutive one rule
    if (lastPlace == 0) {
      binaryStringUsingString(n - 1, 1, str +"1");
    }
  }

  public static void main(String[] args) {

    binaryString(3, 0, new StringBuilder());
  }
}
