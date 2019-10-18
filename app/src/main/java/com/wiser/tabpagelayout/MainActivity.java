package com.wiser.tabpagelayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wiser.tab.TabLayout;
import com.wiser.tab.TabPageView;
import com.wiser.tab.listener.OnTabClickListener;
import com.wiser.tab.listener.OnTabPageChangeListener;
import com.wiser.tab.listener.OnTabSwitchPageListener;

public class MainActivity extends FragmentActivity implements OnTabPageChangeListener, OnTabClickListener, OnTabSwitchPageListener {

	private TextView tvTab1, tvTab2;

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabLayout tabLayout = findViewById(R.id.tab_layout);

		tvTab1 = findViewById(R.id.tv_tab1);
		tvTab2 = findViewById(R.id.tv_tab2);

		tabLayout.tabIds(R.id.ll_tab1, R.id.ll_tab2).setPages(R.id.tab_page_view, new HomeFragment(), new MineFragment()).isTabCutPageAnim(false).setOnTabPageChangeListener(this)
				.setOnTabClickListener(this).isPageCanScroll(false).setOnTabSwitchPageListener(this).isDefaultOnPageSelected(true);
	}

	@Override public void onPageScrolled(int i, float v, int i1) {

	}

	@Override public void onPageSelected(int i) {
		switch (i) {
			case 0:
				tvTab1.setTextColor(Color.YELLOW);
				tvTab2.setTextColor(Color.BLACK);
				break;
			case 1:
				tvTab1.setTextColor(Color.BLACK);
				tvTab2.setTextColor(Color.YELLOW);
				break;
		}
	}

	@Override public void onPageScrollStateChanged(int i) {

	}

	@Override public void onTabClick(View view) {
		Toast.makeText(this, "点击了" + view.getId(), Toast.LENGTH_LONG).show();
	}

	@Override public void onTabSwitch(View view, int position) {
		Log.d(MainActivity.class.getName(), "切换到了：--->>第" + position + "个位置");
	}

}
