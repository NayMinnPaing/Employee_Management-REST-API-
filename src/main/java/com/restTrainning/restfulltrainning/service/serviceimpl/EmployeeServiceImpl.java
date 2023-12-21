package com.restTrainning.restfulltrainning.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restTrainning.restfulltrainning.model.EmployeeModel;
import com.restTrainning.restfulltrainning.repository.EmployeeRepository;
import com.restTrainning.restfulltrainning.service.EmployeeService;

 @Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	 

	@Override
	public int insertData(EmployeeModel empmodel) {
 		return employeeRepository.insertData(empmodel);
	}

	@Override
	public List<EmployeeModel> selectAllData() {
 		return employeeRepository.selectAllData();
	}

	@Override
	public int deleteData(int empId) {
 		return employeeRepository.deleteData(empId);
	}

	@Override
	public EmployeeModel selectById(int empId) {
 		return employeeRepository.selectById(empId);
	}
	
	@Override
	public EmployeeModel selectByName(String empName) {
 		return employeeRepository.selectByName(empName);
	}

	@Override
	public int updateData(EmployeeModel empmodel) {
 		return employeeRepository.updateData(empmodel);
	}

}
