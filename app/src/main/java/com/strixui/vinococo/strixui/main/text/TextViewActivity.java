package com.strixui.vinococo.strixui.main.text;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.strixui.vinococo.strixui.R;

/**
 * Created by jaemin on 2018. 1. 15..
 */

public class TextViewActivity extends AppCompatActivity {

	public static Intent startActivity(Context context) {
		return new Intent(context, TextViewActivity.class);
	}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_activity);
	}


}
