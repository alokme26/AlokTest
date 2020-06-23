
public class Car {
String clr;
void Start()
{
	System.out.println(this.clr +" "+ "car starts");	
}
public static void main(String[] args) {
	Car c1=new Car();
	c1.clr="Red";
	c1.Start();
	Car c2=new Car();
	c2.clr="Blue";
	c2.Start();
	
}



}
