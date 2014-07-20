/*Class for the google dork scanner used to scan for vulnerable websites.*/

package com.example.ahe;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class GoogleDorkScanner extends Activity implements OnClickListener {
	String googleDorkTxt;
	Button submit;
	EditText googleDork;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.googledork_layout);
		initalizeVariables();
	}

	private void initalizeVariables() {
		// TODO Auto-generated method stub
		submit = (Button) findViewById(R.id.bSumbit);
		googleDork = (EditText) findViewById(R.id.etGoogleDork);
		submit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bSumbit:
			googleDorkTxt = googleDork.getText().toString();
			try {

			} catch (Exception e) {

			}
			break;
		}
	}

}
