/* Exercise 1
 * 
 * Create a new Driver class with a main method. In this method, do the following:
 * 1. Create an instance of an ArrayStack and a LinkedStack class.
 * 2. Push the following int's onto the two stacks: (1,7,3,4,9,2)
 * 3. Pop off all the elements from the stacks, displaying each int as it's removed
 * 
 * Exercise 2
 * 
 * Modify the LinkedStack class to include a new method called removeBottomHalf,
 * which removes the half of elements sitting at the bottom of the stack.
 * Test the method using the Driver program. 
 */

public class Driver {

	public static void main(String[] args) {

		ArrayStack arrayStack = new ArrayStack();
		LinkedStack linkedStack = new LinkedStack();

		// push integers onto stack
		arrayStack.push(1);
		arrayStack.push(7);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(9);
		arrayStack.push(2);

		// print out ArrayStack
		System.out.println("ArrayStack = " + arrayStack);

		// while loop to pop off each integer one by one
		int i = 1;
		while (!arrayStack.isEmpty()) {
			System.out.println("Step " + i + " pop off integer " + arrayStack.pop());
			i++;
		}

		// print message that stack is empty
		System.out.println("Stack is now empty. \n");

		// push integers onto linkedStack
		linkedStack.push(1);
		linkedStack.push(7);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(2);

		// print out linkedStack
		System.out.println("LinkedStack = " + linkedStack);

		// while loop to pop off each integer one by one
		while (!linkedStack.isEmpty()) {
			System.out.println("Step " + i + " pop off integer " + linkedStack.pop());
			i++;
		}

		// print message that stack is empty
		System.out.println("Stack is now empty. \n");

		// call on method removeBottomHalf and pass linkedStack
		LinkedStack.removeBottomHalf(linkedStack);
	}
}
