/**
 * A SkipList implementation with a search method.
 * @author Ben Gaudreau
 * @version Nov. 15 2023
 */
public class containsSL extends SkipList{
	
	/**
	 * Constructs a new containsSL.
	 */
	public containsSL() {
		super();
	}
	
	/**
	 * Search a containsSL for the given value.
	 * @param value The element to search for.
	 * @return true if the element is in the containsSL.
	 */
	public boolean contains(T value) {
		SkipListNode<T> currNode = header;
		SkipListNode<T> prevNode = header;
		int searchResult;
		
		for (int i = SkipList.MAX_LEVEL; i > 0; i--) {
			while (currNode.forward[i] != null) {
				currNode = currNode.forward[i];
				searchResult = currNode.value.compareTo(value);
				if (searchResult == 0)
					return true;
			}
			if (searchResult < 0) {
				prevNode = currNode;
			}
			else {
				currNode = prevNode;
			}
		}
		return false;
	}
}
