
public class ProductTest {
	public static void main(String[] args) {
		Product p1=new Product("milk",40,5);
		Product p2=new Product("sugar",35,8);
		Product p3=new Product("eggs",5,25);
		System.out.println(p1.type +"   "+p1.price+"  "+p1.qty);
		System.out.println(p2.type +"   "+p2.price+"  "+p2.qty);
		System.out.println(p3.type +"   "+p3.price+"  "+p3.qty);
	}
}
