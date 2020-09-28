package practice;

public class Student {
	private String name;
	private double score;
	
	public Student() {};
	public Student (String name, double score) 
	{
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", score=" + score + "]";
	}
}
