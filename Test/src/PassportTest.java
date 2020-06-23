
public class PassportTest {
public static void main(String[] args) {
	Passport p1=new Passport();
	System.out.println(p1.passportNum+","+p1.name);
	Passport p2=new Passport("abced52000","alok");
	System.out.println(p2.passportNum+","+p2.name);
}
}
