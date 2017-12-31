package com.strixui.vinococo.strixui.main.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.strixui.vinococo.strixui.main.model.UiType;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;


/**
 * Created by jaemin on 2017. 12. 25..
 */

public class UiMainRecyclerViewAdapter extends RecyclerView.Adapter<UiMainRecyclerViewAdapter.MainItemViewHolder> {

	List<UiType> uiTypeList;
	View.OnClickListener onItemClick;

	public void setData(List<UiType> data) {
		uiTypeList = data;
	}

	public void setOnItemClick(View.OnClickListener itemClick) {
		onItemClick = itemClick;
	}

	@Override
	public MainItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		MainItemView itemView = new MainItemView(parent.getContext());
		return new MainItemViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(MainItemViewHolder holder, final int position) {
		holder.itemView.setItemData(getItem(position));
		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (onItemClick != null) {
					v.setTag(getItem(position));
					onItemClick.onClick(v);
				}
			}
		});
	}

	@Override
	public int getItemCount() {
		return CollectionUtils.size(uiTypeList);
	}

	private UiType getItem(int position) {
		return CollectionUtils.size(uiTypeList) > position ? uiTypeList.get(position) : null;
	}


	static class MainItemViewHolder extends RecyclerView.ViewHolder {
		private MainItemView itemView;

		public MainItemViewHolder(MainItemView itemView) {
			super(itemView);
			this.itemView = itemView;
		}
	}
}
