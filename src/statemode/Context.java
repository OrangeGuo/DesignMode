package statemode;
public class Context {
     public state getState() {
		return state;
	}
	public void setState(state state) {
		this.state = state;
	}
	private state state;
     public Context(state state){
    	 this.state=state;
     }
     public void method(){
    	 if(state.getValue().equals("state1")){
    		 state.method1();
    	 }
    	 else if(state.getValue().equals("state2")){
    		 state.method2();
    	 }
     }
}
