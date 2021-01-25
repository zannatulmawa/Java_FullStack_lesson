package org.studyeasy.vechicle;

import org.studyeasy.parent.Vechicle;

public class Bike extends Vechicle {
	private String handle;
	
	

	public Bike() {
		super();
		this.handle = "short";
	}



	public Bike(String handle) {
		super();
		this.handle = handle;
	}



	public String getHandle() {
		return handle;
	}
	
	
	

}