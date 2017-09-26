package bridge;

public class Test {
    public static void main(String[] args)
    {
    	Bridge bridge=new MyBridge();
    	bridge.setsourceable(new SourceSub1());
    	bridge.method();
    	bridge.setsourceable(new SourceSub2());
    	bridge.method();
    }
}
