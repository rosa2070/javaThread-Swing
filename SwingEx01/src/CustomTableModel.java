import javax.swing.table.AbstractTableModel;

public class CustomTableModel extends AbstractTableModel {
	// 데이터 2차
	// 배열 => ArrayList
	private String[][] values = new String[][] {
			{"11", "12", "13", "14", "15"}, 
			{"21", "22", "23", "24", "25"}
	};
	
	private String[] columnNames = new String[] {"col1", "col2", "col3", "col4", "col5"};
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return values.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return values[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return values[rowIndex][columnIndex];
	}

}
