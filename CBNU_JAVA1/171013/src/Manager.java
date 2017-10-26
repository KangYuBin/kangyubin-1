public class Manager extends Employee {
	private String position; // 직책

	// 매개변수 4개를 갖는 생성자
	public Manager(String empNo, String name, String part, String position) {
		setEmpNo(empNo);
		setName(name);
		setPart(part);
		this.position = position;
	}

	// 관리자에서 추가되는 정보를 결과 문자열로 결합
	public String addStr() {
		String result = "";
		result += "직책 : " + position + "\n";
		return result;
	}
}
