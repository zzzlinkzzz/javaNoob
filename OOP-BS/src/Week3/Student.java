package Week3;

public class Student {
	
	// Thuộc tính của đối tượng
	// [Quyền_truy_cập] Kiểu_dữ_liệu tên_thuộc_tính [= gtkt];
	// private, public, protected 
	private String name;
	private double score;
	
	public Student() {
	}

	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [" + name + "\t " + score + "]";
	}
	
	// Viết thêm các phương thức mới
	
	
}
