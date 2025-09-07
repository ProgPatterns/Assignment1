import java.util.Stack;
import java.util.Scanner;

public class StackExercise {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Please enter names for your list of names. (enter # to quit)");
            String names = input.nextLine();
            if(names.matches("#"))
                break;
            myStack.push(names);//add the name in the stack
        }

        //remove the names from the stack and print them until
        //the stack is empty
        while(!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
