package org.studyeasy.shop;



public class Door {
	private Lock lockObj = new Lock() {

		@Override
		public boolean isUnlockedAbs(String KeyCode) {
			if (KeyCode.equals("mawa")){
				return true;
			}else {
				return false;	
			}
			
		}
			
		
	};


	public Lock getLockObj() {
		return lockObj;
	}}
