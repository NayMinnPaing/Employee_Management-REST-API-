package com.restTrainning.restfulltrainning.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.restTrainning.restfulltrainning.model.EmployeeModel;

@Mapper
public interface EmployeeRepository {

	public int insertData(EmployeeModel empmodel);
	public List<EmployeeModel> selectAllData();
	public int deleteData(int empId);
	public EmployeeModel selectById(int empId);
	public EmployeeModel selectByName(String empName);
	public int updateData(EmployeeModel empmodel);
}
