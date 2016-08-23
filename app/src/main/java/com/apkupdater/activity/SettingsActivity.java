package com.apkupdater.activity;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

import com.apkupdater.R;
import com.apkupdater.util.AlarmUtil;

import org.androidannotations.annotations.EActivity;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@EActivity
public class SettingsActivity
	extends PreferenceActivity
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private Context mContext;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	SharedPreferences.OnSharedPreferenceChangeListener mChanges = new SharedPreferences.OnSharedPreferenceChangeListener() {
		@Override
		public void onSharedPreferenceChanged(
			SharedPreferences sharedPreferences,
			String key
		) {
			// Change alarm
			if (key.equals(getString(R.string.preferences_general_alarm_key))) {
				AlarmUtil alarmUtil = new AlarmUtil(mContext);
				alarmUtil.setAlarmFromOptions();
			}
		}
	};

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void onCreate(
		Bundle savedInstanceState
	) {
		super.onCreate(savedInstanceState);

		mContext = getBaseContext();
		PreferenceManager.getDefaultSharedPreferences(mContext).registerOnSharedPreferenceChangeListener(mChanges);
		addPreferencesFromResource(R.xml.preferences);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////