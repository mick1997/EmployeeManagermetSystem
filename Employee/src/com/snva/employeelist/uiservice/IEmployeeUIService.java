package com.snva.employeelist.uiservice;

import java.util.List;

import com.snva.employeelist.bean.Employee;

/**
 * IEmployeeUIService is an interface which defines various abstract functions
 * for the UIService layer.
 */
public interface IEmployeeUIService
{
	public void AddNewEmployee();
	public void removeEmployee();
	public void showAllEmployee();
	public List<Employee> searchEmployeeByName(String name);
	public void sortEmployee();
}
