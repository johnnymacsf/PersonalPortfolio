import java.util.ArrayList;

public class InsertAtCommand extends UndoCommand {
	// Your field declarations here
	private ArrayList<String> sourceList;
	private String str;
	private int index;
	// Your constructor code here
	public InsertAtCommand(ArrayList<String> lst, String s, int num){
	   this.sourceList = lst;
	   this.str = s;
	   this.index = num;
	}
	@Override
	public void execute() {
		// Your code here
		sourceList.add(index, str);
	}
}
