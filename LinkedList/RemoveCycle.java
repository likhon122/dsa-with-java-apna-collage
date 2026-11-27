package LinkedList;

public class RemoveCycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static RemoveCycle.Node head;
    public static RemoveCycle.Node tail;
    public static int size;

    // Detect Cycle
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }

    // Remove Cycle
    public static void removeCycle(){
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast!= null && fast.next != null){
            slow = slow.next; // increase by +1
            fast = fast.next.next; // increase by +2
            if(slow == fast) {
                isCycle = true;
                break;
            }
        }

        if(!isCycle){
            return;
        }
        // Find Last node
        slow = head; // Reset the slow to head
        Node prev = null;
        // When Cycle end with the first node means full cycle then
        if(fast == slow){
            while (fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // When cycle is not full cycle. Means have half of the cycle or something
        while (slow != fast){
            prev = fast; // Store the fast previous node that is the actual previous node
            slow = slow.next; // increase by +1
            fast = fast.next; // increase by +1
        }
        // Remove cycle
        prev.next = null;
    }

    static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
