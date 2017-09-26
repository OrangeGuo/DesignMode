package decoratemode;

public class Decorator implements souceable{
    private souceable souceable;
    public Decorator(souceable souceable){
    	super();
    	this.souceable=souceable;
    }
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before the decoration");
		this.souceable.method();
		System.out.println("after the decoration");
	}

}
