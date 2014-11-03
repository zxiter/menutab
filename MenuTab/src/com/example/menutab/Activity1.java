package com.example.menutab;

import com.slidingmenu.lib.SlidingMenu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends Activity implements OnClickListener{
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Context context;
	private Button menubtn;
	private SlidingMenu menu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		context=this;
		menu = new SlidingMenu(this);
		menu.setMode(SlidingMenu.LEFT);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setShadowWidthRes(R.dimen.shadow_width);
		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		View view=LayoutInflater.from(this).inflate(R.layout.menu_item, null);
		menu.setMenu(view);
		bt1=(Button)view.findViewById(R.id.button1);
		bt2=(Button)view.findViewById(R.id.button2);
		bt3=(Button)view.findViewById(R.id.button3);
		menubtn=(Button)findViewById(R.id.menu);
		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		bt3.setOnClickListener(this);
		menubtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Toast.makeText(context, "点我1", 1).show();
			break;
		case R.id.button2:
			Toast.makeText(context, "点我2", 1).show();
			break;
		case R.id.button3:
			Toast.makeText(context, "点我3", 1).show();
			break;
		case R.id.menu:
			menu.toggle();
			break;
		}

	}
}
