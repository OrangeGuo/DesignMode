package factorymode;
import java.io.ObjectInputStream.GetField;

public class fruitfactory {
	fruit fruit=null;
     public fruit get(int index){
    	 if(index==1){
    		 fruit=new apple();
    	 }
    	 else if(index==0)
    	 {
    		 fruit=new banana();
    	 }
    	 return fruit;
     }
}
