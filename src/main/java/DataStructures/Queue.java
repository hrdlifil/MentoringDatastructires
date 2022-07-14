package DataStructures;

public interface Queue {
    // přijme argument arg, který vloží na frontu za prvek, na který ukazuje rear
    void enqueue(int arg);
    // vrátí prvek, na který ukazuje front, tedy prvek, který je nejdéle ve frontě
    int dequeue();
    // vrací prvek na předku fronty
    int front();
    // vrací poslední prvek ve frontě
    int rear();
    boolean isFull();
    boolean isEmpty();
}
