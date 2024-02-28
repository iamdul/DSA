public class SinglyLinkedList {
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

        head = new ListNode(10);
        
        ListNode secondNode = new ListNode(8);
        ListNode thirddNode = new ListNode(1);
        ListNode fourthdNode = new ListNode(11);

        head.next = secondNode;
        secondNode.next = thirddNode;
        thirddNode.next = fourthdNode;

        printLinkedList(head);

        // head=deleteFirst(head);
        // printLinkedList(head);

        head=deleteEnd(head);
        printLinkedList(head);

        head=deleteGiven(head,1);
        printLinkedList(head);

        head=deleteGiven(head,2);
        printLinkedList(head);


        
    }

    public static ListNode deleteFirst(ListNode head){
        if(head==null){
            System.out.println("No node to delete");
            return null;
        }
        ListNode temp=head.next;
        head.next=null;
        head=temp;
        return head;
        
    }

    public static ListNode deleteEnd(ListNode head){
        ListNode current=head;
        if(head==null || head.next==null){
            return head=null;
            
        }else{

            ListNode previous=null;
            while(current.next!=null){
                previous=current;
                current=current.next;
    
            }
            previous.next=null;
            return head;
        }
        
    }

    public static ListNode deleteGiven(ListNode head,int position){
        ListNode current=head;
        if(head==null) {
            return head=null;
        
        }else if(position==1){
            return head=head.next;
            
        }else {

            ListNode previous=null;
            //ListNode temp=null;

            int count=1;
            while(count<position){
                previous=current;
                current=current.next;
                count++;
    
            }
            previous.next=current.next;
            current=null;
            // temp=current.next;
            // current.next=null;
            // previous.next=null;
            // previous.next=temp;
            return head;
        }
        
    }



    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");

    }

}
