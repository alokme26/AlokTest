
public class AccountTest {
	public static void main(String[] args) {
		Account a1=new Account();
		System.out.println(a1.AccountNumber+","+a1.name);
		Account a2=new Account(20235619650l,"Alok");
		System.out.println(a2.AccountNumber+","+a2.name);
	}
}
