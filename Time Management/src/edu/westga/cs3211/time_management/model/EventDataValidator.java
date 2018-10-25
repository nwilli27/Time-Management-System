package edu.westga.cs3211.time_management.model;

import java.time.LocalTime;

/** Validate Event information.
 * 
 * @author Dylan Knox, Kyle Riggs, Cody Graham, and TylerWingfield, JeremiahLiscum, JosephFuller, Jonathan Corley,  Tristen Rivera, Tyler Scott, Dexter Tarver
 */
public class EventDataValidator {
	
	/**Checks if the even name is valid
	 * 
	 * @precondition name must be < 60 characters and name cannot be empty
	 * @postcondition none
	 * 
	 * @param name the name of the event
	 * @return true if the name is valid
	 */
	public boolean checkName(String name) {
		
		boolean result;
		
		if(name.length() > 60) {
			result = false;
		}else if(name.isEmpty()) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}
	
	/**
	 * @authors TylerWingfield, JeremiahLiscum, JosephFuller
	 * @param endTime
	 * @return
	 */
	public boolean checkEndTime(LocalTime startTime, LocalTime endTime) {
		return endTime.compareTo(startTime)>0;
	}

	/**
	 * Checks start time.
	 * 
	 */
	public void checkStartTime(LocalTime startTime) {
		
	}

}
