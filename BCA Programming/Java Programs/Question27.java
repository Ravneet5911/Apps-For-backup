import java.util.Scanner;
interface stack {
    boolean isEmpty();
    boolean isFull();
    void push(int x);
    void pop();
    void peek();
    void display();
}
class node implements stack{
    int top;
    int Max = 1000;
    int a[] = new int[Max];
    node() {
        top = -1;
    }
    @Override
    public boolean isEmpty() {
        return (top<0);
    }
    public boolean isFull() {
        return (top>=Max);
    }
    public void push(int x) {
        if(isFull()) {
            System.out.println("The Stack is Overflowing!\nCan't Insert");
        }
        else {
            top++;
            a[top] = x;
            System.out.println("Element Inserted in the Stack");
        }
    }
    public void pop() {
        if(isEmpty()) {
            System.out.println("The Stack is Underflowing!\nCan't Delete");
        }
        else {
            int x = a[top--];
            System.out.println("The element "+x+" is Deleted from the Stack");
        }
    }
    public void peek() {
        if(isEmpty()) {
            System.out.println("Stack is Underflow");
        }
        else {
            int x = a[top];
            System.out.println("Top Element Of the Stack is "+x);
        }
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("No Element in the Stack");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(+a[i]+" ");
        }
        System.out.println();
    }
    
}
public class Question27 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        node obj = new node();
        mainLoop:
        while(true) {
            System.out.println("1. Push an Element in the Stack");
            System.out.println("2. Pop an Element from the Stack");
            System.out.println("3. See the top Element of the Stack");
            System.out.println("4. Dispay the Stack");
            System.out.println("5. Exit");
            System.out.println("\nEnter Your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter the element you want to add in the Stack");
                int ele = sc.nextInt();
                obj.push(ele);
                break;

                case 2:
                obj.pop();
                break;

                case 3:
                obj.peek();
                break;

                case 4:
                obj.display();
                break;

                case 5:
                break mainLoop;

                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
