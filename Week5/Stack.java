class Stack {

    private int top, size;
    private int[] stk;

    Stack() {
        size = 1;
        top = -1;
        stk = new int[1];
    }

    private void resize(int newsize) {
        int[] arr = new int[newsize];
        for (int i = 0; i <= top; i++)
            arr[i] = stk[i];
        stk = arr;
        size = newsize;
    }
    void push(int data) {
        if (top+1 == size)
            resize(size*2);
        stk[++top] = data;
    }
    int pop() {
        if (top == -1)
            throw new RuntimeException("Stack underflow");
        return stk[top--];
    }
}
