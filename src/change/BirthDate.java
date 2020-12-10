package change;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthDate {
	
	static LocalDate set() {
		int year;
		int month;
		int day;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("년도.");
			year = sc.nextInt();
			System.out.println("월");
			month = sc.nextInt();
			System.out.println("일"); 
			day = sc.nextInt();
			int x =Check.checkDate(year, month, day);
			if(x==1) {
				return LocalDate.of(year, month, day);
			}
		}
	}

	
	  public static People newPeople() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("이름.");
		  String name = sc.nextLine();
		  System.out.println("생년월일."); 
		  LocalDate birthday = set();
		  System.out.println("남성이면 1, 여성이면 2.");
		  String gender;
		  while(true){
			  int genderNum = sc.nextInt();
			  sc.nextLine();
			  if(genderNum == 1 || genderNum == 3) {
				  gender ="남성";
				  break; } 
			  else if (genderNum ==2 || genderNum == 4) {
				  gender = "여성";
				  break; }
			  else {
				  System.out.println("1(3)이나 2(4)로 입력해주세요.");} 
			  } 
		  People one = new People(name, birthday, gender);
		  return one;
		  }
	  
		public static void age(People one) {
			LocalDate today = LocalDate.now();
			int n = today.getYear() - one.birthday.getYear();
			if(one.birthday.getMonthValue() > today.getMonthValue()) {
				n=n-1;
			}
			else if(one.birthday.getMonthValue() == today.getMonthValue() && one.birthday.getDayOfMonth() > today.getDayOfMonth()) {
				n=n-1;
			}
		
			one.age = n;
		}
}
