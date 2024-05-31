package com.zipcodewithdialog;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ZipcodeTableModel extends AbstractTableModel {
	
	private ArrayList<ZipcodeTO> values;
	
	private String[] columnNames = new String[] {"우편번호", "시도", "구군", "동", "리", "번지"};

	public ZipcodeTableModel(String zipcode) {
		// TODO Auto-generated constructor stub
		
		ZipcodeDAO dao = new ZipcodeDAO();
		values = dao.listZipcode(zipcode);
		
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
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		String result = "";
		
		ZipcodeTO to = values.get(rowIndex);
		switch (columnIndex) {
		case 0:
			result = to.getZipcode();
			break;
		case 1:
			result = to.getSido();
			break;
		case 2:
			result = to.getGugun();
			break;
		case 3:
			result = to.getDong();
			break;
		case 4:
			result = to.getRi();
		case 5:
			result = to.getBunji();
			break;
		}
		
		return result;
	}


}
