package com.example.houseremote.fragments.interfaces;

import com.example.houseremote.database.interfaces.DatabaseOperationCompleteListener;
import com.example.houseremote.database.interfaces.QueryManagerProvider;
import com.example.houseremote.network.dataclasses.PinStatus;
import com.example.houseremote.network.dataclasses.PinStatusSet;
import com.example.houseremote.network.interfaces.NetworkReceiveForward;
import com.example.houseremote.network.interfaces.NetworkSendController;

public interface HeadlessFragment extends QueryManagerProvider,DatabaseOperationCompleteListener, NetworkReceiveForward, NetworkSendController{

	void postValueChange(PinStatus pinStatus);
	
	void postLookupValues(PinStatusSet pinStatusSet);

}
