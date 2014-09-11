package com.example.houseremote.observers;

import android.annotation.SuppressLint;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

import com.example.houseremote.interfaces.RoomDatabaseChangeListener;

public class RoomObserver extends ContentObserver {
	
	private RoomDatabaseChangeListener mCallback;

	public RoomObserver(Handler handler,RoomDatabaseChangeListener mCallback) {
		super(handler);
		this.mCallback=mCallback;
	}

	@Override
	public void onChange(boolean selfChange) {
		onChange(selfChange,null);
	}

	@SuppressLint("NewApi")
	@Override
	public void onChange(boolean selfChange, Uri uri) {
		mCallback.roomDatabaseChanged();
		mCallback.controllerDatabaseChanged();
	}


}
