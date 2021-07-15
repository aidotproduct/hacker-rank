package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    MyQueue<Integer> myQueue = new MyQueue<Integer>();
    Integer[] queueRequest = new Integer[]{10, 20, 40, 50, 60};

    @Test
    void enqueue() {
        for (int i :
                queueRequest) {
            myQueue.enqueue(i);
        }
        assertArrayEquals(myQueue.getNewestOnTop().toArray(), queueRequest);
    }

    @Test
    void peak() {
    }

    @Test
    void dequeue() {
    }
}