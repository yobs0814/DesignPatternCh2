package hansung.yoseph.DesignPatternCh02_p88;

import roleFrameWork.Person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setRole(new Driver());
		p.printRole();
		p.setRole(new Worker());
		p.printRole();
	}

}
