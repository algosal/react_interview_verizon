package com.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.entity.FacebookRevature;
import com.demoproject.service.FacebookServiceInterface;

@RestController
public class FacebookController {
	
	@Autowired
	private FacebookServiceInterface fs;

	@PostMapping("createProfile")
	public FacebookRevature createProfile(@RequestBody FacebookRevature fentity) {
		
		return fs.createProfileService(fentity);
	}
	
	@GetMapping("viewAllProfile")
	public List<FacebookRevature> getAll(){
		return fs.viewAllProfileService();
	}
	
	@GetMapping("viewProfile/{id}")
	public FacebookRevature view(@PathVariable("id") long pid){
		return fs.viewProfileService(pid);
	}
	
	@PutMapping("editProfile/{id}")
	public FacebookRevature editProfile(@PathVariable("id") long pid,@Validated  @RequestBody FacebookRevature fentity) {
		fentity.setPid(pid);
		return fs.editProfileService(fentity);
	}
	
	@DeleteMapping("deleteProfile/{id}")
	public String delete(@PathVariable("id") long pid) {
		fs.deleteProfileService(pid);
		return "profile deleted";
	}
}




















