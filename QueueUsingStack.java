import java.util.Stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class QueueUsingStack {
   static Stack<Integer> stack1 = new Stack<>();
   static Stack<Integer> stack2 = new Stack<>();
    static int ele;
    public static void enQueue(int data) {
     stack1.push(data);
    }
    public static int deQueue() {
        if(stack1.empty()){
            System.out.println("Queue is empty ");
            System.exit(0);
        }
        if(stack2.empty()){
           while (!stack1.empty()) {
            ele = stack1.pop();
            stack2.push(ele);
           }
        }
        return stack2.pop();
       }
    
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.stack1);
        System.out.println(deQueue());
        System.out.println(q.stack2);
        System.out.println(q.stack1);
        q.enQueue(6);
        System.out.println(q.stack1);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        
        System.out.println(q.stack1);

    }
}
