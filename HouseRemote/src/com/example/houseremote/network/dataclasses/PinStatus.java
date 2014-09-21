package com.example.houseremote.network.dataclasses;

import com.example.houseremote.interfaces.HeadlessFragmentUI;
import com.example.houseremote.interfaces.UIReadable;

public class PinStatus implements UIReadable {
	private int pinNumber;
	private int pinState;

	public PinStatus(int pinNumber, int pinState) {
		super();
		this.pinNumber = pinNumber;
		this.pinState = pinState;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public int getPinState() {
		return pinState;
	}

	@Override
	public void executeNeededCode(HeadlessFragmentUI headlessFragment) {
		headlessFragment.postValueChange(this);
		
	}

	

}
