package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.document.Doctor;
import com.main.repository.IDoctorRepo;

@Service("empService")
public class DoctorServiceImp implements IDoctorMngtService {

	@Autowired
	private IDoctorRepo repo;
	
	@Override
	public String saveEmployee(Doctor doctor) {
		 Integer id =  repo.save(doctor).getId();
		return "Record saved with id-"+id;
	}

	 

}
