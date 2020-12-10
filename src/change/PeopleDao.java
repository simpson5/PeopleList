package change;

import java.util.ArrayList;
import java.util.TreeSet;

public class PeopleDao {
	private ArrayList<People> peopleList;
	
	//List 선언
	public PeopleDao() {
		peopleList = new ArrayList<People>();
	}
	
	public PeopleDao(ArrayList<People> list) {
		this.peopleList = list;
	}
	
	public ArrayList<People> getPeopleList(){
		return this.peopleList;
	}
	
	public void addPeople(People one) {
		peopleList.add(one);
	}
	
	public void removePeople(String name) {
		for(int i=0; i<peopleList.size(); i++) {
			if(peopleList.get(i).name.contains(name)) {
				peopleList.remove(peopleList.get(i));
				System.out.println("삭제 완료");
			}
			else {
				System.out.println("그런 사람은 없어!");
			}
		}
	}
	
	public void searchPeople(String title) {
		for(int i=0; i<peopleList.size(); i++) {
			if(peopleList.get(i).name.contains(title)) {
				peopleList.get(i).infoPeople();
			}
			else {
				System.out.println("그런 사람은 없어!");
			}
		}
	}
	
	public void allPeople() {
		for(People k : peopleList) {
			k.infoPeople();
		}
	}
	
	public void arrayPeople() {
		TreeSet<People> treePeople = new TreeSet<People>(peopleList);
	}
}
