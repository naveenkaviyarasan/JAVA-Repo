//priority Queue

import java.util.*;
public class TestjavaPriorityQueue {
public static void main(String args[]){
priorityQueue<String> queue = new PriorityQueue<String>();

queue.add("Amit Sharma");
queue.add("Virat");
queue.add("Rohit Sharma");
queue.add("Modi");

System.out.println("head:"+queue.element());
System.out.println(queue);
System.out.println("head:"+queue.peek());
System.out.println(queue);
System.out.println("iterrating the queue element ");
Iterator itr = queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
System.out.println(queue);
queue.remove();
System.out.println(queue);
queue.poll();
System.out.println(queue);
System.out.println("After removeing two elements :");
Iterator <String> itr2 = queue.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
System.out.println(queue);
}
}










