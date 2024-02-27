
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
        System.out.println(sll.head == null);

        sll.head = new ListNode(10);
        System.out.println(sll.head == null);
        ListNode secondNode = new ListNode(8);
        ListNode thirddNode = new ListNode(1);
        ListNode fourthdNode = new ListNode(11);

        sll.head.next = secondNode;
        secondNode.next = thirddNode;
        thirddNode.next = fourthdNode;

        printLinkedList(sll.head);
        System.out.println("Length :" + lengthLinkedList(sll.head));

    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");

    }

    public static int lengthLinkedList(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
