package com.dbassigment.service;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbassignment.models.LocationNearestShopRequest;
import com.dbassignment.models.LocationNearestShopResponse;
import com.dbassignment.models.ShopAddress;
import com.dbassignment.models.UploadShopDetailsRequest;
import com.dbassignment.models.UploadShopDetailsResponse;

@RestController


public class ShopLocatorService {
	
	@RequestMapping(value ="/uploadShopDetails" ,method = RequestMethod.POST)
	public UploadShopDetailsResponse uploadShopDetails(
			@RequestBody final UploadShopDetailsRequest request) {
		System.out.println("Value === "+request.shopName);
		System.out.println("PostCode === "+request.getShopAddress().postCode);
		
		
		
		return new UploadShopDetailsResponse("Details Updated Succesfully");
		
	}
	
	
	
	@RequestMapping(value ="/retrieveNearestShopDetails" ,method = RequestMethod.POST)
	public LocationNearestShopResponse retrieveNearestShopDetails(
			@RequestBody final LocationNearestShopRequest request) {
		System.out.println("Value === "+request.getLatitude()); 
		
		LocationNearestShopResponse response =new LocationNearestShopResponse();

		
		ShopAddress shopAddress= new ShopAddress();
		shopAddress.setPostCode("793001");
		
		response.setShopAddress(shopAddress);
		//return new TestService("success");
		return response;
	}
	
}
