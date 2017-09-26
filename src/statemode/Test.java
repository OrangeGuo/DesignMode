package statemode;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		state state=new state();
        Context context=new Context(state);
        state.setValue("state1");
        context.method();
        state.setValue("state2");
        context.method();
	}

}
