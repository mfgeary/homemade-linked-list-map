package hmllm;

/**
 * MapNode
 * 
 * The Node class to create a Map via a LinkedList. Each node holds
 * a key, a value, and a link to another node.
 * @author Marion Geary
 * 
 * Wheaton College, Fall 2021, CSCI 245
 * October 2, 2021
 */
public class MapNode {
	
	/**
	 * The String holding the key in the map.
	 */
	private String key;
	
	/**
	 * The String holding the value in the map.
	 */
	private String value;
	
	/**
	 * The node linking to another node.
	 */
	private MapNode next;
	
	/**
	 * Constructor to create the node to build a linked list map.
	 * Contains key, value, and link to another node.
	 * @param key The key in the map.
	 * @param value The value stored in the map.
	 * @param link The next node in the linked list map.
	 */
	public MapNode(String key, String value, MapNode next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	/**
	 * Get the next MapNode in the list.
	 * @return The next MapNode.
	 */
	public MapNode getNext() {
		return next;
	}

	/**
	 * Set the next MapNode in the list.
	 * @param next The MapNode to follow the current node.
	 */
	public void setNext(MapNode next) {
		this.next = next;
	}

	/**
	 * Get the value in the map.
	 * @return The value stored in the node.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set the value in the node.
	 * @param value The value to set in the node.
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Get the key in the map.
	 * @return The key stored in the node.
	 */
	public String getKey() {
		return key;
	}

}
