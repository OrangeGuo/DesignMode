package trategymode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ICalculator iCalculator=new Plus();
        System.out.println(iCalculator.calculator("2+8"));
	}

}
