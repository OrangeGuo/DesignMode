package abstractfactorymode;
public class applefactory implements factory{

	@Override
	public fruit getFruit() {
		// TODO Auto-generated method stub
		return new apple();
	}

}
