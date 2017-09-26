package observemode;

import java.util.Enumeration;
import java.util.Vector;

public abstract class abstractsub implements subject{
   private Vector<observer>observers=new Vector<observer>();
   public void add(observer observer){
	   observers.add(observer);
	   }
   public void del(observer observer){
	   observers.remove(observer);
   }
   public void notifyobservers() {  
       Enumeration<observer> enumo = this.observers.elements();  
       while(enumo.hasMoreElements()){  
           enumo.nextElement().update();  
       }  
   } 
}
