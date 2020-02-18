abstract class Bank{
	float rateofinterest;
	String branchname;
	public abstract void getdetails();

}
class SBI extends Bank{
	public void getdetails()
	{
		rateofinterest=20.0f;
		branchname="palam";
		System.out.println("Rate of interest of SBI bank is : "+rateofinterest);
		System.out.println("Branch name of SBI bank is : "+branchname);
		
	}
	
}
class BOI extends Bank{
		public void getdetails()
	{
		rateofinterest=30.22f;
		branchname="wazirabad";
		System.out.println("Rate of interest of SBI bank is : "+rateofinterest);
		System.out.println("Branch name of SBI bank is : "+branchname);
		
	}
}
class ICICI extends Bank{
		public void getdetails()
	{
		rateofinterest=50.21f;
		branchname="sarojninagar";
		System.out.println("Rate of interest of SBI bank is : "+rateofinterest);
		System.out.println("Branch name of SBI bank is : "+branchname);
		
	}
}
public class q11{
	 public static void main(String[] args) {
	Bank b=new SBI();
	b.getdetails();
	System.out.println("");
	b=new BOI();
	b.getdetails();
	System.out.println("");
	b=new ICICI();
	b.getdetails();
	}
}