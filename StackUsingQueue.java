import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static int ele;
    public static void add(int data) {
        while(!q1.isEmpty()){
          q2.add(q1.peek());
          q1.poll();
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }
    public static int remove() {
        if(q1.isEmpty()){
            System.out.println("stack is empty !");
            System.exit(0);
        }
        if(!q1.isEmpty()){
            ele = q1.remove();
        }
        return ele;
    }
    
    public static void main(String[] args) {
        StackUsingQueue S = new StackUsingQueue();
        S.add(10);
        S.add(20);
        S.add(30);
        S.add(40);
        S.add(50);
        System.out.println(S.remove());
        System.out.println(S.remove());
        System.out.println(S.remove());
        System.out.println(S.remove());
        System.out.println(S.remove());
        System.out.println(S.remove());
    
    }
}
