package datastructure;

import java.util.ArrayList;
import java.util.Stack;

public class MyQueue<T> {

    private final Stack<T> stackNewestOnTop = new Stack<>();
    private final Stack<T> stackOldestOnTop = new Stack<>();

    public ArrayList<T> getNewestOnTop() {
        return new ArrayList<>(stackNewestOnTop);
    }

    public ArrayList<T> getOldestOnTop() {
        return new ArrayList<>(stackOldestOnTop);
    }

    ArrayList<T> newestOnTop;
    ArrayList<T> oldestOnTop;

    public void enqueue(T value){
        stackNewestOnTop.push(value);
    }

    public T peak(){
        //move element from stackNewest to StackOldest
        shiftStack();
        return stackOldestOnTop.peek();
        // move element from stackOldest to StackNewest
    }

    public T dequeue(){
        //move element from stackNewest to StackOldest
        shiftStack();
        return stackOldestOnTop.pop();
        // move element from stackOldest to StackNewest
    }

    private void shiftStack() {
        if (stackOldestOnTop.empty()){
            while(!stackNewestOnTop.empty())
            {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }

    }

}
