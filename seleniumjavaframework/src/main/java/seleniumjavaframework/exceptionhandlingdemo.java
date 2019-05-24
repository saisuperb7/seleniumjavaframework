package seleniumjavaframework;

public class exceptionhandlingdemo {

	public static void main(String[] args) {
		
	try {
		demo();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("escaped");
		System.out.println("message is: " +e.getMessage());
		System.out.println("cause is:" +e.getCause());
		e.printStackTrace();
	}
}
	

	public static void demo() throws Exception
	{
	
	
	System.out.println("hello");
	
	int i =1/0;
	
	System.out.println("completed");
	
	
	
	/*System.out.println("escaped");
	System.out.println("message is: " +exp.getMessage());
	System.out.println("cause is:" +exp.getCause());*/
	//exp.printStackTrace();

}
}