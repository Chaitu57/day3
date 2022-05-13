package com.mindgate.pojo;

import java.util.List;

public class ArrayListDemo {
	private List<String> nameList;
	private int arrayListId;
	
	//no argument constructor
	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}
	
	//formal argument constructor
	public ArrayListDemo(List<String> nameList, int arrayListId) {
		super();
		this.nameList = nameList;
		this.arrayListId = arrayListId;
	}

	//get set nameList
	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	// get set arrayList id
	public int getArrayListId() {
		return arrayListId;
	}

	public void setArrayListId(int arrayListId) {
		this.arrayListId = arrayListId;
	}

	 // to string
	@Override
	public String toString() {
		return "ArrayListDemo [nameList=" + nameList + ", arrayListId=" + arrayListId + "]";
	}
	


	
}
