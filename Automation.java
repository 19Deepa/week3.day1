package week3.Day1.Assignments;

public class Automation implements Language,TestTool {

	
	public void selenium() {
		System.out.println("Selenium is Great");
	
	}

	public void java() {
		System.out.println("JAVA is Great");
		
	}


	public static void main(String[] args) {
		
Language obj =new Automation();
obj.java();

TestTool obj1=new Automation();
obj1.selenium();


}

	
}
