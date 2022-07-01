package week3.Day1.Assignments;

public class Students {
	void getStudentInfo() {
		System.out.println("Good Students");
	}
    void getStudentInfo(int d) {
    	System.out.println("The Student ID is "+d);
    }
    
    void getStudentInfo(int d2, String N) {
    	System.out.println("StudentInfo " +d2+N);
    }
    
    void getStudentInfo(String e, Long L) {
    	System.out.println("Email & Phone Numeber -->"+e+L);
    	
    }
    public static void main(String[] args) {
		Students obj =new Students();
		obj.getStudentInfo();
		obj.getStudentInfo(96071);
		obj.getStudentInfo(123,"Deepa");
		obj.getStudentInfo("deep@gmail.com", 9328924839L);
		
	}
}
