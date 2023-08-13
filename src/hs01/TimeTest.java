package hs01;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour (int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}
	//command option m : extract method by refactoring
	private boolean isNotValidHour(int hour) {
		return hour<0 || hour > 23;
	}
	
	public int getHour() {return hour;}
	
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 21 // error
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(41);
		System.out.println(t.getHour());
	}

}
