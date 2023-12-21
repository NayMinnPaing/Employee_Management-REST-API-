package com.restTrainning.restfulltrainning.service;

import java.util.List;

import com.restTrainning.restfulltrainning.model.EmployeeModel;

public interface EmployeeService {
	public int insertData(EmployeeModel empmodel);
	public List<EmployeeModel> selectAllData();
	public int deleteData(int empId);
	public EmployeeModel selectById(int empId);
	public int updateData(EmployeeModel empmodel);
	public EmployeeModel selectByName(String empName);
}
