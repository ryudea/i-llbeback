package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {

		Time t = new Time();

		t.setHour(1987);
		int hour = t.getHour();
		System.out.println(hour);

		t.setMinute(150);
		int hour2 = t.getHour();
		int minute = t.getMinutes();
		System.out.println(hour2 + " : " + minute);

		t.setSeconds(10000);
		int hour3 = t.getHour();
		int minute2 =t.getMinutes();
		int seconds = t.getseconds();
		System.out.println(hour3 + " : " + minute2 + " : " + seconds);

	}

}

class Time {

	private int hour; 
	private int minute;
	private int second;

	void setHour(int hour) { // 4,6
		this.hour = hour % 24;
	}

	void setMinute(int minute) {
		this.setHour(hour + minute / 60); // 현재시간 + 2시간을 올리고 30분 중 2시간을 위로
												// 올림 / 3시간이 올라가고 16분이 나머지로 남음
		this.minute = minute % 60; // 30, 나머지 16분이 출력됨

	}

	void setSeconds(int seconds) {
		this.setMinute(minute + seconds / 60);// 현재 30분 + 166분 = 196분 /
													// 3시간 16분
		this.second = seconds % 60; // 40초
	}

	int getHour() {
		return hour;
	}

	int getMinutes() {
		return minute;
	}

	int getseconds() {

		return second;
	}
}