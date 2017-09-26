package adapher_object;

public class Adapter implements Target{
    private source source;
    public Adapter(source source){
    	super();
    	this.source=source;
    }
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		this.source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is target method!");
	}

}
