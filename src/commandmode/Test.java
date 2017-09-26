package commandmode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Receiver receiver=new Receiver();
        Command command=new Mycommand(receiver);
        Invoker invoker=new Invoker(command);
        invoker.action();
	}

}
