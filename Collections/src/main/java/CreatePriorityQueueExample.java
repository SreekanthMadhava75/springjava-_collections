import java.util.PriorityQueue;

public class CreatePriorityQueueExample {

	// Create a Priority Queue
    PriorityQueue<Integer> numbers = new PriorityQueue<>();

    public void addNum(Integer num) {
    	numbers.add(num);
    }
    
 // Remove items from the Priority Queue
    
    public void removeItem() {
    	while (!numbers.isEmpty()) {
			System.out.println(numbers.remove());
		}
    }
}
