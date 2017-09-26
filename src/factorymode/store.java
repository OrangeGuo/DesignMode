package factorymode;
public class store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fruit fruit=new fruitfactory().get(0);
        fruit.getfruit();
	}

}
