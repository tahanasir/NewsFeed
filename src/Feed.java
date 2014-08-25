/**
 * Class that publishes news items 
 * @author Taha Nasir
 */
public class Feed {
	
	/* Attribute declarations for name, list, size and constant */
	private String name; 
	private String List[];
	private int size;
	private final int DEFAULT_MAX_ITEMS = 10; // default size of array
	
	/**
	 * Constructor creates String array of default size 
	 * @param name name of list
	 */
	public Feed(String name) {
		this.name = name;
		List = new String[DEFAULT_MAX_ITEMS];
		size = 0;
	}
	
	/** Constructor creates String array of specified size 
	 * @param name name of list
	 * @param max maximum size of array
	 */
	public Feed(String name, int max) {
		this.name = name;
		List = new String[max];
		size = 0;
	}
	
	/**getName method returns the item's name 
	 * @return name followed by blank
	 */ 
	public String getName() {
		return name;
	}
	
	/**getSize method returns the item's size
	 * @return size followed by blank
	 */
	public int getSize() {
		   return size ;
	}
	
	//toString method returns a string representation of all items in the list
	public String toString(){
		String s = "";
		for (int i = 0; i < size; i++){
			s = s + List[i].toString() + "\n";
		}
		return s;
	}
	
	/**
	 * add method adds an item to the list
	 * @param item a news item in the news feed
	 */
	public void add (String item) {
		if (size == List.length)
			expandCapacity();
		List[size] = item;
		size++;
	}
		
	

	/**
	 * expandCapacity method is a helper method
	 * that creates a new array to store friends with twice the capacity
	 * of the existing one
	 */
	private void expandCapacity() {
		String[] largerList = new String[List.length * 2];
		for (int i = 0; i < List.length; i++)
			largerList[i] = List[i];
		List = largerList;	
	}
	
	/**
	 *  Prints all the news items in the list that contain a pattern
	 *  @param pattern check to see if a pattern is in the list
	 */
	 public void find(String pattern) {	
		 
		 for (int i=0; i<size; i++) {
			 if(List[i].contains(pattern)) {
				 System.out.println(name + ": " + List[i]);
			 }
		 }
	 }
	  
	 /** 
	  * Prints all news items in the list starting at the index,
	  * and going through the last string in the list
	  * returns the number of elements in the list 
	  * @param start index */
	 public int readFrom(int start) {
		 for (int i=start; i<size; i++) {
			 System.out.println(name + ": " + List[i]);
			 }
		 return size;
	 }	 
}