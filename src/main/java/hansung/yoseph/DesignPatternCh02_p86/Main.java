package hansung.yoseph.DesignPatternCh02_p86;

public class Main {

	public static void main(String[] args) {
		Person [] p ={ new Driver(), new Worker() };
		p[0].printRole();
		((Worker)p[0]).printRole();
		p[1].printRole();
	}

}
