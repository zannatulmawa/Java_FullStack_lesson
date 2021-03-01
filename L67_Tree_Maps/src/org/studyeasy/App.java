package org.studyeasy;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String Code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(Code2);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	}
	
	
	
}

public class App {

	public static void main(String[] args) {
		Map<Code, String> lectures = new TreeMap<>();
		lectures.put(new Code("S01", "L03"), "Methods");
		lectures.put(new Code("S02", "L05"), "Class");
		lectures.put(new Code("S03", "L06"), "Interfaces");
		lectures.put(new Code("S04", "L08"), "Abstract");
		lectures.put(new Code("S05", "L09"), "Generics");
		lectures.put(new Code("S01", "L04"), "Expressions");
		
		for(Map.Entry<Code, String> entry: lectures.entrySet()) {
			System.out.println(entry);
		}
		
		/*
		Code code1 = new Code("S01", "L02");
		Code code2 = new Code("S01", "L04");
		
		System.out.println("Code1 " + code1.hashCode() + " code2 " + code2.hashCode());
		System.out.println(code1.equals(code2));
		
		*/

	}

}
