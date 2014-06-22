package com.example.ahe;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class SSH extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ssh_layout);
		// makesure connectbot is installed
		checkConnectBotInstall();
	}

	private boolean appInstalledOrNot(String uri) {
		PackageManager pm = getPackageManager();
		boolean app_installed = false;
		try {
			pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
			app_installed = true;
		} catch (PackageManager.NameNotFoundException e) {
			app_installed = false;
		}
		return app_installed;
	}

	private void checkConnectBotInstall() {
		// TODO Auto-generated method stub
		boolean installed = appInstalledOrNot("org.connectbot");
		if (installed = false) {
			Toast.makeText(SSH.this, "Please install connectbot",
					Toast.LENGTH_LONG).show();
		}
	}

}
