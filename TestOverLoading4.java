class TestOverLoading4{
public static void main(String[] args){System.out.println("main with String[]");
main("Naveen");
main();

}

public static void main(String args){System.out.println("main with String");}
public static void main(){System.out.println("main without args");}
}