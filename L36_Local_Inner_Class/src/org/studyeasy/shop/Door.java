package org.studyeasy.shop;

public class Door {
	public boolean isLockedDoor(String key) {//method with argument of Door
		
		
		class Lock{ //inner local class
			public boolean isLockedLock(String key) {
				if(key.equals("mawa")) {
					return true;
				}else {
					return false;
				}
			}
		}
		return new Lock().isLockedLock(key);
		
		
	}

}
