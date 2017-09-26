package observemode;

public class Mysub extends abstractsub{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("update");
		this.notifyobservers();
	}

}
