import DataStructures.Implementation.QueueImplStatic;
import DataStructures.Implementation.StackImplementation;
import DataStructures.Queue;
import DataStructures.Stack;

public class Main {
    public static void main(String[] args){
        /*Stack stack = new StackImplementation(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();*/
        Queue fronta = new QueueImplStatic(5);
        fronta.enqueue(8);
        fronta.enqueue(15);
        fronta.enqueue(42);
        fronta.enqueue(3);
        fronta.enqueue(10);
        fronta.enqueue(8);
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());
        System.out.println(fronta.dequeue());

    }
}
