import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Unit testing for MyIntegerStack class.
 */
class MyIntegerStackTest {

    @Test
    void push() {
        MyIntegerStack intStack = new MyIntegerStack(5);

        intStack.push(1);

        Assert.assertEquals(1, intStack.peek());
    }

    @Test
    void pop() {
        MyIntegerStack intStack = new MyIntegerStack(5);

        intStack.push(1);
        intStack.push(2);
        intStack.pop();

        Assert.assertEquals(1, intStack.peek());
    }

    @Test
    void peek() {
        MyIntegerStack intStack = new MyIntegerStack(5);

        intStack.push(1);

        Assert.assertEquals(1, intStack.peek());
    }

    @Test
    void empty() {
        MyIntegerStack intStack = new MyIntegerStack(5);

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        // Test 1 where we expect stack to not be empty.
        Assert.assertFalse(intStack.empty());

        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.pop();

        // Test 2 where we expect stack to be empty.
        Assert.assertTrue(intStack.empty());
    }

    @Test
    void isFull() {
        MyIntegerStack intStack = new MyIntegerStack(5);

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        // Test 1 where we expect stack to be full.
        Assert.assertTrue(intStack.isFull());

        intStack.pop();

        // Test 2 where we expect stack to not be full.
        Assert.assertFalse(intStack.isFull());
    }
}