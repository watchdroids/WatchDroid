/* This class is for the database model device*/
package com.example.ahe;

public class Device {
	// private variables
	int _id;
	String _name;
	String _device_number;

	// Empty constructor
	public Device() {

	}

	// constructor
	public Device(int id, String name, String _device_number) {
		this._id = id;
		this._name = name;
		this._device_number = _device_number;
	}

	// constructor
	public Device(String name, String _device_number) {
		this._name = name;
		this._device_number = _device_number;
	}

	// getting ID
	public int getID() {
		return this._id;
	}

	// setting id
	public void setID(int id) {
		this._id = id;
	}

	// getting name
	public String getName() {
		return this._name;
	}

	// setting name
	public void setName(String name) {
		this._name = name;
	}

	// getting phone number
	public String getDeviceNumber() {
		return this._device_number;
	}

	// setting phone number
	public void setDeviceNumber(String device_number) {
		this._device_number = device_number;
	}
}
