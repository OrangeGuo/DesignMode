package bridge;

public abstract class Bridge {
   private sourceable sourceable;
   public void method(){
	   sourceable.method();
   }
   public sourceable getSourceable(){
	   return sourceable;
   }
   public void setsourceable(sourceable sourceable)
   {
	   this.sourceable=sourceable;
   }
}
