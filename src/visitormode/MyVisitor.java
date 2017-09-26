package visitormode;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println("visit the subject:"+subject.getSubject());
	}

	
}
