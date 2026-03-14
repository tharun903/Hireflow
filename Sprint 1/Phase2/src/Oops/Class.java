package Oops;
import java.util.*;
public class Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		int score = sc.nextInt();
		Student s1 = new Student(id,score);
		s1.display();
		

	}

}
class Student{
	private int id;
	private int score;
	public Student(int id,int score) {
		this.id = id;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public int getScore() {
		return score;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setScore(int score) {
		this.score = score;
	}
	void display() {
		System.out.println(id+"-"+score);
	}
	
}
