package org.studyeasy;

import org.studyeasy.shop.Door;
import org.studyeasy.shop.Lock;

public class Shop {

	public static void main(String[] args) {
		Door doorObj = new Door();
		if (doorObj.getLockObj().isUnlockedAbs(args[0])){
			System.out.println("The shop is open!");
		}else {
			System.out.println("Closed!");
		}

	}

}
