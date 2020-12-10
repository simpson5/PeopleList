package change;

import java.time.LocalDate;

public class People {
	String name;
	LocalDate birthday;
	int age;
	String gender;
	int num;
	
	public People(String name,LocalDate birthday, String gender) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		JuminNum.juminN(this);
		BirthDate.age(this);
	}
	
	public People(String name, int num) {
		this.num = num;
		this.name = name;
		
		String y = String.format("%d", num/100000);
		int yyyy =1900 + Integer.parseInt(y);
		num = num - Integer.parseInt(y)*100000;
		
		String m = String.format("%d", num/1000);
		int mm = Integer.parseInt(m);
		num = num - mm*1000;
		
		String d = String.format("%d", num/10);
		int dd = Integer.parseInt(d);;
		
		if(num%2==1) {
			this.gender="남성";
		}
		else {
			this.gender="여성";
		}
		
		this.name = name;
		this.birthday = LocalDate.of(yyyy, mm, dd);
		BirthDate.age(this);
	}
	
	public void infoPeople() {
		System.out.println("이름:"+this.name + " 나이:"+this.age +" 성별:"+this.gender +" 생일:"+this.birthday +" 주민:"+this.num);
	}
}
