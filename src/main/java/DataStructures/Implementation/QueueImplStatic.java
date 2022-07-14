package DataStructures.Implementation;

import DataStructures.Queue;

public class QueueImplStatic implements Queue {

    private int[] data;
    private int rear;

    public QueueImplStatic(int capacity){
        data = new int[capacity];
        rear = -1;
    }


    @Override
    public void enqueue(int arg) {
        if (!isFull()){
            data[rear + 1] = arg;
            rear++;
            return;
        }
        System.out.println("Fronta je plná, nelze na ni vkládat");

    }

    @Override
    public int dequeue() {
        if (!isEmpty()){
            int toReturn = data[0];
            moveTheQueue();
            return toReturn;
        }
        System.out.println("Fronta je prázdná");
        return 0;
    }

    @Override
    public int front() {
        if (!isEmpty()){
            return data[0];
        }
        System.out.println("Fronta je prázdná, nic na ni není");
        return 0;
    }

    @Override
    public int rear() {
        if (!isEmpty()){
            return data[rear];
        }
        System.out.println("Fronta je prázdá");
        return 0;
    }

    @Override
    public boolean isFull() {
        return rear == data.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return rear == -1;
    }

    private void moveTheQueue(){
        for (int i = 1; i < data.length; i++){
            data[i-1] = data[i];
        }

    }
}
