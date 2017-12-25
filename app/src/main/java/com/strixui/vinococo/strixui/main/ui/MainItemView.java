package com.strixui.vinococo.strixui.main.ui;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.strixui.vinococo.strixui.R;
import com.strixui.vinococo.strixui.databinding.ItemMainBinding;
import com.strixui.vinococo.strixui.main.model.UiType;

/**
 * Created by jaemin on 2017. 12. 25..
 */

public class MainItemView extends LinearLayout {
	ItemMainBinding binding;

	public MainItemView(Context context) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		binding = DataBindingUtil.inflate(inflater, R.layout.item_main, this, true);
	}

	public void setItemData(UiType type) {
		if (type != null) {
			binding.itemTitle.setText(type.getName());
		}
	}
}
