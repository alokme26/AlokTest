
public class AccTest {
	public static void main(String[] args) {
		AccountDetail ac1=new AccountDetail(20235619650l, "Alok Ranjan", 250000.25);
		AccountDetail ac2=new AccountDetail(20235642348l, "Saurabh", 950000.56);
		AccountDetail ac3=new AccountDetail(20235789666l, "Prabhat", 850000.87);
		System.out.println(ac1.accNumber+","+ ac1.name+"," +ac1.balance);
		System.out.println(ac2.accNumber+","+ ac2.name+"," +ac2.balance);
		System.out.println(ac3.accNumber+","+ ac3.name+"," +ac3.balance);
	}
}

