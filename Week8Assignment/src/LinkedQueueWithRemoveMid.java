
public class LinkedQueueWithRemoveMid {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueueWithRemoveMid() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}



public void removeMiddle() {
	
	int length = 0, spot;
	
	LinkedNode newNode = front;
	LinkedNode middle = front;
	LinkedNode lastMiddle = middle;
	 //checks to see if array is of even length
	while (newNode != null) {
		length++;
		if (length %2 == 0) {
			lastMiddle = middle;
			middle = middle.next;
		}
		
		newNode = newNode.next;
	}
	
	if (length % 2 == 0) {
		lastMiddle = middle;
		spot = length/2;
	}
	else
		spot = length/2 + 1;
	
	System.out.println("The middle number in the array is: " + middle.x); //prints middle value of array
	
	newNode = front;
	length = 0;
	if(spot == 1) {
		front = front.next;
	}
	else { //if array is not of even length, assigns middle position to number after removing a value to make even
		while (newNode != null) {
			length++;
			
		if (length == spot -1) {
			newNode.next = newNode.next.next;
			break;
		}
		newNode = newNode.next;
		}
	}
	System.out.println("Removed values: ");
	newNode = front;
	length = 0;
	while(newNode != null) {
		length++;
		System.out.println("Value is: " + newNode.x);
		newNode = newNode.next;
	}
}
}