package observemode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          subject subject=new Mysub();
          subject.add(new observer1());
          subject.add(new observer2());
          subject.operation();
	}

}
