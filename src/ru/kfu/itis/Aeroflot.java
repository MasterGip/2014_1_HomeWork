package ru.kfu.itis;

public class Aeroflot {
	private String begin;
	private String end;
	private int number;
	private String type;
	
	public String getBegin() {
		return begin;
	}

	public String getEnd() {
		return end;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public Aeroflot(String begin, String end, int number, String type) {
		
		this.begin = begin;
		this.end = end;
		this.number = number;
		this.type = type;
	}
	
	public void show(){
		System.out.println(begin + "\n" + end + "\n" + number + "\n" + type + "\n");
	}
	
	

}
