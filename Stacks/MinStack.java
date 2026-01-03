package Stacks;

class MinStack {

    int[] arr = new int[100];
    int[] minArr = new int[100];
    int idx = 0;

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        arr[idx] = val;

        if (idx == 0) {
            minArr[idx] = val;
        } else {
            minArr[idx] = Math.min(val, minArr[idx - 1]);
        }

        idx++;
    }

    public void pop() {
        if (idx == 0) return;
        idx--;
    }

    public int top() {
        if (idx == 0) return -1;
        return arr[idx - 1];
    }

    public int getMin() {
        if (idx == 0) return -1;
        return minArr[idx - 1];
    }
}

