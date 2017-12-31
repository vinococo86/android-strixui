package com.strixui.vinococo.strixui.main.presenter;

import com.strixui.vinococo.strixui.main.model.StrixUiSampleModel;
import com.strixui.vinococo.strixui.main.model.UiType;
import com.strixui.vinococo.strixui.main.view.MainListView;

/**
 * Created by jaemin on 2017. 12. 25..
 */

public class MainViewPresenter {

	private StrixUiSampleModel model;
	private MainListView view;

	public MainViewPresenter(  MainListView view) {
		this.view = view;
		model = new StrixUiSampleModel();
	}

	public void loadView() {
		view.loadUiSample(model.getSupportUiType());
	}

	public void onMoveUiView(UiType type) {
		switch (type) {
			case CALENDAR:
				view.moveToCalendar();
				break;
			default:
				break;
		}
	}
}
