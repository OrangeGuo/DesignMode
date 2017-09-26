package abstractfactorymode;
public class store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         factory factory=new applefactory();
         fruit fruit=factory.getFruit();
         fruit.getfruit();
	}

}
