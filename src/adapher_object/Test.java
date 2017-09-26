package adapher_object;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Target target=new Adapter(new source());
        target.method1();
        target.method2();
	}

}
