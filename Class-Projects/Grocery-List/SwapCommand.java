import java.util.ArrayList;
import java.util.Collections;
public class SwapCommand extends UndoCommand {
	// Your field declarations here
	private ArrayList<String> sourceList;
	private int index1;
	private int index2;
	// Your constructor code here
	public SwapCommand(ArrayList<String> lst, int num1, int num2){
	   this.sourceList = lst;
	   this.index1 = num1;
	   this.index2 = num2;
	}
	@Override
	public void execute() {
		// Your code here
		Collections.swap(sourceList, index1, index2);
	}

}
