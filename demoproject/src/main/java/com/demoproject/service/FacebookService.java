package com.demoproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demoproject.dao.FacebookDAOInterface;
import com.demoproject.entity.FacebookRevature;

@Service
@Transactional
public class FacebookService implements FacebookServiceInterface {
	
	@Autowired
	private FacebookDAOInterface fd;

	@Override
	public FacebookRevature createProfileService(FacebookRevature fentity) {
		fd.save(fentity);
		return fentity;
	}

	@Override
	public List<FacebookRevature> viewAllProfileService() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}

	@Override
	public FacebookRevature viewProfileService(long pid) {
		FacebookRevature fobject=null;
		Optional<FacebookRevature> ff= fd.findById(pid);
		if(ff.isPresent()) {
			fobject=ff.get();
		}
		
		return fobject;
	}

	@Override
	public FacebookRevature editProfileService(FacebookRevature fentity) {
		fd.saveAndFlush(fentity);
		return fentity;
	}

	@Override
	public void deleteProfileService(long pid) {
		fd.deleteById(pid);
		
	}

}
