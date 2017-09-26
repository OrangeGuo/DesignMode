package commandmode;

public class Mycommand implements Command{
    private Receiver receiver;
    public Mycommand(Receiver receiver){
    	this.receiver=receiver;
    }
	@Override
	public void exe() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
