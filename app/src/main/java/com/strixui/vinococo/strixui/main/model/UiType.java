package com.strixui.vinococo.strixui.main.model;

/**
 * Created by jaemin on 2017. 12. 25..
 */

public enum UiType {
	TEXT_VIEW("textView"),
	CALENDAR("Calendar");

	UiType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	private String name;

}
