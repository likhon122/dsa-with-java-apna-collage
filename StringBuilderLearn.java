public class StringBuilderLearn {

    static void main(String[] args) {// Time complexity is O(26)

        // If we use regular String then it's time complexity is O(n^2) because of the string default behaviour if we change any string then the string at first copy in the heap then change after that it's store in the new memory so that's why the complexity is o(n^2) if we use String

        // Of If we use StringBuilder then it change every time the same memory location that's why it's time complexity is O(n) means O(26)
        StringBuilder sb = new StringBuilder();

        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
