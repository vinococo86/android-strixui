package com.strixui.vinococo.strixui.main.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.strixui.vinococo.strixui.R;
import com.strixui.vinococo.strixui.databinding.ActivityMainBinding;
import com.strixui.vinococo.strixui.main.model.UiType;
import com.strixui.vinococo.strixui.main.presenter.MainViewPresenter;
import com.strixui.vinococo.strixui.main.text.TextViewActivity;
import com.strixui.vinococo.strixui.main.ui.UiMainRecyclerViewAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainListView {

	private MainViewPresenter presenter;

	private ActivityMainBinding binding;
	private UiMainRecyclerViewAdapter uiMainRecyclerViewAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		init();
		presenter.loadView();
	}


	private void init() {
		presenter = new MainViewPresenter(this);
		initRecyclerView();
	}

	private void initRecyclerView() {
		LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		uiMainRecyclerViewAdapter = new UiMainRecyclerViewAdapter();
		uiMainRecyclerViewAdapter.setOnItemClick(onClickListener);
		binding.mainRecycler.setAdapter(uiMainRecyclerViewAdapter);
		binding.mainRecycler.setLayoutManager(layoutManager);
	}

	@Override
	public void loadUiSample(List<UiType> uiSample) {
		uiMainRecyclerViewAdapter.setData(uiSample);
		uiMainRecyclerViewAdapter.notifyDataSetChanged();
	}

	private View.OnClickListener onClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			if (v.getTag() instanceof UiType) {
				presenter.onMoveUiView((UiType) v.getTag());
			}
		}
	};

	@Override
	public void moveToCalendar() {

	}

	@Override
	public void moveToTextView() {
		startActivity(TextViewActivity.startActivity(this));
	}
}
