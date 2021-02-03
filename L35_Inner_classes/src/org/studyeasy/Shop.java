package org.studyeasy;

import org.studyeasy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door doorObj = new Door();
		doorObj.shopStatus();
		//doorObj.getLockObj().setLock(false);
		//doorObj.shopStatus();
		System.out.println(doorObj.getLockObj().getLock());
		
		
		Door doorObj2 = new Door(false);
		System.out.println(doorObj2.getLockObj().getLock());

	}

}
