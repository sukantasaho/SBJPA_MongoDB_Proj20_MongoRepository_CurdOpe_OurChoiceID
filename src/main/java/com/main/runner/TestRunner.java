package com.main.runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.main.document.Doctor;
import com.main.service.IDoctorMngtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMngtService service;
	
	@Override
	public void run(String... args) throws Exception {
		 
          try
          {
        	  Doctor d = new Doctor();
        	  d.setId(new Random().nextInt(900000));
        	  d.setName("Sukanta");
        	  d.setSalary(12000f);
        	  d.setAddr("Bhadrak");
        	  d.setAdult(true);
        	  d.setDob(LocalDateTime.now());
        	  d.setSpecialization("Surgery A1");
        	  System.out.println(service.saveEmployee(d));
          }
          catch (Exception e) {
			 e.printStackTrace();
		}
	}

}
