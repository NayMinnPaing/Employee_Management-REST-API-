package com.restTrainning.restfulltrainning.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restTrainning.restfulltrainning.model.EmployeeModel;
import com.restTrainning.restfulltrainning.service.serviceimpl.EmployeeServiceImpl;

@RestController

public class EmployeeController {

	 @Autowired 
	 private EmployeeServiceImpl employeeServiceImpl;
	 
	 @RequestMapping(value = "insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public int insert(@ModelAttribute EmployeeModel empmodel) {
		 
			return employeeServiceImpl.insertData(empmodel);
			 
		 }
	 
	 @RequestMapping(value = "allEmployee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public List<EmployeeModel> selectAll() {
		return employeeServiceImpl.selectAllData();
		 
	 }
	 
	
	 @RequestMapping(value = "searchById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public EmployeeModel selectById(@RequestParam (name="empId") String empId) {
		 	int empid= Integer.parseInt(empId);
			return employeeServiceImpl.selectById(empid);
			 
		 }
	 @RequestMapping(value = "searchByName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public EmployeeModel selectByName(@RequestParam (name="empName") String empName) {
		 	 
			return employeeServiceImpl.selectByName(empName);
			 
		 }
	 
	 @RequestMapping(value = "update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public int update(@RequestBody EmployeeModel empmodel) {
		 
			return employeeServiceImpl.updateData(empmodel);
			 
		 }
	 @RequestMapping(value = "delete/{empId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
	 public int delete(@PathVariable (name="empId") String empId) {
		 int empid= Integer.parseInt(empId);
		 return employeeServiceImpl.deleteData(empid);
			 
		 }

}
