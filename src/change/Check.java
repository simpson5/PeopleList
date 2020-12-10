package change;

public class Check {
	static public int changeNum(int num) {
			String y = String.format("%d", num/100000);
			int year =1900 + Integer.parseInt(y);
			num = num - Integer.parseInt(y)*100000;
			String m = String.format("%d", num/1000);
			int month = Integer.parseInt(m);
			num = num - month*1000;
			String d = String.format("%d", num/10);
			int day = Integer.parseInt(d);

			return checkDate(year, month, day);
	}

	static public int checkDate(int y, int m, int d) {
		int checkNum = 1;
		if(y<1900 || y>2100) {
			System.out.println("잘못입력하셨습니다.");
			return checkNum * 0;
		}
		if(m<1 || m>12) {
			System.out.println("잘못입력하셨습니다.");
			return checkNum * 0;
		}
		if(m==2) {
			if(d>=29) {
				System.out.println("잘못입력하셨습니다.");
				return checkNum * 0;
			}
		}
		return checkNum;
	}
}

//static LocalDate set() {
//	int year;
//	int month;
//	int day;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("년도.");
//	while(true) {
//		year = sc.nextInt();
//		if(year<1900 || year>2100) {
//			System.out.println("잘못입력하셨습니다.");
//		}
//		else {
//			break;
//		}
//	}
//	System.out.println("월"); 
//	while(true) {
//		month = sc.nextInt();
//		if(month>0 && month<13) {
//			break;
//		}
//		else {
//			System.out.println("잘못입력하셨습니다.");	
//		}
//	}
//	System.out.println("일"); 
//	while(true) {
//		day = sc.nextInt();
//		if(month==2) {
//			if(day>=29) {
//				System.out.println("잘못입력하셨습니다.");	
//			}
//			else {
//				break;
//			}
//		}
//		else {
//			break;
//		}
//	}
//	
//	return LocalDate.of(year, month, day);
//}
