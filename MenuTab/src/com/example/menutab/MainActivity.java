package com.example.menutab;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
public class MainActivity extends TabActivity implements OnCheckedChangeListener{
	private TabHost tabHost;
	private RadioGroup radioderGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost=this.getTabHost();
		tabHost.addTab(tabHost.newTabSpec("1").setIndicator("1").setContent(new Intent(this,Activity1.class)));
		tabHost.addTab(tabHost.newTabSpec("2").setIndicator("2").setContent(new Intent(this,Activity2.class)));
		tabHost.addTab(tabHost.newTabSpec("3").setIndicator("3").setContent(new Intent(this,Activity3.class)));
		tabHost.addTab(tabHost.newTabSpec("4").setIndicator("4").setContent(new Intent(this,Activity4.class)));
		tabHost.addTab(tabHost.newTabSpec("5").setIndicator("5").setContent(new Intent(this,Activity5.class)));

		radioderGroup = (RadioGroup) findViewById(R.id.main_radio);
		radioderGroup.setOnCheckedChangeListener(this);
		radioderGroup.check(R.id.mainTabs_radio_home);//Ĭ�ϵ�һ����ť
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch(checkedId){
		case R.id.mainTabs_radio_home:
			tabHost.setCurrentTabByTag("1");
			break;
		case R.id.mainTabs_radio_msg:
			tabHost.setCurrentTabByTag("2");
			break;
		case R.id.mainTabs_radio_selfInfo:
			tabHost.setCurrentTabByTag("3");
			break;
		case R.id.mainTabs_radio_square:
			tabHost.setCurrentTabByTag("4");
			break;
		case R.id.mainTabs_radio_more:
			tabHost.setCurrentTabByTag("5");
			break;
		}		
		
	}



}
