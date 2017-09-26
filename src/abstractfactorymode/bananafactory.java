package abstractfactorymode;
public class bananafactory implements factory{

	@Override
	public fruit getFruit() {
		// TODO Auto-generated method stub
		return new banana();
	}

}
