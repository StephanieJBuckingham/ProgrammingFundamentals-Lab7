/* Exercise 2
 * 
 * Modify the LinkedStack class to include a new method called removeBottomHalf,
 * which removes the half of elements sitting at the bottom of the stack.
 * Test the method using the Driver program. 
 * 
 * What is the time complexity of this method? o((n-i) x 0.5n) or O(n)^2
 * Every time an element is removed from the list the indexes must be reordered.
 * Elements are removed n/2 times because we want half of the list. The big-O notation 
 * then would be O(n)^2.
 */


import java.util.Stack;

public class LinkedStack extends Stack<Integer> {

	public static void main(String[] args) {

	}

// create method calledBottomHalf and pass LinkedStack linkStack to it
	static LinkedStack removeBottomHalf(LinkedStack linkedStack) {

		// push integers back into linkedStack
		linkedStack.push(1);
		linkedStack.push(7);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(2);

		// print out label
		System.out.print("Bottom half of LinkedStack: ");
		
		// determine the size of half of the stack
		int i = (linkedStack.size()/2);
		
		// loop to remove last half of elements
		while (!(linkedStack.size() == i)) {
			linkedStack.remove(linkedStack.size() - 1);
		}
		// print out bottom half of elements
		System.out.print(linkedStack);

		// return new linkedStack
		return linkedStack;
	
	}
}

