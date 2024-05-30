import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<String> {
	//String[] values = new String[] {"사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기", "사과", "참외", "수박", "딸기"};
	private ArrayList<String> values;
	
	public CustomListModel() {
		// TODO Auto-generated constructor stub
		values = new ArrayList<String>();
		
		values.add("사과");
		values.add("참외");
		values.add("수박");
		values.add("딸기");
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return values.size();
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return values.get(index);
	}

}
