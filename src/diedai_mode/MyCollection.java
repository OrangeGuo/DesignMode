package diedai_mode;

public class MyCollection implements Collection{

	public String string[]={"A","B","C","D","E"};
	
	@Override
	public java.util.Iterator Iterator() {
		// TODO Auto-generated method stub
		return (java.util.Iterator) new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return string[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
