import java .util.*;
public class TestDequeueCollection
{
	public static void main(String args[])
	{
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautham");
		deque.add("karan");
		deque.add("sarni");
		deque.add("Nivethitha");
		System.out.println(deque);
		//deque.removeAll(deque);
		System.out.println("*"+deque.peek());
		System.out.println("*"+deque.element());
		for(String s:deque)
		{
			System.out.println(s);
		}
	}
}