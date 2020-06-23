
public class Website {
	Flightddetail[] getFlightddetails(){
		Flightddetail f1=new Flightddetail ("indigo","11.15","15.30",5000);
		Flightddetail f2=new Flightddetail ("lufthansa","12.15","19.30",8000);
		Flightddetail f3=new Flightddetail ("airway","02:00","22:30",13000);
		Flightddetail[] fdarr= {f1,f2,f3};
return fdarr;
}
	public static void main(String[] args) {
		Website w=new Website ();
		Flightddetail[] farr=w.getFlightddetails();
		for (Flightddetail f: farr)
		{
			System.out.println(f.airlinesName);
			System.out.println(f.arrvTime);
			System.out.println(f.deptname);
			System.out.println(f.fare);
		}
	}
}
