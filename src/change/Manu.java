package change;

import java.util.Scanner;

public class Manu {
	Scanner sc = new Scanner(System.in);
	PeopleDao pd = new PeopleDao();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.사람 추가");
			System.out.println("2.사람 제거");
			System.out.println("3.사람 검색");
			System.out.println("4.사람 전체 출력");
			System.out.println("5.사람 정렬");
			System.out.println("6.끝내기");

			int menuNum = sc.nextInt();

			switch(menuNum){
			case 1:
				addPeople();
				break;
			case 2:
				System.out.println("누구를 제거할까?");
				String who = sc.nextLine();
				who = sc.nextLine();
				pd.removePeople(who);
				break;
			case 3:
				System.out.println("사람을 검색하세요");
				String name = sc.nextLine(); //건너 뜀
				name = sc.nextLine(); //두줄이면 검색함! 왜?
				pd.searchPeople(name);
				break;
			case 4:
				pd.allPeople();
				break;
			case 5:
				System.out.println("주민순으로 정렬합니다.");
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("입력이 틀렸습니다");
			}
		}
	}
	
	public void addPeople() {
		
		System.out.println("1번 생년월일 2번 주민번호");
		int addNum = sc.nextInt();
		if(addNum==1) {
			People one = BirthDate.newPeople();
			pd.addPeople(one);
			one.infoPeople();
		}
		else if(addNum==2) {
			People one = JuminNum.newPeople();
			pd.addPeople(one);
			one.infoPeople();
		}
		else {
			System.out.println("다시 입력하세요.");
		}
	}
}
