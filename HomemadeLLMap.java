package hmllm;

import java.util.Iterator;

/**
 * HomemadeLLMap
 * 
 * An implementation of the HomemadeMap class that uses
 * a completely-homemade linked list on the inside.
 * 
 * @author Thomas VanDrunen
 * @author Marion Geary
 * CSCI 245, Wheaton College, Fall 2021
 * October 6, 2021
 */

public class HomemadeLLMap implements HomemadeMap {

	/**
	 * The first node in the list.
	 */
	private MapNode head;
	
    /**
     * Test whether an association exists for this key.
     * @param key The key to remove
     * @return true if there is an association for this key, false otherwise
     */
    public boolean containsKey(String key) {
    	if (findKey(key) == null)
    		return false;
    	return true;
    }

    /**
     * Add an association to the map.
     * @param key The key to this association
     * @param val The value to which this key is associated
     */
    public void put(String key, String val) {
    	if (findKey(key) == null) {
    		head = new MapNode(key, val, head);
    	}
    	findKey(key).setValue(val);
    }

    /**
     * Helper function for contains key and put to find
     * the node that contains the key (if it exists).
     * @param key The key you are trying to find in the 
     * Linked List Map.
     * @return The node that contains the key (or null if 
     * it doesn't exist).
     */
    public MapNode findKey(String key) {
    	MapNode place = head;
    	while (place != null) {
    		if (place.getKey().equals(key))
    			return place;
    		else
    			place = place.getNext();
    	}
    	return null;
    }

    /**
     * Get the value for a key.
     * @param key The key whose value we're retrieving.
     * @return The value associated with this key, null if none exists
     */
    public String get(String key) {
    	if (findKey(key) == null)
    		return null;
    	return findKey(key).getValue();
    }

    /**
     * Get an iterator for all the keys in this map.
     * @return An iterator over the set of keys.
     */
    public Iterator<String> keyIterator() {
    	return new MapIterator(head);
    }

    /**
     * Remove the association for this key.
     * @param key The key to remove
     */   
    public void remove(String key) {
    	MapNode place = head;
	    MapNode ret = findKey(key);
	    if (ret != null) {
	    	if (place == ret)
	    		head = place.getNext();
	    	else {
		    	while (place.getNext() != ret)
		    		place = place.getNext();
		    	place.setNext(ret.getNext());
	    	}
	    } 
    }
}
