package diedai_mode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Collection collection=new MyCollection();
          Iterator iterator=(Iterator) collection.Iterator();
          while(iterator.hasNext()){
        	  System.out.println(iterator.next());
          }
	}

}
