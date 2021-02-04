package org.studyeasy;

public class B {
	//private final int x; //whenever we mark a property of variable as final then reassignment
						//is not possible; final is a keyword, it can be used in both class & method

	private final int x = 1;
	
	/*for exp 41
	
	public B() {
		super();
	}
	
	*/

	
	/* for exp 41
	public B(int x) {
		super();
		this.x = x;
	}*/



	public int getX() {
		return x;
	}



	//@Override
	public void bd() {
		System.out.println("Hello BD!");
	}

	public void USA() {
		System.out.println("USA is fantastic");
	}

}
