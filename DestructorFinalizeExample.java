class DestructorFinalizeExample{
public static void main(String args[]){
System.out.println("Finalize method in Destructor");
DestructorFinalizeExample obj = new DestructorFinalizeExample();
obj.finalize();
}
protected void finalize(){
System.out.println("Constructor is Destroyed by finalize method");
}
}