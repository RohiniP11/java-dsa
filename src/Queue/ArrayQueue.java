package Queue;

import java.util.Scanner;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void push(int x){
        if(size == queue.length){
            System.out.println("Queue OverFlow!");
            return ;
        }

        rear++;
        queue[rear] = x;
        size++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Queue UnderFlow!");
            return -1;
        }

        int popped = queue[front];

        for(int i = front; i < rear; i++){
            queue[i] = queue[i+1];
        }
        rear--;
        size--;

        return popped;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }

        return queue[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }

        for(int i = front; i <= rear; i++){
            System.out.println(queue[i] + " ");
        }

        System.out.println();
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayQueue q = new ArrayQueue(5);

        int choice, value;

        do{
            System.out.println("----QUEUE MENU----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.println("Enter you choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter value: ");
                    value = sc.nextInt();
                    q.push(value);
                    break;

                case 2:
                    int popped = q.pop();
                    System.out.println("Popped element is : " + popped);
                    break;

                case 3:
                    int peeked = q.peek();
                    System.out.println("Value: " + peeked);
                    break;

                case 4:
                    if (q.isEmpty()){
                        System.out.println("Queue is empty!");
                    }
                    else{
                        System.out.println("Queue is not empty!");
                    }
                    break;

                case 5:
                    q.display();
                    break;

                case 6:
                    System.out.println("Exiting the system!");
                    break;

            }
        } while(choice != 6);


    }
}
