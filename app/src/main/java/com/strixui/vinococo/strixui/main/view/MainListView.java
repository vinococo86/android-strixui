package com.strixui.vinococo.strixui.main.view;


import com.strixui.vinococo.strixui.main.model.UiType;

import java.util.List;

/**
 * Created by jaemin on 2017. 12. 25..
 */

public interface MainListView{

	void loadUiSample(List<UiType> uiSample);
	void moveToCalendar();
	void moveToTextView();

}
