package singleton;
public class single {
   private static final single single=new single();
   private single(){}
   public static single getinstance(){
	   return single;
   }
}
