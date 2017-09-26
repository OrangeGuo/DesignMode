package buildermode;
import java.util.ArrayList;
import java.util.List;

public class builder {
    private List<fruit> list=new ArrayList<fruit>();
    public void produceapple(int index){
    	for(int i=0;i<index;i++)
    		list.add(new apple());
    }
    public void producebanana(int index){
    	for(int i=0;i<index;i++)
    		list.add(new banana());
    }
}
