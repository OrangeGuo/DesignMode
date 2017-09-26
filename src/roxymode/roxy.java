package roxymode;
public class roxy implements souceable{

	private source source;
	public roxy()
	{
		super();
		this.source=new source();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		this.source.method();
		after();
	}
	public void before()
	{
		System.out.println("before the proxy");
	}
	public void after()
	{
		System.out.println("after the proxy");
	}

}
