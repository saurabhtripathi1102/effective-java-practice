package memoryleak;

import java.util.EmptyStackException;

public class LeakyStack {

    private Object[] arr;
    private int top;
    private int capacity;

    public static void main(String[] args) {
        System.out.println("=== LEAKY POP DEMO ===");
        LeakyStack leaky = new LeakyStack(5);
        leaky.push(10);
        leaky.push(20);
        leaky.push(30);
        System.out.println("Popped: " + leaky.pop());
        System.out.println("Popped: " + leaky.pop());
        leaky.display();

        System.out.println("\n=== FIXED POP DEMO ===");
        LeakyStack fixed = new LeakyStack(5);
        fixed.push(10);
        fixed.push(20);
        fixed.push(30);
        System.out.println("Popped: " + fixed.popFixed());
        System.out.println("Popped: " + fixed.popFixed());
        fixed.display();
    }

    public LeakyStack(int capacity){
        this.capacity = capacity;
        arr = new Object[capacity];
        top =-1;
    }

    public void push(int val){
        if(top==capacity-1){
            System.out.println("Stack overflow ! can't push "+val);
            return;
        }
        arr[++top]=val;
        System.out.println("Value pushed : "+val);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return (int) arr[top--];
    }

    public int popFixed(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object res = arr[top];
        arr[top--] = null;
        return (int) res;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return (int) arr[top];
    }

    public int size(){
        return top+1;
    }

    private boolean isEmpty() {
        return top ==-1;
    }

    public void display(){
        System.out.println("Internal array state:");
        for (int i = 0; i < capacity; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }


}
