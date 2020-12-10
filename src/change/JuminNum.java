package change;

import java.util.Scanner;

public class JuminNum {
	
	public static People newPeople() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("이름을 입력하세요.");
		  String name = sc.nextLine();
		  while(true) {
			  int x = 0;
			  System.out.println("주민번호 7자리를 입력하세요.");
			  int num = sc.nextInt();
			  x = Check.changeNum(num);
			  if(x==1) {
				  People one = new People(name, num);
				  return one;
			  }
		  }
	}
	
	static void juminN(People one) {
		int num = 0;
		int y = one.birthday.getYear();
		int m = one.birthday.getMonthValue();
		int d = one.birthday.getDayOfMonth();
		int genderNum = 0;
		if(y < 2000) {
			int yyyy = (y - 1900) * 10000;
			m = m * 100;
			num=yyyy+m+d;
		}
		else {
			int yyyy = (y-2000) * 10000;
			m = m * 100;
			num=yyyy+m+d;
		}
		if(y<2000) {
			if(one.gender=="남성") {
				genderNum = 1;
			}
			else {
				genderNum = 2;
			}
		}
		else {
			if(one.gender=="남성") {
				genderNum = 3;
			}
			else {
				genderNum = 4;
			}
		}
		one.num = num*10+genderNum;
	}
}
