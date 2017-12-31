package com.strixui.vinococo.strixui;

import com.strixui.vinococo.strixui.main.model.UiType;
import com.strixui.vinococo.strixui.main.presenter.MainViewPresenter;
import com.strixui.vinococo.strixui.main.view.MainListView;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by jaemin on 2017. 12. 31..
 */


@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {
	private MainViewPresenter presenter;
	@Mock
	MainListView mainListView;

	@Before
	public void init() {
		presenter = new MainViewPresenter(mainListView);
	}

	@Test
	public void mainViewClick() {
		presenter.onMoveUiView(UiType.CALENDAR);
		Mockito.verify(mainListView).moveToCalendar();
	}

}
