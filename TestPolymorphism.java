class Bank{
float getRateofInterest(){return 0;}
}
class SBI extends Bank{
float getRateofInterest(){return 8.4f;}
}
class ICICI extends Bank{
float getRateofInterest(){return 7.4f;}
}
class AXIS extends Bank{
float getRateofInterest(){return 8.4f;}
}
class TestPolymorphism{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("SBI Rate of Interest:"+b.getRateofInterest());
b=new ICICI();
System.out.println("SBI Rate of Interest:"+b.getRateofInterest());
b=new AXIS();
System.out.println("AXIS rate of Interest:"+b.getRateofInterest());

b=new Bank();
System.out.println("The main class :"+b.getRateofInterest());
}
}