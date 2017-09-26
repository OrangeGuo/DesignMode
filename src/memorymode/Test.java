package memorymode;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Original original=new Original("past");
         Storage storage=new Storage(original.create());
         System.out.println("�޸�ǰ:"+original.getValue());
         original.setValue("future");
         System.out.print("�޸ĺ�:"+original.getValue());
         original.restoreMemento(storage.getMemento());
         System.out.print("�ָ���:"+original.getValue());
	}

}
