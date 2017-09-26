package outlookmode;
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;
    public Computer(){
    	cpu=new CPU();
    	memory=new Memory();
    	disk=new Disk();
    }
    public void startup()
    {
   	     System.out.println("start the computer!");
   	     cpu.startup();
   	     memory.startup();
   	     disk.startup();
   	     System.out.println("start computer finished!");
    }
    public void shupdown()
    {
      	 System.out.println("shutdown the computer!");
      	 cpu.shupdown();
      	 memory.shupdown();
      	 disk.shupdown();
       	 System.out.println("shutdown computer finished!");
    }
}
