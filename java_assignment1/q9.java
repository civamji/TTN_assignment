public class q9{

	public enum houseName{
	A(10000),B(20000),C(30500),D(15000),E(20500);
	private int p;
	houseName(int price)
	{
		p=price;
	}
	int getPrice()
	{
		return p;

	}
	}
	public static void main(String[] args)
	{
		System.out.println("House Name :Price");
		System.out.println(houseName.A+":\t"+houseName.A.getPrice()+"Rupees");
		System.out.println(houseName.B+":\t"+houseName.B.getPrice()+"Rupees");
		System.out.println(houseName.C+":\t"+houseName.C.getPrice()+"Rupees");
		System.out.println(houseName.D+":\t"+houseName.D.getPrice()+"Rupees");
		System.out.println(houseName.E+":\t"+houseName.E.getPrice()+"Rupees");
		

	}
}