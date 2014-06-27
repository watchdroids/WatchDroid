package com.example.ahe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class SSH extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// makesure connectbot is installed
		// Put the package name here...
		boolean installed = appInstalledOrNot("org.connectbot");
		if (installed) {
			// This intent will help you to launch if the package is already
			// installed
			/*
			 * Intent LaunchIntent = getPackageManager()
			 * .getLaunchIntentForPackage("org.connectbot");
			 * startActivity(LaunchIntent);
			 */

			System.out.println("App already installed on your phone");
		} else {
			System.out.println("App is not installed on your phone");
		}
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
}
