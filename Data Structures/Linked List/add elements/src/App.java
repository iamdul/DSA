
class SinglyLinkedList {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) throws Exception {
        SinglyLinkedList sll = new SinglyLinkedList();
        ListNode head=sll.head;


        
        head=addNodeStart(head, 45);
        printLinkedList(head);

        head=addNodeStart(head, 40);
        printLinkedList(head);

        head=addNodeStart(head, 35);
        printLinkedList(head);

        addNodeEnd(head,80);
        printLinkedList(head);

        addNodeEnd(head,80);
        printLinkedList(head);

        head=addNodeGiven(head,96,2);
        printLinkedList(head);

        head=addNodeGiven(head,100,1);
        printLinkedList(head);

        head=addNodeGiven(head,100,8);
        printLinkedList(head);

        
        head=addNodeGiven(head,100,10);
        printLinkedList(head);


    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
        

    }

    public static ListNode addNodeStart(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
        
    }

    public static void addNodeEnd(ListNode head,int value) {
        ListNode newNode = new ListNode(value);
        // Handle the empty list case
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Add the new node at the end
        current.next = newNode;
    }

    public static ListNode addNodeGiven(ListNode head,int value,int position){
        ListNode newNode= new ListNode(value);
        
        if(position == 1){
            newNode.next=head;
            head=newNode;
            
            return head;
        }else{
            ListNode current=head;
            int count=1;
            ListNode temp=null;
            while (count<position-1) {
                count++;
                current=current.next;
            }
            if(current==null){
                throw new NullPointerException("Position is exceeded the length of the linked list");
            }
            newNode.next=current.next;
            current.next=temp;
            current.next=newNode;
            return head;
        }
    }
}
