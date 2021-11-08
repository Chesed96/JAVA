package pack03_OOP;

import java.util.Random;

public class StudentDTO {
	
	private String name;
	private String[] subject;
	private int[] score;
	private String grade;
	private int number;
	
	
	


	public StudentDTO(String name, String[] subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public StudentDTO(String name, String[] subject, int[] score, String grade, int number) {
		super();
		this.name = name;
		this.subject = subject;
		if(subject != null) {
			this.score = new int[subject.length];
		}
		this.score = score;
		this.grade = grade;
		this.number = number;
	}

	public StudentDTO(String name, String[] subject, String grade, int number) {
		super();
		this.name = name;
		this.subject = subject;
		if(subject != null) {
			this.score = new int[subject.length];
		}
		Random r = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(100)+1;//1~100
		}
		this.grade = grade;
		this.number = number;
	}
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getSubject() {
		return subject;
	}


	public void setSubject(String[] subject) {
		this.subject = subject;
	}


	public int[] getScore() {
		return score;
	}


	public void setScore(int[] score) {
		this.score = score;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
}
