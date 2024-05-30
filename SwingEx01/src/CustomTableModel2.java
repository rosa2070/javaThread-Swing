import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel2 extends AbstractTableModel {

	private ArrayList<ArrayList<String>> values;
	
	private String[] columnNames = new String[] {"col1", "col2", "col3", "col4", "col5"};
	
	public CustomTableModel2() {
		// TODO Auto-generated constructor stub
		ArrayList<String> value1 = new ArrayList<String>();
		value1.add("11"); value1.add("12"); value1.add("13"); value1.add("14"); value1.add("15");
		ArrayList<String> value2 = new ArrayList<String>();
		value2.add("21"); value2.add("22"); value2.add("23"); value2.add("24"); value2.add("25");
		
		values = new ArrayList<ArrayList<String>>();
		values.add(value1);
		values.add(value2);
		
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return values.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return values.get(0).size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return values.get(rowIndex).get(columnIndex);
	}

}
