package org.studyeasy;

//import org.studyeasy.Data.GenericClass;

class Data{
	private Object obj;

	public Data(Object obj) {
		//super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	

	
class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		//super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
}
	
	
}
public class App {

	public static void main(String[] args) {
		
		Data dataObj = new Data("My name");
		String variable = (String) dataObj.getObj();
		System.out.println(variable);
		
		/*
		GenericClass<String> genericData = new GenericClass<String>("Some data");
		String data = genericData.getData();
		System.out.println(data); */

	}

}
