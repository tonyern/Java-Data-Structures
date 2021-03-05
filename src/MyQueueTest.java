import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void enqueue() {
        MyQueue testLine = new MyQueue();
        testLine.enqueue("John");

        // Making sure John is in front of line.
        Assert.assertEquals("John", testLine.front());
    }

    @Test
    void dequeue() {
        MyQueue testLine = new MyQueue();
        testLine.enqueue("John");
        testLine.enqueue("Donald");
        testLine.dequeue();

        // Making sure Donald is in front of line.
        Assert.assertEquals("Donald", testLine.front());
    }

    @Test
    void front() {
        MyQueue testLine = new MyQueue();
        testLine.enqueue("John");

        // Making sure John is in front of line.
        Assert.assertEquals("John", testLine.front());
    }

    @Test
    void rear() {
        MyQueue testLine = new MyQueue();
        testLine.enqueue("John");
        testLine.enqueue("Donald");

        // Making sure Donald is in front of line.
        Assert.assertEquals("Donald", testLine.rear());
    }

    @Test
    void getSize() {
        MyQueue testLine = new MyQueue(69);

        // Making sure size of 69 is correct.
        Assert.assertEquals(69, testLine.getSize());
    }

    @Test
    void isFull() {
        MyQueue testLine = new MyQueue();

        // Test 1: It is near capacity but not full.
        testLine.enqueue("Tony");
        testLine.enqueue("Donald");
        testLine.enqueue("Joe");
        testLine.enqueue("Jeff");
        Assert.assertFalse(testLine.isFull());

        // Test 2: Now full so expect full.
        testLine.enqueue("John");
        Assert.assertTrue(testLine.isFull());
    }

    @Test
    void isEmpty() {
        MyQueue testLine = new MyQueue();

        // Test 1: It is empty so expect empty.
        Assert.assertTrue(testLine.isEmpty());

        // Test 2: It contains an entity so expect not empty.
        testLine.enqueue("Joe");
        Assert.assertFalse(testLine.isEmpty());
    }

    @Test
    void getQueue() {
        MyQueue queue1 = new MyQueue();
        queue1.enqueue("Tony");
        queue1.enqueue("John");
        queue1.enqueue("Jennifer");
        queue1.enqueue("Elaine");
        queue1.enqueue("Sarah");

        MyQueue queue2 = new MyQueue();
        queue2.enqueue("Tony");
        queue2.enqueue("John");
        queue2.enqueue("Jennifer");
        queue2.enqueue("Elaine");
        queue2.enqueue("Sarah");

        Assert.assertEquals(queue1.getQueue(), queue2.getQueue());
    }
}