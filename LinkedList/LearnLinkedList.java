package LinkedList;

public class LearnLinkedList {

    // Node
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add first
    public void addFirst(int data){
        // Step 1: Create New node
        Node newNode = new Node(data);
        size++;
        // If head is empty means no node exist then just initialize the new node head = tail = new node
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2: New Node's next = head
        newNode.next = head; // Link
        // Step 3: Head = new node -> Now new head is the new node
        head = newNode;
    }

    // Add last
    public void addLast(int data){
        // Step 1: Create a new Node
        Node newNode = new Node(data);
        size++;
        // If Not have any node then head = tail = newNode
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2: tail.next = newNode -> tail.next is the newNode means null
        tail.next = newNode;
        // Step 3: tail = newNode -> initialize the new tail = newNode
        tail = newNode;
    }

    // Print Linked list // O(n)
    public void print(){
        // If Head is empty null then print linked list is empty
        if(head == null){
            System.out.println("Lined List is empty!");
        }

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // Add middle O(n)
    public void add(int index, int data){
        // We call addFirst because we need to change Head and tail
        if(index == 0){
            addFirst(data);
            return;
        }
        // Step 1: Create new Node
        Node newNode = new Node(data);
        size++;
        // Find the middle previous node next and initialize the next into temp
        Node temp = head;
        int i = 0;
        while (i < index - 1){
            temp = temp.next;
            i++;
        }
        // Step 3: newNode next is the temp.next
        newNode.next = temp.next;
        // Temporary means index of previous element next is new node (Break the link and add the new node)
        temp.next = newNode;
    }

    // Get size
    public int size() {
        return size;
    }

    // Remove First
    public void removeFirst(){
        // Edge cases if empty or have just one single Linked list
        if(head == null || size == 0){
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        // Head  = next Linked list
        head = head.next;
        size--;
    }

    // Remove last
    public void removeLast(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return;
        }if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        // Find tail previous element i == size - 2
        Node prev = head;
        int i = 0;
        while (i < size - 2){
            prev = prev.next;
            i++;
        }
        // Set the previous element as a tail and set null for next
        prev.next = null;
        tail = prev;
        size--;
    }

    // ItrSearch O(n)
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null){
            if(temp.data == key){
                // Found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Not found
        return -1;
    }

    // Iteration using recursion
    public int recursionSearch(Node temp, int key){
        // Base case
        if(temp == null) return -1;
        // If found (Self Work)
        if(temp.data == key) return 0;
        // Recursive work
        int idx = recursionSearch(temp.next, key);
        // If not found then return -1
        if(idx == -1) return -1;
        // if found then calculate the idx
        idx ++;
        return idx;
    }

    // Reverse a Linked List
    public void reverse(){
        Node prev = null;
        Node current = tail = head;
        Node next;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // Assign the last node head to the original head
        head = prev;
    }

    // Remove Last nth Node
    public void removeLastNthNode(int n){
        int size = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }

        // Check if the head is the nthNode
        if(n == size){
            assert head != null;
            head = head.next;
            return;
        }

        int i = 1;
        int ntNode = size - n;
        Node prev = head;

        while (i < ntNode){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }

    // Find Middle
    public Node findMiddle(Node head){
        Node slowP = head;
        Node fastP = head;

        while (fastP != null && fastP.next != null){
            slowP = slowP.next; // +1
            fastP = fastP.next.next; // +2
        }

        return slowP; // is my middle
    }

    // Check Palindrome
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Step 1: Find middle
        Node middle = findMiddle(head);

        // Step 2: 2nd Half reverse
        Node prev = null;
        Node current = middle;
        Node next;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        middle = prev;

        // Check if 1st half and second half is equal
        Node firstHalf = head;
        Node secondHalf = middle;
        while (secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    static void main(String[] args) {
        LearnLinkedList ll = new LearnLinkedList();
        // Add First
//        ll.addFirst(2);
//        ll.addFirst(1);
        // Add Last
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        // Add
//        ll.add(2,10);
//        // Remove First
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
        ll.print();
//        System.out.println(ll.itrSearch(4));
//        System.out.println(ll.recursionSearch(head, 4));
//        System.out.println(ll.size());

//        ll.reverse();
//        ll.print();
//        ll.removeLastNthNode(3);
//        ll.print();
        System.out.println(ll.isPalindrome());
    }
}
