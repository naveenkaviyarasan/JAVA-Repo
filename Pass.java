class PassArgument{
Pass obj;
PassArgument(Pass obj){
this.obj=obj;
}
void display(){
System.out.println(obj.data);
}
}
class Pass{
int data=10;
Pass(){
PassArgument b=new PassArgument(this);
b.display();
}
public static void main(String args[]){
Pass a=new Pass();
}
}