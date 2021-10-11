package Task2;

public class Task2 {
	
	
	
	public int AddTheValue(int a, int b) {
		int c=a+b;
		
		System.out.println(c);
		return c;
		
	}

	public void AddTheValue2(int c, int d) {
		
		int f=c+d;
		System.out.println(f);
		
	
		
		
	}
	
	public static void main(String[] args) {
		
		Task2 r = new Task2();
		int f=r.AddTheValue(10, 20);
		 r.AddTheValue2(f, 30);
		
		
	}
	
	
}
