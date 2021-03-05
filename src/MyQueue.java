public class MyQueue {

    private final String[] queue;   // A string queue.
    private final int size;         // A size of the line with limits because COVID-19.
    private final int front;        // Beginning of the line.
    private int rear;         // End of the line.

    public MyQueue() {
        // Size is 5 because only 5 people are allowed in line.
        size = 5;
        queue = new String[size];
        front = 0;
        rear = 0;
    }

    public MyQueue(int size) {
        // Size is whatever the owner decides.
        this.size = size;
        queue = new String[this.size];
        front = 0;
        rear = 0;
    }

    public void enqueue(String newPerson) {
        if (!isFull()) {
            queue[rear] = newPerson;
            rear++;
        } else {
            System.out.println("Line has reached safe capacity for COVID-19!");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            rear--;
        } else {
            System.out.println("Line is empty!");
        }
    }

    public void displayQueue() {
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i] + " <--- ");
        }
        System.out.println();
    }

    public String front() {
        return queue[front];
    }

    public String rear() {
        return queue[rear - 1];
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return rear == size;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public String[] getQueue() {
        return queue;
    }
}

