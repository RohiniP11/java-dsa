package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int size;

public ArrayStack(int size){
    this.size = size;
    stack = new int[size];
    top = -1;
}
public void push(int x){
    if(top == size - 1){
        System.out.println("Stack OverFlow");
        return;
    }
    top++;
    stack[top] = x;
}

public int pop(){
    if(isEmpty()){
        System.out.println("Stack is UnderFlow");
        return -1;
    }
    int popped = stack[top];
    top--;

    return popped;
}


public int top(){
    if(isEmpty()) {
        System.out.println("Stack is Empty");
        return -1;
    }

    return stack[top];
}

public boolean isEmpty(){
    return top == -1;
}

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of stack: ");
    int size = sc.nextInt();

    ArrayStack stack = new ArrayStack(size);

    int choice;

    do {
        System.out.println("----STACK MENU----");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Top");
        System.out.println("4. Check Empty");
        System.out.println("5. Display");
        System.out.println("6. Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter element to Push: ");
                int x = sc.nextInt();

                stack.push(x);
                break;

            case 2:
                int popped = stack.pop();

                if (popped != -1){
                System.out.println("Popped Element: " + popped);
                }

                break;

            case 3:
                int topElement = stack.top();

                if(topElement != -1){
                    System.out.println("Top Element is : " + topElement);
                }

                break;

            case 4:
                if(stack.isEmpty()){
                    System.out.println("Stack is Empty");
                }
                else{
                    System.out.println("Stack is not Empty");
                }

                break;

            case 5:
                stack.display();
                break;

            case 6:
                System.out.println("Exiting the Program!!!!");
                break;

        }

    } while(choice != 6);

       sc.close();


}

}

