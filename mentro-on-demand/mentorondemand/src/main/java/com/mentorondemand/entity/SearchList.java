package com.mentorondemand.entity;

import java.util.List;

public class SearchList {

	private List<Search> searchList;

	public SearchList() {}

	public SearchList(List<Search> searchList) {
		
		this.searchList = searchList;
	}

	public List<Search> getSearchList() {
		return searchList;
	}

}
