public class ListNode {
	
	private Object value;
	private ListNode next, prev;
	
	public ListNode(Object initValue, ListNode initNext, ListNode initPrev)
	{
		value = initValue;
		next = initNext;
		prev = initPrev;
	}
	
	public Object getValue()
	{
		
		return value;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setNext(ListNode newNext)
	{
		next = newNext;
	}
	
	public void setValue(Object newValue)
	{
		value = newValue;
	}
	
	
	public ListNode getPrev() {
		return prev;
	}
	
	public void setPrev(ListNode newPrev)
	{
		prev = newPrev;
	}
	
	
}