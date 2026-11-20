package com.oops.abstracation;

public interface GPS {
	void navigate(String location);
	
	void getCurrentLocation();
	
	void calculateDistance(String source , String destination);
	
	void findNearbyPlaces(String location);
	
	void estimateArraivalTime(int distance);
}
