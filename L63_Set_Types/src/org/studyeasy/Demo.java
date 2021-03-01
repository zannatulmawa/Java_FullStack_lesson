package org.studyeasy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Set <Integer> set = new HashSet<>(); // In treeSet we sort the thing first then print it
		for (int i =1; i<=30; i++) {
			set.add(i); // Set only carries unique values
		}
		for(int i: set) {
			System.out.println(i);
		}

	}

}
