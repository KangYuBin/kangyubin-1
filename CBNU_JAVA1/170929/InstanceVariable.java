
class Student {
	int m_nKor;
	int m_nEng;
	int m_nMat;
	static String g_strTeacher = "김구";
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.m_nEng = 40;
		obj.m_nMat = 50;
		System.out.println("obj의 국어점수 = " + obj.m_nKor);
		System.out.println("obj의 수학점수 = " + obj.m_nMat);
		System.out.println("obj의 영어점수 = " + obj.m_nEng);
		System.out.println("Student의 선생님= " + Student.g_strTeacher);
		System.out.println("obj의 선생님= " + obj.g_strTeacher);
		Student.g_strTeacher = "안중근";
		System.out.println("obj의 선생님= " + obj.g_strTeacher);
	}
}
