package org.studyeasy.animal;

import org.studyeasy.parent.Animal;

public class Reptile extends Animal {
	private String SkinType;
	private String Bone;
	private String EggType;
	
	
	public Reptile() {
		this.SkinType = "Dry Skin";
		this.Bone = "Backbone";
		this.EggType = "Soft-Shelled Eggs";
	}


	public Reptile(String skinType, String bone, String eggType) {
		this.SkinType = skinType;
		this.Bone = bone;
		this.EggType = eggType;
	}

	/*
	public String getSkinType() {
		return SkinType;
	}
	*/


	public void setBone(String bone) {
		Bone = bone;
	}


	public void setEggType(String eggType) {
		EggType = eggType;
	}
	
	
}
