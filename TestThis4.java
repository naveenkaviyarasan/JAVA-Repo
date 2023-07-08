class Invoke {
void m(){
System.out.println("hello m");
}
void n(){
	System.out.println("hello n");
	this.m();
}
}
class TestThis4{
	public static void main(String args[]){
	Invoke a=new Invoke();
	a.n();
}
}