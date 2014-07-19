/*This class checks if the device has the applications needed to for an ssh connection*/

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
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						while (true) {
							sleep(1000);
							Intent SSHActivity = new Intent(SSH.this,
									SshConnection.class);
							startActivity(SSHActivity);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			thread.start();

		} else {
			Toast.makeText(SSH.this, "Please download connect bot",
					Toast.LENGTH_LONG).show();
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
