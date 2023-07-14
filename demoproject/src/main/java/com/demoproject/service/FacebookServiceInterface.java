package com.demoproject.service;

import java.util.List;

import com.demoproject.entity.FacebookRevature;

public interface FacebookServiceInterface {

	FacebookRevature createProfileService(FacebookRevature fentity);

	List<FacebookRevature> viewAllProfileService();

	FacebookRevature viewProfileService(long pid);

	FacebookRevature editProfileService(FacebookRevature fentity);

	void deleteProfileService(long pid);

}
