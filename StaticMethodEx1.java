class StaticMethodEx {

	int rollno;
	String name;
	static String college = "KG";

	static void change(){

		college = "NGP";
	}	

	StaticMethodEx(int r, String n) {

		rollno = r;
		name = n;

	}

	void display() {

		System.out.println(rollno + " " + name + " " + college);
	}
}

class StaticMethodEx1 {
	public static void main(String args[]) {

		StaticMethodEx.change();

		StaticMethodEx s1 = new StaticMethodEx(111, "Barath");
		StaticMethodEx s2 = new StaticMethodEx(222, "Praveen");
		StaticMethodEx s3 = new StaticMethodEx(333, "Naveen");

		s1.display();
		s2.display();
		s3.display();
	}
}