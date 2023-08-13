//main method for Project1 where user pushes,pops ... elements in the stack

//import statements
import java.util.ArrayList;
import java.util.Scanner;

public class StackDriver <T> extends ArrayBoundedStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//create a arratBoundedStack "stack"
		ArrayBoundedStack<String> stack = new ArrayBoundedStack<>();
					
		System.out.println("The stack is empty.");
		
		//infinite loop
		while(true) {
			//switch statement takes input as argument for command
			switch(input.next()) {
				//push case which pushes elements in to stack
				case "push": 
					String a = input.nextLine();
					String[] str = a.split(" ");
					for (int i=1; i< str.length; i++) {
						stack.push(str[i]);
					}
					System.out.println(stack);
					break;
				// pop command which pops top element from the stack
				case "pop":
					stack.pop();
					if(stack.isEmpty())
						System.out.println("The stack is empty.");
					else
						System.out.println(stack);
					break;
				//top command which displays top element of the stack
				case "top":
					if(stack.isEmpty())
						System.out.println("The stack is empty.");
					else
						System.out.println(stack.top());
					break;
				// pops elements from top of  stack , number of elements depends on the user input
				case "popSome":
					stack.popSome(input.nextInt());
					if(stack.isEmpty())
						System.out.println("The stack is empty.");
					else
						System.out.println(stack);
					break;
				// swapStart replaces top two elements
				case "swapStart":
					stack.swapStart();
					System.out.println(stack);
					break;
				//pops the topmost element and prints its value
				case "poptop":
					if(stack.isEmpty())
						System.out.println("The stack is empty.");
					else
						System.out.println("Just popped: " + stack.poptop() + "\n" + stack);

					break;

			}
		}
		
	}
}
