package hmllm;

import java.util.Iterator;

/**
 * MapIterator
 * 
 * Class that creates an iterator for the keys in the linked
 * list map. Iterates through the nodes of the linked list and
 * returns the key values.
 * 
 * @author Marion Geary
 * CSCI 245, Wheaton College, Fall 2021
 * October 6, 2021
 */
public class MapIterator implements Iterator<String> {
	
	/**
	 * The head of the list.
	 */
	private MapNode head;
	
	/**
	 * Constructor.
	 * @param hd The head of the list.
	 */
	public MapIterator(MapNode head) {
		this.head = head;
	}
	
	/**
	 * Return boolean indicating whether or not 
	 * there is a next node in the list.
	 * @return Boolean indicating whether there is
	 * another node in the list.
	 */
	public boolean hasNext() {
		if(head == null)
			return false;
		return true;
	}

	/**
	 * Return the value of the key and move to the next node
	 * in the list.
	 * @return The key stored in the next node.
	 */
	public String next() {
		String ret = head.getKey();
		head = head.getNext();
		return ret;
	}
	
	

}
