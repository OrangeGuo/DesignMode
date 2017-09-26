package staticfactorymode;

public class fruitfactory {
     public static apple getapple(){
    	 return new apple();
     }
     public static banana getbanana(){
    	 return new banana();
     }
}
