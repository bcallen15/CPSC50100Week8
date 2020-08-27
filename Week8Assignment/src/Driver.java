

public class Driver {

		public static void main(String[] args) {
			
			LinkedQueueWithRemoveMid linkQueue = new LinkedQueueWithRemoveMid();
			linkQueue.enqueue(1);
			linkQueue.enqueue(7);
			linkQueue.enqueue(3);
			linkQueue.enqueue(4);
			linkQueue.enqueue(9);
			linkQueue.enqueue(2);
			linkQueue.removeMiddle();
		// remove the comment blocks to execute the enqueue for both arrays	
		/*	while (!linkQueue.isEmpty()) {
				int value = linkQueue.dequeue();
				System.out.println("Dequeued value is: " + value);
			}
			
			ArrayQ arrQ = new ArrayQ();
			
			arrQ.enqueue(1);
			arrQ.enqueue(7);
			arrQ.enqueue(3);
			arrQ.enqueue(4);
			arrQ.enqueue(9);
			arrQ.enqueue(2);
			
			while(!arrQ.isEmpty()) {
				int arrQValue = arrQ.dequeue();
				System.out.println("Dequeued value is: " + arrQValue);
			} */
			

		}
}