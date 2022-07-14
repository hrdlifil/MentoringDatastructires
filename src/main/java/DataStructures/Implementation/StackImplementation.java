package DataStructures.Implementation;

import DataStructures.Stack;

public class StackImplementation implements Stack {
    private int capacity;
    private int[] data;
    private int top = -1;

    public StackImplementation(int capacity){
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    @Override
    public void push(int toBePushed) {
        if (!this.isFull()){
            this.data[this.top + 1] = toBePushed;
            this.top++;
        }else {
            System.out.println("Zásobník je plný, nelze na něj vkládat");
        }



    }

    @Override
    public void pop() {
        if (this.isEmpty()){
            System.out.println("Zásobník je prázdný");
        }else {
            this.data[this.top] = 0;
            this.top--;
        }
    }

    @Override
    public int peek() {
        if (!this.isEmpty()){
            return this.data[this.top];
        }else {
            System.out.println("Zásobník je prázdný, vracím defaultní 0");
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        return this.top == this.capacity -1;
    }
}
