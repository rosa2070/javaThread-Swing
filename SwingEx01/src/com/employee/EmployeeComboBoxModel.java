package com.employee;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class EmployeeComboBoxModel extends DefaultComboBoxModel<String> {
	//private ArrayList<String> datas;
	private ArrayList<EmployeeTO> datas;
	
	public EmployeeComboBoxModel() {
		// TODO Auto-generated constructor stub
		//datas = new ArrayList<String>();
		//datas.add( "10" );
		//datas.add( "20" );
		//datas.add( "30" );
		
		EmployeeDAO dao = new EmployeeDAO();
		datas = dao.listDeptno();
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return datas.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		EmployeeTO to = datas.get(index);
//		System.out.println( to.getDeptno() );
		return to.getDeptno();
	}
}


