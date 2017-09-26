package trategymode;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculator(String string) {
		// TODO Auto-generated method stub
		int array[]=split(string, "\\+");
		return array[0]+array[1];
	}

}
