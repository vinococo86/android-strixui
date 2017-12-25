package com.strixui.vinococo.strixui.main.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaemin on 2017. 12. 25..
 */

public class StrixUiSampleModel {

	List<UiType> supportUiType;

	public StrixUiSampleModel() {
		this.supportUiType = new ArrayList<>();

		this.supportUiType.add(UiType.CALENDAR);
		this.supportUiType.add(UiType.TEXT_VIEW);
	}

	public List<UiType> getSupportUiType() {
		return supportUiType;
	}
}
