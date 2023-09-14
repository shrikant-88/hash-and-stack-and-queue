//import queue_using_linkedlist.node.queue;

public class queue_using_linkedlist {
  
   static class node{
    int data;
    node next;
    node(int newdata){
        data = newdata;
        next = null;
    }
}
    static class queue{
        static node head = null;
        static node tail = null;
        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        public static void add(int newdata) {
            node newnode = new node(newdata);
            if(tail == null){
                tail = head = newnode;
            }
            tail.next = newnode;
            tail = newnode;

        }
        public static int remove() {
            if(head == null){
                System.out.println("empty queue");
                return -1;
            }
            int frount = head.data;  
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return frount;
        }
        public static int peek() {
            if(head == null){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.peek());
    }
}
