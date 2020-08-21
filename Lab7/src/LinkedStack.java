/* Exercise 2
* 
* Modify the LinkedStack class to include a new method called removeBottomHalf,
* which removes the half of elements sitting at the bottom of the stack.
* Test the method using the Driver program. 
* 
* What is the time complexity of this method? O(N)
* In order to remove the last element the computer must traverse through all of the
* nodes in the linked stack. 
*/

// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	public void removeBottomHalf() {

		// initializing half to equal half of element in LinkedStack
		int half = count / 2;

		// if statement to avoid error message if stack is empty
		if (isEmpty()) {
			System.out.println("Linked stack is empty.");
		}

		// loop to remove half of elements in LinkedStack
		for (int i = 0; i < half; i++) {

			// assign two pointers which can traverse list
			LinkedNode last = front;
			LinkedNode previousToLast = null;

			// while loop that checks if last is the last node in list
			// if not moves previousToLast to same element as last
			// then moves last pointer to next element
			while (last.next != null) {
				previousToLast = last;
				last = last.next;
			}

			// removes last node from linked stack
			previousToLast.next = null;
		}
	}
}