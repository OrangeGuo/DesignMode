package zhongjiezhe_mode;

public class MyMeditor implements Meditor{
   private user user1,user2;
   public user getUser1(){
	   return user1;
   }
   public user getUser2(){
	   return user2;
   }
	@Override
	public void CreatMediator() {
		// TODO Auto-generated method stub
		user1=new User1(this);
		user2=new User2(this);
	}

	@Override
	public void workall() {
		// TODO Auto-generated method stub
		user1.work();
		user2.work();
	}

}
