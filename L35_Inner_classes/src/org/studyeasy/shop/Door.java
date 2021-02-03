package org.studyeasy.shop;

public class Door {
	private Lock lockObj;
	public Door() { //constructor without argument
		lockObj = new Lock();
	}
	public Door(boolean inp) { //constructor with argument
		lockObj = new Lock (inp);
	}
	
	
	
	public Lock getLockObj() {//getter of Lock object, method of Door
		return lockObj;
	}



	public void shopStatus() {//method of Door
		if(lockObj.getLock()) {
			System.out.println("Shop is closed!");
		}else {
			System.out.println("Welcome!");
		}
	}
	
	public class Lock {
		private boolean lockVar;

		public Lock(boolean lockInp) {//constructor with arg
			//super();
			this.lockVar = lockInp;
		}
		public Lock() { // constructor without arg
			this.lockVar = true;
		}

		public boolean getLock() {//getter
			return lockVar;
		}

		public void setLock(boolean lockInp) {//setter
			this.lockVar = lockInp;
		}
		
		
		
		
	}


	
	

}
