package singleton;
public class singleton {
    private static singleton singleton = null;
    private singleton(){}
    public static singleton getinstance(){
    	if(singleton == null)
    		synchronized(singleton.class){
    		if(singleton == null)
    			singleton = new singleton();
    		}
    	return singleton;
    }
}
