
public class fruit {
String type;
String clr;
fruit (String t,String c)
{
	this. clr =c;
	this. type=t;
}
public static void main(String[] args) {
fruit f1=new fruit("mango","red");
System.out.println(f1.type);
System.out.println(f1.clr);
fruit f2=new fruit("apple","green");
System.out.println(f2.type);
System.out.println(f2.clr);
}
}
