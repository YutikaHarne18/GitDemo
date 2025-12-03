package Practice;

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo d = new MethodDemo();
		String datas = d.data1();
		System.out.println(datas);
		
		data();
		
		MethodDemo1 d1 = new MethodDemo1();
		String Hi = d1.myData();
		System.out.println(Hi);
	}
	
	public String data1()
	{
		System.out.println("YutikasData1");
		return "yutika";
	}
	
	public static void data()
	{
		System.out.println("YutikasData");
	}
	
}
