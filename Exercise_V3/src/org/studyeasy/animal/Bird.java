package org.studyeasy.animal;

import org.studyeasy.parent.Animal;

public class Bird extends Animal {
	private String flyingProperty;
	private String flyingAbility;
	
	public Bird () {
		this.flyingProperty = "Animals with Feathers";
		this.flyingAbility = "Can Fly";
	}
	
	public Bird(String flyingProperty, String flyingAbility) {
		this.flyingProperty = flyingProperty;
		this.flyingAbility = flyingAbility;
	}
	
	public String getflyingProperty() {
		return flyingProperty;
	}
	
	public String getflyingAbility() {
		return flyingAbility;
	}
	
	
}
