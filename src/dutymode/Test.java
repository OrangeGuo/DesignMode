package dutymode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyHandler myHandler1=new MyHandler("01");
        MyHandler myHandler2=new MyHandler("02");
        MyHandler myHandler3=new MyHandler("03");
        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);
        myHandler1.operation();
	}

}
