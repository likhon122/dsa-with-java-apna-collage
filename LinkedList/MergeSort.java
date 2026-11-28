package LinkedList;

// Time complexity O(NlogN)
public class MergeSort {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static MergeSort.Node head;
    public static MergeSort.Node tail;

    private static Node middle(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // middle
    }

    private static Node merge(Node leftHalf, Node rightHalf){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (leftHalf != null && rightHalf != null){
            if(leftHalf.data <= rightHalf.data){
                temp.next = leftHalf;
                leftHalf = leftHalf.next;
            }else {
                temp.next = rightHalf;
                rightHalf = rightHalf.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (leftHalf != null) {
            temp.next = leftHalf;
        } else {
            temp.next = rightHalf;
        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head){
        // Base Case
        if(head == null || head.next == null){
            return head;
        }

        // Find Middle
        Node middle = middle(head);
        Node secondHalf = middle.next;
        middle.next = null;


        // Call merge for left half
        Node leftSorted = mergeSort(head);
        // Call merge for right half
        Node RightSorted = mergeSort(secondHalf);

        // Merge and return
        return merge(leftSorted, RightSorted);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printList(head);
        head = mergeSort(head);
        printList(head);
    }
}
