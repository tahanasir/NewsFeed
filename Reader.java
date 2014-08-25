/**
 * Class that reads news items 
 */
public class Reader {

	/*attribute declarations for feed and nextItem */
	private Feed feed;
	private int nextItem;
	
	/**
	 * Constructor initializes feed 
	 * @param feed reader will read this feed
	 */
	public Reader (Feed feed){
		this.feed = feed;
		}
	
	/**getFeed method returns feed
	 * @return feed followed by blank
	 */ 
	//getter method for feed
	public void getFeed(Feed feed) {
		this.feed = feed;
	}
	
	/**getNextItem method returns the next item in the feed
	 * @return nextItem followed by blank
	 */ 
	//getting method for nextItem
	public void getNextItem(int nextItem) {
		this.nextItem = nextItem;
	}
	
	/**
	 * Prints all news items in the feed that contain a pattern
	 * @param pattern check to see if a pattern is in the feed
	 * @throws  
	 */
	public void find(String pattern) {
		feed.find(pattern);
		}
	
	/** 
	  * Prints all news items that have been added to the feed 
	  * since the last call to read by this Reader
	 */
	public void read() {
		nextItem = feed.readFrom(nextItem);
	}
}