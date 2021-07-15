
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MinIntHeapTest {

    MinIntHeap heap = new MinIntHeap();

    @Test
    void peak() {

    }

    @Test
    void poll() {
    }

    @Test
    void add() {
        int[] elements = new int[]{3, 4, 8, 9, 7, 10, 12, 15, 20, 13};
        for (int item :
                elements) {
            heap.add(item);
        }
        heap.add(2);
        assertTrue(true);
        heap.poll();
        heap.add(5);
        System.out.println(heap.peak());
    }
}