package com.example.ahe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	ListView list;
	SimpleAdapter simpleAdpt;
	List<Map<String, String>> hacksList = new ArrayList<Map<String, String>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initList();
		list = (ListView) findViewById(R.id.lvMain);

		simpleAdpt = new SimpleAdapter(this, hacksList,
				android.R.layout.simple_list_item_1, new String[] { "hack" },
				new int[] { android.R.id.text1 });
		list.setAdapter(simpleAdpt);

		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					// Wifi
					AlertDialog alert = new AlertDialog.Builder(
							MainActivity.this).create();
					alert.setTitle("Choose a device");
					alert.setMessage("Choose which device you would like to use =)");
					alert.setButton("Wifi Pineapple",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									Intent WifiSlideActivity = new Intent(
											MainActivity.this,
											WifiHacking.class);
									Bundle bndlanimation = ActivityOptions
											.makeCustomAnimation(
													getApplicationContext(),
													R.anim.anamation,
													R.anim.anamation2)
											.toBundle();
									startActivity(WifiSlideActivity,
											bndlanimation);
								}
							});
					alert.setButton2("Raspberry pi",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub

								}
							});
					alert.show();
					break;
				case 1:
					// Phone Phreaking
					break;
				case 2:
					// Car Hacking
					break;
				case 3:
					// Web auditing
					break;
				case 4:
					// ssh
					break;
				}
			}
		});
	}

	private void initList() {
		hacksList.add(selectHack("hack", "Wifi"));
		hacksList.add(selectHack("hack", "Phone Phreaking"));
		hacksList.add(selectHack("hack", "Car Hacking"));
		hacksList.add(selectHack("hack", "Web Auditing"));
		hacksList.add(selectHack("hack", "SSH"));
	}

	private HashMap<String, String> selectHack(String key, String name) {
		HashMap<String, String> hack = new HashMap<String, String>();
		hack.put(key, name);

		return hack;
	}
}
