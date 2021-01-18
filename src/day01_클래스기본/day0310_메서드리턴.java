package day01_클래스기본;

class Student{
	int hakbun;
	int score;
	void print() {
		System.out.println(hakbun + " " + score);
	}
}

class StudentManager {
	Student student;
	void setStudentValue1(int x, int y) {
		student = new Student();
		student.hakbun = x;
		student.score = y;
	}
	
	Student setStudentValue2(int x, int y) {
		Student st = new Student();
		st.hakbun = x;
		st.score = y;
		return st;
	}
}
public class day0310_메서드리턴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager mng = new StudentManager();
		mng.setStudentValue1(10001, 30);
		mng.student.print();
		System.out.println("=========================");
		Student st = mng.setStudentValue2(10001, 30);
		st.print();
		
	}
}