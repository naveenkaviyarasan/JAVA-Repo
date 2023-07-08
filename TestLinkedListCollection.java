import java.util.*;
class TestLinkedListCollection{
public static void main(String args[]){
LinkedList<String> list = new LinkedList<String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Vijay");
System.out.println(list.size());
System.out.println(list);
System.out.println(list.get(1));
System.out.println(list.contains("Vijay"));
Collections.sort(list);
System.out.println(list.isEmpty());
list.removeAll(list);
System.out.println(list);
System.out.println(list.isEmpty());
Iterator<String> itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
