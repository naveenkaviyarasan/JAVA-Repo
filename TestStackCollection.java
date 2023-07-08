import java.util.*;
class TestStackCollection{
public atatic void main(String args[]){
Stack<String> list = new Stack<String>();
list.push("Ravi");
list.push("Ganesh");
list.pop();
list.push("Hari");
list.push("Naveen");

System.out.println(list.size());
System.out.println(list);
System.out.println(list.get(1));
System.out.println(list.contains("Ravi"));
System.out.println(list.set(2,"Naveen"));
Collections.sort(list);
System.out.println(list);
System.out.println(list.isEmpty());
list.removeAll(list);
System.out.println(list);
System.out.println(list.isEmpty());

}
}




