
public class FlightDetailTest {
	public static void main(String[] args) {
		FlightDetail f1=new FlightDetail();
		System.out.println(f1.airlinesName +","+f1.deptname +","+f1.arrvTime +","+f1.fare);
		FlightDetail f2=new FlightDetail("AirIndia","2AM","2PM",5850);
		System.out.println(f2.airlinesName +","+f2.deptname +","+f2.arrvTime +","+f2.fare);
	}
}
