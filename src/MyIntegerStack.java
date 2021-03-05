public class MyIntegerStack {

    private final int[] intStack;   // Stack that stores integers.
    private int currentIndex; // Index referencing top of stack.
    private final int intSize;      // Size of stack.

    /**
     * Default constructor for Stack.
     * Default size is 10.
     */
    public MyIntegerStack() {
        intSize = 10;
        intStack = new int[intSize];
        currentIndex = -1;
    }

    /**
     * Constructor that allows users to customize size.
     */
    public MyIntegerStack(int intSize) {
        this.intSize = intSize;
        intStack = new int[intSize];
        currentIndex = -1;
    }

    public void push(int newInt) {
        if (!isFull()) {
            currentIndex++;
            intStack[currentIndex] = newInt;
        } else {
            System.out.println("Can't add " + newInt + "! Max Capacity!");
        }
    }

    public void pop() {
        if (!empty()) {
            currentIndex--;
        } else {
            System.out.println("Nothing to pop in stack!");
        }
    }

    public int peek() {
        return intStack[currentIndex];
    }

    public boolean empty() {
        return currentIndex == -1;
    }

    public boolean isFull() {
        return currentIndex == intSize - 1;
    }
}
